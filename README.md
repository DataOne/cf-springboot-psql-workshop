# cf-springboot-psql-workshop

Workshop project that guides users through building a REST API using Spring Boot. The app makes use of a Postgresql database to store and retrieve todo items. Additionally the app is intended to be deployed on Cloud Foundry. 

## How to use this project
On the main branch, the project is completely empty. Go through the steps mentioned below. You will find solutions for each step on the respective branch (`step-n-solution`)

## Prerequisites
* Docker installed 
* Java SDK installed
* Tool for making requests (postman, insomnia, curl)

## step 1 
* Create a new project skeleton using spring initializr (https://start.spring.io)
* Find out which dependencies you will need. 

Hints: 
* Don't use Cloud Connector 
* Use Maven as package manager

## step 2
* Import project into your IDE
* Run the application 

Solution:
* With IntelliJ, File -> Open and then open the folder that you downloaded from spring initializr. 
* For running through IntelliJ, create a new run configuration, choose maven and insert `spring-boot:run` as command line parameter  
* On the CLI simply run `./mwnw spring-boot:run`

## step 3
* Create a REST Endpoint (hello world)
* Run the app and test the endpoint

Hints:
* Don't use the @Controller annotation

## step 4 
* Create an entity that holds a todo entry 
* What do you need additionally for the persistence layer? Create that component

## step 5 
* Run a postgresql server locally. (`docker run -p5432:5432 --name postgres -e POSTGRES_PASSWORD=mysecretpassword -d postgres`)
* Configure the connection to your local postgres server.
* Run your application, it will tell you if the connection to postgres was successful. 

Hint:
* Use application.properties for the connection details

## step 6 
* Create REST endpoints for read and write operations
* Connect everything so that API calls actually make use of postgres
* Test your endpoints

## step 7 
Requirement: App should run locally and in the cloud

* Create a Cloud Foundry manifest.
* How can you configure the db connection for running in Cloud Foundry? Create the configuration
* Create the needed resources on Cloud Foundry.
* Run your app on Cloud Foundry
* Test your application

Hint: 
* You need to use a user provided service on Cloud Foundry
* Use explicit configuration via properties file. 
* https://spring.io/blog/2015/04/27/binding-to-data-services-with-spring-boot-in-cloud-foundry
* https://reflectoring.io/spring-boot-profiles/ 
* You will need at least 1G of memory
* https://docs.cloudfoundry.org/buildpacks/java/getting-started-deploying-apps/gsg-spring.html
* https://docs.cloudfoundry.org/buildpacks/java/java-tips.html
* `./mwmw clean install -DskipTests` creates a .jar artifact under target/ directory

## step 8 - bonus
Try to change the application so that you don't need the explicit configuration via properties file(s).

## Todo
* Configuration in PPT
* Maven basics in PPT
