# Project 생성

- ### 개발환경
  - macOs Monterey
  - Java 11
  - IDE: Intellij

- ### Spring-boot
  - https://start.spring.io
  - Project: Gradle Project
  - Spring Boot: 2.6.2
  - Packaging: jar
  - Dependencies: X -> 나중에 진행하면서 추가할 예정


- ### build.gradle
    ``` java
    plugins {
        id 'org.springframework.boot' version '2.6.2'
        id 'io.spring.dependency-management' version '1.0.11.RELEASE'
        id 'java'
    }
    
    group = 'spring'
    version = '0.0.1-SNAPSHOT'
    sourceCompatibility = '11'
    
    repositories {
        mavenCentral()
    }
    
    dependencies {
        implementation 'org.springframework.boot:spring-boot-starter'
        implementation 'org.testng:testng:7.1.0'
        testImplementation 'org.springframework.boot:spring-boot-starter-test'
    }
    
    test {
        useJUnitPlatform()
    }
    
    ```