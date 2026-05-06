plugins { id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0" }
rootProject.name = "sigstore-java-root"
includeBuild("build-logic-commons")
includeBuild("build-logic")
include("sigstore-gradle:sigstore-gradle-sign-base-plugin")
