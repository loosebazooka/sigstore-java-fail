dependencyResolutionManagement { repositories { gradlePluginPortal() } }
rootProject.name = "build-logic"
includeBuild("../build-logic-commons")
include("publishing")
