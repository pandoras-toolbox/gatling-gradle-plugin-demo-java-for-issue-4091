plugins {
    id("java")
    id("io.gatling.gradle") version "3.8.4"
    `java-test-fixtures`
}

dependencies {
    gatlingImplementation(project(":common"))
    gatlingImplementation(testFixtures(project(":common")))
}
