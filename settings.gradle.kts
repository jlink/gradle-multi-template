pluginManagement {
    includeBuild("gradle/plugins")
}

plugins {
    // Apply the foojay-resolver plugin to allow automatic download of JDKs
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "gradle-multi-template"

include("api", "utilities")
