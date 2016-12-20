FROM java:8

COPY target/webshop-core-api.jar webshop-core-api.jar

CMD java -Dserver.port=80 -Dmanagement.port=81 -Deureka.client.service-url.defaultZone=http://$EUREKA_SERVER/eureka -jar webshop-core-api.jar

EXPOSE 80 81