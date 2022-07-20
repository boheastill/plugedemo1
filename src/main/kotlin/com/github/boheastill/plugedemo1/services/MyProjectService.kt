package com.github.boheastill.plugedemo1.services

import com.intellij.openapi.project.Project
import com.github.boheastill.plugedemo1.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
