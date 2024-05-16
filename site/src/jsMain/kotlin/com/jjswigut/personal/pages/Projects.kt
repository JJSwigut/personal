package com.jjswigut.personal.pages

import androidx.compose.runtime.Composable
import com.jjswigut.personal.components.PageBackground
import com.jjswigut.personal.components.index.MenuRow
import com.jjswigut.personal.model.Project
import com.jjswigut.personal.styles.HorizontalScroll
import com.jjswigut.personal.util.MyProjects
import com.jjswigut.personal.util.Res
import com.jjswigut.personal.util.dynamicLayoutValues
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.css.functions.CSSClamp
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.hover
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.*

@Page
@Composable
fun Projects() {
    val breakpoint = rememberBreakpoint()
    val (mainAlignment, pageComposable) = dynamicLayoutValues(
        breakpoint = breakpoint,
        largeAlignment = Alignment.TopCenter,
        largeLayout = { ProjectLayout(breakpoint) }
    )
    PageBackground(
        alignment = mainAlignment,
        content = pageComposable
    )
}

@Composable
private fun ProjectLayout(breakpoint: Breakpoint){
    val widthPercentage = if (breakpoint >= Breakpoint.MD) 50.percent else 100.percent

    Column(modifier = Modifier.fillMaxWidth(widthPercentage), horizontalAlignment = Alignment.CenterHorizontally) {
       MenuRow()
       MyProjects.allProjects.forEach { project ->
           Project(breakpoint,project)
       }
    }
}

@Composable
private fun Project(
    breakpoint: Breakpoint,
    project: Project
) {
    with(project) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(top = 16.px),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ProjectHeaderWithLink(text = headerText, linkText = linkText, linkUrl = linkUrl)
            description?.let {}
            ProjectImageRow(breakpoint) {
                images.forEach { imagePath ->
                    Image(src = imagePath, modifier = Modifier.height(50.vh))
                }
            }
        }
    }
}

@Composable
private fun ProjectImageRow(
    breakpoint: Breakpoint,
    content: @Composable RowScope.() -> Unit
){
    val imageArrangement = if(breakpoint >= Breakpoint.MD) Arrangement.Center else Arrangement.Start
    Row(
        modifier = HorizontalScroll.toModifier().width(100.vw).gap(12.px).padding(16.px),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = imageArrangement,
        content = content
    )
}

@Composable
private fun ProjectHeaderWithLink(
    text: String,
    linkText: String,
    linkUrl: String,
){
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        SpanText(
            modifier = ProjectHeaderStyle.toModifier().padding(leftRight = 16.px),
            text = text,
        )
        Linker(
            link = linkUrl,
            text = "($linkText)",
        )
    }
}

@Composable
fun Linker(
    link: String,
    textModifier: Modifier = ProjectLinkStyle.toModifier(),
    text: String,
) {
    val context = rememberPageContext()
    SpanText(
        modifier = textModifier.onClick {
            context.router.navigateTo(link)
        },
        text = text
    )
}

val ProjectHeaderStyle by ComponentStyle {
    base {
        Modifier
            .fontWeight(FontWeight.Normal)
            .fontFamily(Res.Font.RubikMonoOne)
            .color(Res.Color.LightText)
            .fontSize(CSSClamp(min = 12.px, value = 3.vw, max = 28.px))
    }
}

val ProjectLinkStyle by ComponentStyle {
    base {
        Modifier
            .fontWeight(FontWeight.Normal)
            .fontFamily(Res.Font.Nunito)
            .color(Res.Color.LightText)
            .fontSize(CSSClamp(min = 10.px, value = 3.vw, max = 24.px))
    }

    hover {
        Modifier
            .borderBottom(
                width = 1.px,
                style = LineStyle.Solid,
                color = Res.Color.LightText
            )
            .cursor(Cursor.Pointer)
    }
}