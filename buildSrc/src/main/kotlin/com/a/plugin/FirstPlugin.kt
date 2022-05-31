package com.a.plugin

import com.android.build.api.variant.AndroidComponentsExtension
import com.android.build.api.variant.ApplicationVariant
import org.gradle.api.Plugin
import org.gradle.api.Project

class FirstPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        println("hello first plugin")
        println("project name ${project.name}")

        var appExtension = project.extensions.getByType(AndroidComponentsExtension::class.java)
        appExtension.onVariants {  variant ->
            if (variant is ApplicationVariant) {
                println("---buildType:${variant.buildType}---")
                println("minSdkVersion:${variant.minSdkVersion.apiLevel}")
                println("applicationId:${variant.applicationId.get()}")
            }
        }
    }
}