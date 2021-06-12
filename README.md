# car_factory
<br/><b>Java Version:</b> 11
<br/><b>SpringBoot version:</b> 2.5.1

<b>To start project:</b>
./mvnw spring-boot:run

<b>To run test</b>
 ./mvnw test

After project start:

In the browser, call the following links:
  <br/>http://localhost:8080/car/produce/sedan
  <br/><b>Output:</b> Sedan Car has produced.
 
  <br/>http://localhost:8080/car/produce/cabrio
  <br/><b>Output:</b> Cabrio Car has produced.
 
  <br/>http://localhost:8080/car/produce/hatchback
  <br/><b>Output:</b> Hatchback Car has produced.
 
  <br/>http://localhost:8080/car/produce/null(Any value, except(Sedan,Cabrio,Hatchback))
  <br/><b>Output:</b> No Car has produced.
