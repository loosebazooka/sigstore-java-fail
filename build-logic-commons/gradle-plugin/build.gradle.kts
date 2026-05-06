import org.gradle.kotlin.dsl.support.expectedKotlinDslPluginsVersion
plugins { `kotlin-dsl` }
group = "dev.sigstore.build-logic"
dependencies {
    implementation("org.gradle.kotlin.kotlin-dsl:org.gradle.kotlin.kotlin-dsl.gradle.plugin:$expectedKotlinDslPluginsVersion")
}
