plugins {
    id("org.springframework.boot") version "3.1.4"
    id("io.spring.dependency-management") version "1.1.3"
    kotlin("jvm") version "1.8.22"
    kotlin("plugin.spring") version "1.8.22"
}

group = "org.wahlen"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.camunda.bpm.springboot:camunda-bpm-spring-boot-starter-rest:7.20.0")
    implementation("org.camunda.bpm.springboot:camunda-bpm-spring-boot-starter-webapp:7.20.0")
    implementation("org.camunda.bpm:camunda-engine-plugin-spin:7.20.0")
    implementation("org.camunda.spin:camunda-spin-dataformat-all:1.22.0")
    implementation("org.springframework.boot:spring-boot-starter-jdbc")

    runtimeOnly("com.h2database:h2")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
