plugins {
    id("java")
    id("io.gatling.gradle") version "3.8.4"
    `java-test-fixtures`
}

// Commented because of:
// Cannot access 'io.gatling.gradle.JvmConfigurable.Trait.FieldHelper' which is a supertype of 'io.gatling.gradle.GatlingPluginExtension'. Check your module classpath for missing or conflicting dependencies
//gatling {
//    // WARNING: options below only work when logback config file isn't provided
//    logLevel = "WARN" // logback root level
//    logHttp = "NONE" // set to 'ALL' for all HTTP traffic in TRACE, 'FAILURES' for failed HTTP traffic in DEBUG
//}

dependencies {
    gatlingImplementation(project(":common"))
    gatlingImplementation(testFixtures(project(":common")))
}
