// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.github.ben-manes.versions") version BuildPluginsVersion.VERSIONS_PLUGIN
    id("org.jmailen.kotlinter") version BuildPluginsVersion.KOTLINTER
}

buildscript {
    dependencies {
        classpath(BuildPluginsVersion.FIREBASE)
        classpath(BuildPluginsVersion.AGP)
        classpath(BuildPluginsVersion.OSS_LICENSE)
        classpath(BuildPluginsVersion.GOOGLE_SERVICES)
        classpath(BuildPluginsVersion.ANDROID_EXTENSIONS)
        classpath(BuildPluginsVersion.KOTLIN_GRADLE)
        classpath(BuildPluginsVersion.KOTLIN_SERIALIZATION)
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
allprojects {
    repositories {
        google()
        mavenCentral()
        maven { setUrl("https://jitpack.io") }
        maven { setUrl("https://plugins.gradle.org/m2/") }
        jcenter()
    }
}


tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}