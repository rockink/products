## Product
This is a spring boot application that displays the products. 

It is designed with MVC architecture. 

## Endpoints 
1. `GET /` provides the list of products from the server 
2. `GET /{id}` provides the detail description of the product

## Database 
Uses `Spring Boot Starter Data` package to query/connect to the database. H2 is the memory based storage that we use on this. 

## Central logging
`ApiLogger` uses `Aspect Oriented Programming` to envelope the request/response before sending it back to the client. 
The ApiLogger is designed to only intercept `RestController` class.

## Metrics 
For each call made to the database `ProductRepository` call from the app, it is recorded as a metrics. 

## Demo
You can download it and run via maven or if not, run through the IDE. 


