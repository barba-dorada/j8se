import sun.misc.BASE64Encoder;
import sun.misc.CharacterEncoder;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by tischenko on 10.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();

        /*
        header = '{"alg":"HS256","typ":"JWT"}'
HS256 indicates that this token is signed using HMAC-SHA256.

The payload contains the claims that we wish to make:

payload = '{"loggedInAs":"admin","iat":1422779638}'
As suggested in the JWT spec, we include a timestamp called iat, short for "issued at".

The signature is calculated by base64url encoding the header and payload and concatenating them with a period as a separator:

key           = 'secretkey'
unsignedToken = encodeBase64(header) + '.' + encodeBase64(payload)
signature     = HMAC-SHA256(key, unsignedToken)
To put it all together, we base64url encode the signature, and join together the three parts using periods:

token = encodeBase64(header) + '.' + encodeBase64(payload) + '.' + encodeBase64(signature)
# token is now: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJsb2dnZWRJbkFzIjoiYWRtaW4iLCJpYXQiOjE0MjI3Nzk2Mzh9.gzSraSYS8EXBxLN_oWnFSRgCzcmJmMjLiuyu5CSpyHI
         */

// https://jwt.io/
    }

    private void run() {
        String header = "{\"alg\":\"HS256\",\"typ\":\"JWT\"}";
        String payload = "{\"loggedInAs\":\"admin\",\"iat\":1422779638}";
        CharacterEncoder en = new BASE64Encoder();
        System.out.println(encodeBase64(header));
        System.out.println(encodeBase64(payload));
        String key = "secretkey";
        String unsignedToken = encodeBase64(header) + '.' + encodeBase64(payload);
        System.out.println(unsignedToken);
        System.out.println();

        final String sign = encodeBase64(calcSignature2(key, unsignedToken));
        System.out.println(sign);
        final String jwt = unsignedToken + '.' + sign;
        System.out.println(jwt);


    }
    String encodeBase64(String in){
        CharacterEncoder en = new BASE64Encoder();
        return en.encode(in.getBytes());
    }

    String encodeBase64(byte in[]){
        CharacterEncoder en = new BASE64Encoder();
        return en.encode(in);
    }


    String calcSignature(String secretToken,final String data)  {
        try {
            final Mac hMacSHA256 = Mac.getInstance("HmacSHA256");
            byte[] hmacKeyBytes = secretToken.getBytes(StandardCharsets.UTF_8);
            final SecretKeySpec secretKey = new SecretKeySpec(hmacKeyBytes, "HmacSHA256");
            hMacSHA256.init(secretKey);
            byte[] dataBytes = data.getBytes(StandardCharsets.UTF_8);
            byte[] res = hMacSHA256.doFinal(dataBytes);
            return bytesToHex(res);

        } catch ( NoSuchAlgorithmException | InvalidKeyException e) {
          // re log.error("checksum calculation error!", e);
            return "";
        }
        //throw HttpError.badRequest("checksum calculation error!");
    }

    byte[] calcSignature2(String secretToken, final String data)  {
        try {
            final Mac hMacSHA256 = Mac.getInstance("HmacSHA256");
            byte[] hmacKeyBytes = secretToken.getBytes(StandardCharsets.UTF_8);
            final SecretKeySpec secretKey = new SecretKeySpec(hmacKeyBytes, "HmacSHA256");
            hMacSHA256.init(secretKey);
            byte[] dataBytes = data.getBytes(StandardCharsets.UTF_8);
            byte[] res = hMacSHA256.doFinal(dataBytes);
            return res;

        } catch ( NoSuchAlgorithmException | InvalidKeyException e) {
            return null;
        }
    }


    final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();
    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for ( int j = 0; j < bytes.length; j++ ) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }

}
