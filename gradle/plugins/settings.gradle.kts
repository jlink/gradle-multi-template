dependencyResolutionManagement {
    // Reuse version catalog from the main build.
    versionCatalogs {
        register("libs", { from(files("../libs.versions.toml")) })
    }
}

rootProject.name = "buildSrc"
