FROM java:8

COPY target/eureka-service-discovery.jar eureka-service-discovery.jar

CMD java -Dserver.port=80 -jar eureka-service-discovery.jar

EXPOSE 80


#Commands
#docker build -t eureka-service-discovery .      --> -t = tag
#docker run -d -p 9000:80 --name=instance-name eureka-service-discovery    --> -d = background
