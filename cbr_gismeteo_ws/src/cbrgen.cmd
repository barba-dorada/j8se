set wsi="%java_home%\bin\wsimport"
set param=-extension -keep -XadditionalHeaders -s main/java -Xnocompile  
rem  -B
%wsi% %param% -p ru.cwl.ws.cbr.dailyinfo DailyInfo.wsdl

