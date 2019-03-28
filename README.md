# spring-boot-microservices

discovery-server
1.	mvn clean
2.	mvn clean install
3.	Go to the target folder
4.	discovery-server build door:
mvn package && java -jar target/discovery-server-0.1.0.jar
5.	start discovery-server door:
mvn spring-boot:run
Open webbrowser  voor http://localhost:8790

 

book-catalog-services
1.	mvn clean
2.	mvn clean install
3.	Go to the target folder
4.	book-catalog-services build door:
mvn package && java -jar target/ book-catalog-services -0.1.0.jar
5.	start book-catalog-services door:
mvn spring-boot:run
 

book-info-services
1.	mvn clean
2.	mvn clean install
3.	Go to the target folder
4.	book-info-servicesbuild door:
mvn package && java -jar target/book-info-services-0.1.0.jar
5.	start book-info-services door:
mvn spring-boot:run
het zelfde doe je met de volgende services

