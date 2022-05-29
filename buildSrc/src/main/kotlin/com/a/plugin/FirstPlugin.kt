package com.a.plugin

import com.android.build.api.variant.ApplicationVariant
import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class FirstPlugin :Plugin<Project> {
    override fun apply(project: Project) {
        println("hello first plugin")
        println("project name ${project.name}")
        var appExtension = project.extensions.getByType(AppExtension::class.java)

        appExtension.applicationVariants.all { variant->
            if(variant is ApplicationVariant){
                println("version code:${variant.versionCode}")
                println("applicationId:${variant.applicationId}")
            }


        }


    }
}