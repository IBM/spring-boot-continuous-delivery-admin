# Spring Boot on Bluemix with IBM Continuous Delivery

The goal of this lab is to demonstrate deploying a simple Java web application to Bluemix with a DevOps pipeline for managing the application lifecycle. The goal for the application found here is to demonstrate a self contained, independent microservice that connects to a Cloudant DB database named `sample-java-cloudant-cloudantNoSQLDB`. The microservice's function is to provide an admin interface for searching account entries found in the afore mentioned database instance.

## Application Information

This repository is part of a set of microservices that exist under the naming scheme of [spring-boot-continuous-delivery](https://github.com/IBM/spring-boot-continuous-delivery).

The application found here is deployed in the toolchain found in the main project repository. To view the main repository and its associated README please go to: [https://github.com/IBM/spring-boot-continuous-delivery](https://github.com/IBM/spring-boot-continuous-delivery).

## Steps

The following deploy to Bluemix button will deploy the main application's [toolchain](https://github.com/IBM/spring-boot-continuous-delivery/blob/master/.bluemix/toolchain.yml) which will deploy the current repository in a self contained pipeline.

[![Deploy to Bluemix](https://github.com/IBM/container-journey-template/blob/master/images/button.png)](https://bluemix.net/deploy?repository=https://github.com/IBM/spring-boot-continuous-delivery)
