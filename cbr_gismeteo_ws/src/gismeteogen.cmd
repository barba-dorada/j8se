set wsi="%java_home%\bin\wsimport"
set param=-extension -keep -XadditionalHeaders -s main/java -Xnocompile
%wsi% %param% -p ru.cwl.ws.gismeteo.registration http://ws.gismeteo.ru/Registration/Register.asmx?WSDL
%wsi% %param% -p ru.cwl.ws.gismeteo.locations http://ws.gismeteo.ru/Locations/Locations.asmx?WSDL
%wsi% %param% -p ru.cwl.ws.gismeteo.weather http://ws.gismeteo.ru/Weather/Weather.asmx?WSDL
