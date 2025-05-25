pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "GardenCompanion"
include(":app")

// Core modules
include(":core:common")
include(":core:database")
include(":core:network")
include(":core:design")

// Feature modules
include(":feature:plant-identification")

// Data modules
include(":data:plant-api")
include(":data:local-cache")