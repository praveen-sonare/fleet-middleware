plugins {
	java
	id("org.springframework.boot") version "2.7.11"
	id("io.freefair.lombok") version "6.6.3"
}

//group = "com.scooterson"
//version = "0.0.1-SNAPSHOT"

springBoot {
	buildInfo()
}

java {
	sourceCompatibility = JavaVersion.VERSION_17
}


repositories {
	mavenCentral()
}

dependencies {
	implementation(platform("org.springframework.boot:spring-boot-dependencies:2.7.11"))
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-json")
	implementation("net.logstash.logback:logstash-logback-encoder:7.3")
	//implementation("org.springframework.boot:spring-boot-starter-security")
	//implementation("org.springframework.boot:spring-boot-starter-freemarker")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	//implementation("org.springframework.boot:spring-boot-starter-mail")
	//implementation("org.apache.httpcomponents:httpclient:4.5")
	implementation("org.passay:passay:1.4.0")
	//implementation("org.springframework.boot:spring-boot-starter-data-rest")
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("org.springdoc:springdoc-openapi-ui:1.6.14")
	implementation("com.auth0:auth0:1.44.2")


	//developmentOnly("org.springframework.boot:spring-boot-devtools")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
