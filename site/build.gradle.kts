import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication
import kotlinx.html.link

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.kobweb.application)
}

group = "com.jjswigut.personal"
version = "1.0-SNAPSHOT"

kobweb {
    app {
        index {
            description.set("The personal site of Joshua Swigut")
            head.add {
                link(rel = "stylesheet", href = "/personal/fonts/fontfaces.css")
            }
        }
    }
}

kotlin {
    configAsKobwebApplication("personal")

    sourceSets {
        commonMain.dependencies {
            implementation(compose.runtime)
        }

        jsMain.dependencies {
            implementation(compose.html.core)
            implementation(libs.kobweb.core)
            implementation(libs.kobweb.silk)
        }
    }
}