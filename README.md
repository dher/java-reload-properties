# java-reload-properties

## How to
1. move folder `properties` to your directory (e.g: `/opt/properties`)
2. edit `-DCONFIG_DIR=<path-directory>` in `pom.xml` to your properties directory (e.g: `-DCONFIG_DIR=/opt/properties`)
3. run `mvn spring-boot:run`
4. check api `http://localhost:8080/ping-prop` and `http://localhost:8080/ping-service` via browser or postman  
5. you can edit value `message` in file `application-external.properties`, then save it. 
6. this word `File application-external.properties changed` should appear in terminal/log.
![alt text](https://github.com/dher/image-online/blob/master/image1.png)
7. when you re-check api on point number 4, it will show the new message  
  
