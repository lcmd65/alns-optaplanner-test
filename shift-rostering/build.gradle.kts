plugins {
    kotlin("jvm") version "1.9.0"
    id("org.springframework.boot") version "3.2.0"
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

    testImplementation(kotlin("test"))
    implementation("org.optaplanner:optaplanner-core:9.44.0.Final")
    testImplementation("org.optaplanner:optaplanner-test:9.44.0.Final")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(8)
}