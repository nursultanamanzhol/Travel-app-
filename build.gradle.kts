@file:Suppress("DSL_SCOPE_VIOLATION")

buildscript {
    dependencies {
        classpath("com.google.gms:google-services:4.4.2")
    }
}
plugins {
    alias(libs.plugins.android.application) apply false
}