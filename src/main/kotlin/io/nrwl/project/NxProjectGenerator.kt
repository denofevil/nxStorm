package io.nrwl.project

import com.intellij.execution.filters.Filter
import com.intellij.lang.javascript.boilerplate.NpmPackageProjectGenerator
import com.intellij.openapi.project.Project
import com.intellij.openapi.roots.ContentEntry
import com.intellij.openapi.util.IconLoader
import com.intellij.openapi.vfs.VirtualFile
import javax.swing.Icon

class NxProjectGenerator : NpmPackageProjectGenerator() {
    override fun getName(): String = "nx Project"
    override fun getDescription() = "Nx is designed to help you create and build enterprise grade Angular applications. It provides an opinionated approach to application project structure and patterns."
    override fun packageName(): String = "@nrwl/schematics"
    override fun presentablePackageName() = "nx &Schematics"
    override fun getIcon(): Icon {
        return IconLoader.getIcon("/icons/nx-logo.png")
    }

    override fun executable(p0: String?): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun customizeModule(p0: VirtualFile, p1: ContentEntry?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun filters(p0: Project, p1: VirtualFile): Array<Filter> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun generatorArgs(p0: Project, p1: VirtualFile): Array<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}