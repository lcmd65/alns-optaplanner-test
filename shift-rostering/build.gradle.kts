plugins {
    kotlin("jvm") version "2.0.0"
}

group = "com.ft.aio.template.adapter.output.web.scrippt"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.optaplanner:optaplanner-core:8.37.0.Final")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(8)
}