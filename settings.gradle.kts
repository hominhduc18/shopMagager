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

rootProject.name = "My Application"
include(":app")
include(":core-network")
include(":core-localsorage")
include(":core-common")
include(":core-data")
include(":coredesign-System")
include(":core-model")
include(":core-theme")
include(":core-navigation")
