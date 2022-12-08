plugins {
    id("base")
}

//gatling {
//    // WARNING: options below only work when logback config file isn't provided
//    logLevel = "WARN" // logback root level
//    logHttp = "NONE" // set to 'ALL' for all HTTP traffic in TRACE, 'FAILURES' for failed HTTP traffic in DEBUG
//    enterprise {
//        // Enterprise Cloud (https://cloud.gatling.io/) configuration reference: https://gatling.io/docs/gatling/reference/current/extensions/gradle_plugin/#working-with-gatling-enterprise-cloud
//        // Enterprise Self-Hosted configuration reference: https://gatling.io/docs/gatling/reference/current/extensions/gradle_plugin/#working-with-gatling-enterprise-self-hosted
//    }
//}

allprojects {
    repositories {
        mavenCentral()
    }
}
