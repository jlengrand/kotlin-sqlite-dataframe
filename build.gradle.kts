plugins {
    kotlin("jvm") version "2.0.21"
    id("org.jetbrains.kotlinx.dataframe") version "0.15.0"
}

group = "nl.lengrand"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.xerial:sqlite-jdbc:3.47.1.0")
    implementation("org.jetbrains.kotlinx:dataframe:0.15.0")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}