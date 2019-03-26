## Product
This is a spring boot application that displays the products. 

It is designed with MVC architecture. 

## Endpoints 
1. `GET /` provides the list of products from the server 
2. `GET /{id}` provides the detail description of the product

## Database 
Products are stored in a database. Currently, H2 database is used. 
However, the application is designed with `spring-data`, which gives 
us the flexibility to use any other database options. 

## Demo
The demo is hosted in OpenShift via Kubernetes Cluster, 
and you can find it here at 
[Product Site](https://product-shopping.1d35.starter-us-east-1.openshiftapps.com)



