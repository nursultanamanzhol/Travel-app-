@file:Suppress("DSL_SCOPE_VIOLATION")

buildscript {
    dependencies {
        classpath(libs.google.services)
    }
}
plugins {
    alias(libs.plugins.android.application) apply false
}