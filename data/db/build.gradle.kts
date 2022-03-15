plugins {
    alias(libs.plugins.kotlin)
}

group = "me.r09i.nito"
version = "unspecified"

dependencies {
    implementation(projects.kernel)

    implementation(libs.bundles.exposed)
}