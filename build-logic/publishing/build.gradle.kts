plugins { id("build-logic.kotlin-dsl-gradle-plugin") }
repositories { gradlePluginPortal(); mavenCentral() }
dependencies {
    implementation("dev.sigstore.build-logic:gradle-plugin")
    implementation("dev.sigstore:sigstore-gradle-sign-plugin:2.0.0")
}
