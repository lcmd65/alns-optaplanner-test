plugins {
    kotlin("jvm") version "1.9.0"
    id("org.springframework.boot") version "2.7.10"
    id("io.spring.dependency-management") version "1.1.0"
    kotlin("plugin.spring") version "1.9.0"
    kotlin("plugin.jpa") version "1.9.0"
}

group = "com.ft.aio.template.adapter.output.web.scrippt"
version = "1.0-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
}

dependencies {

    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.postgresql:postgresql")

    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.hibernate:hibernate-core:5.6.10.Final")
    implementation("com.h2database:h2")

    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("org.apache.poi:poi:5.2.3")
    implementation("org.apache.poi:poi-ooxml:5.2.3")

    testImplementation(kotlin("test"))
    implementation("org.optaplanner:optaplanner-core:9.44.0.Final")
    testImplementation("org.optaplanner:optaplanner-test:9.44.0.Final")
    implementation("org.slf4j:slf4j-simple:1.7.36")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(8)
}