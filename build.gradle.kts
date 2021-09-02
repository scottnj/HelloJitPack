plugins {
    kotlin("jvm") version "1.5.21"
    id("maven")
}

group = "com.github.scottnj"
version = "0.0.5"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation("org.junit.jupiter:junit-jupiter:5.7.2")
}

tasks.test {
    useJUnitPlatform()
}