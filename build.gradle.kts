plugins {
    id("com.android.application") version "7.4.0-alpha10" apply false
    id("com.android.library") version "7.4.0-alpha10" apply false
    id("org.jetbrains.kotlin.android") version "1.7.10" apply false
}

buildscript {
    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.43.2")
    }
}
