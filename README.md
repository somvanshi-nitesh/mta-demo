# Spring Boot Hello World

**A simple Spring Boot 2.x app to send hello world message which is deployed using MTA on CloudFoundry**

## Requirements
 * Java 11
 * Maven
 * CloudFoundry CLI
 * Docker
 

## Command Used 
* docker pull devxci/mbtci-java11-node14
* docker run --rm -v {project:directory}:/app devxci/mbtci-java11-node14 mbt build -s /app/
* (Replace {project:directory} with your working directory)

* cf deploy com.testing_1.0.0.mtar
