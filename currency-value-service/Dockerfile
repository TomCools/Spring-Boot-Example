FROM java:8

COPY target/currency-service.jar currency-service.jar

CMD java -Dserver.port=80 -Dmanagement.port=81 -Deureka.client.service-url.defaultZone=http://$EUREKA_SERVER/eureka -Deureka.instance.prefer-ip-address=true -Deureka.instance.ip-address=$HOST_IP_ADRESS  -Deureka.instance.non-secure-port=$HOST_PORT -jar currency-service.jar

EXPOSE 80 81


#Commands
#docker run -d -p 80:80 --env EUREKA_SERVER='serverip:port' --env HOST_IP_ADRESS='local-ip' --env HOST_PORT=80 --name=someName container-name   --> -d = background

#EUREKA_SERVER: server ip and port of the Eureka Server
#HOST_IP_ADRESS: IP adress of the machine you are running docker on (do not use Localhost!)
#HOST_PORT: port on which you are running the container on the host

#docker build -t .      --> -t = tag