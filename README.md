# Spring Boot Hello World API

This is a small Spring-Boot Hello World application to demonstrate a quick and simple deployment via MTA on CloudFoundry.

## Requirements
 * Java 1.8
 * Maven
 * CloudFoundry CLI
 * Docker
 

## Command Used 
* docker pull devxci/mbtci-java11-node14
* docker run --rm -v /c/WorkArea/GitHub/mta-demo:/app devxci/mbtci-java11-node14 mbt build -s /app/
* cf deploy com.testing_1.0.0.mtar
