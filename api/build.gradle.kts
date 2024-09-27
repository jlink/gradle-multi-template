plugins {
    id("buildlogic.java-api-conventions")
}

description = "Example API module"

dependencies {
    api(libs.apiguardian)
    implementation(project(":utilities"))

    testImplementation(libs.junit.jupiter)
}
