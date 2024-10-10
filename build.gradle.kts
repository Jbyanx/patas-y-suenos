plugins {
	java
	id("org.springframework.boot") version "3.3.4"
	id("io.spring.dependency-management") version "1.1.6"
}

group = "org.patasysuenos"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation ("org.mapstruct:mapstruct:1.6.2")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.flywaydb:flyway-core:9.22.0") // Cambia a la última versión
	compileOnly("org.projectlombok:lombok")
	annotationProcessor("org.projectlombok:lombok")
	annotationProcessor ("org.mapstruct:mapstruct-processor:1.6.2")
	annotationProcessor ("org.projectlombok:lombok-mapstruct-binding:0.2.0")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	runtimeOnly("org.postgresql:postgresql")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
