# Insure Me - DevOps Certification Training Project

## Overview

**Insure Me** is a leading global insurance provider based in the USA. The company offers various insurance products and services including Home Insurance, Health Insurance, Car Insurance, and Life Insurance. Initially utilizing a monolithic application architecture, the company faced difficulties in managing application infrastructure and deployments as it grew. To address these issues, Insure Me decided to transition to a microservice architecture and adopt DevOps practices by implementing a CI/CD pipeline and necessary automations, using AWS as the primary cloud services provider.

## Objectives

The company's primary goals include:
- Delivering frequent product updates to production with high quality and reliability.
- Accelerating software delivery speed and quality.
- Reducing feedback time between developers and testers.

## Current Challenges

1. Building complex builds is difficult.
2. Manual efforts are required to test various components/modules of the project.
3. Incremental builds are difficult to manage, test, and deploy.
4. Manual creation and configuration of infrastructure is time-consuming.
5. Continuous manual monitoring of the application is challenging.

## Project Requirements

To implement a Proof of Concept (POC), develop a Mavenized microservice using Spring Boot and an in-memory H2 database with the following endpoints:

- **Create Policy**
  - Endpoint: `/createPolicy`
  - HTTP Method: `POST`
  - Request Body: JSON

- **Update Policy**
  - Endpoint: `/updatePolicy/{policy id}`
  - HTTP Method: `PUT`
  - Request Body: JSON

- **View Policy**
  - Endpoint: `/viewPolicy/{policy id}`
  - HTTP Method: `GET`
  - Request Body: None

- **Delete Policy**
  - Endpoint: `/deletePolicy/{policy id}`
  - HTTP Method: `DELETE`
  - Request Body: None

## Additional Tasks

1. Write necessary JUnit test cases.
2. Generate HTML reports using TestNG.
3. Push the code to your GitHub repository.
4. Preload some data into the database.

## CI/CD Implementation

### Tools and Technologies

- **Git**: For version control to track changes in the code files.
- **Jenkins**: For continuous integration and continuous deployment.
- **Docker**: For deploying containerized applications.
- **Ansible**: Configuration management tool.
- **Selenium**: For automating tests on the deployed web application.
- **AWS**: For creating EC2 machines as servers and deploying the web application.

