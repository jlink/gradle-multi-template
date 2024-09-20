plugins {
    id("buildlogic.java-api-conventions")
}

description = "Example API module"

dependencies {
    implementation(project(":utilities"))
}