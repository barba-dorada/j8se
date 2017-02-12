package ru.cwl;


import ru.cwl.ws.gismeteo.locations.LocationInfoFullResult;
import ru.cwl.ws.gismeteo.locations.Locations;
import ru.cwl.ws.gismeteo.locations.LocationsSoap;
import ru.cwl.ws.gismeteo.registration.Register;
import ru.cwl.ws.gismeteo.registration.RegisterResult;
import ru.cwl.ws.gismeteo.registration.RegisterSoap;
import ru.cwl.ws.gismeteo.weather.HHForecastResult;
import ru.cwl.ws.gismeteo.weather.Weather;
import ru.cwl.ws.gismeteo.weather.WeatherSoap;

/**
 * Created by adm on 11.02.2017 16:43.
 */
/*
Запрос информации о погоде рекомендуется выполнять следующим образом:
1. Выполнить регистрацию приложения с использованием метода RegisterHHUser, веб-сервис http://ws.gismeteo.ru/Registration/Register.asmx
2. Полученный ключ использовать в дальнейшем при выполнении запросов
(значение поля key)
3. Выполнить запрос для кода региона с использованием метода FindByNameFull,
веб-сервис http://ws.gismeteo.ru/Locations/Locations.asmx (параметры запроса:
serial - значение, полученное на шаге 2, name – название города, count –
количество результатов в ответе, language – значение «RU»);
4. Взять первый блок подходящий по названию страны блок data/LocationInfoFull,
получить значение поля id
5. Выполнить запрос для получения информации о погоде с использованием метода
GetHHForecast, веб-сервис http://ws.gismeteo.ru/Weather/Weather.asmx
(параметры запроса: serial - значение, полученное на шаге 2, location –
значение поля id, полученное на шаге 4)
6. Забрать значение блока data в ответ.
 */
public class GisMeteoService {
    public static void main(String[] args) {
        new GisMeteoService().run();
    }

    private void run() {
        Register service = new Register();
        RegisterSoap port = service.getRegisterSoap();

        RegisterResult res = port.registerHHUser("vad", "vad20110101@mail.ru", "komp234");
        String key = res.getKey();
        System.out.println(key);

        Locations locationsService = new Locations();
        LocationsSoap locationsPort = locationsService.getLocationsSoap();
        LocationInfoFullResult locRes = locationsPort.findByNameFull(key, "Гжель", 100, "RU");

        int locId = locRes.getData().getLocationInfoFull().get(0).getId();

        Weather weatherService = new Weather();
        WeatherSoap weatherPort = weatherService.getWeatherSoap();
        HHForecastResult re = weatherPort.getHHForecast(key, locId);



    }
    /*private void callWebService() {
        PayerList service = new PayerList();
        PayerListSoap port = service.getPayerListSoap();

        AuthSOAPHeader authSOAPHeader = new AuthSOAPHeader();
        authSOAPHeader.setUser("test");
        authSOAPHeader.setPassword("test");

        String payerList = port.ping(authSOAPHeader);

        System.out.println(payerList);
    }*/

}
