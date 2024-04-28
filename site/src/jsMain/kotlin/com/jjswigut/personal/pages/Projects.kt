package com.jjswigut.personal.pages

import androidx.compose.runtime.Composable
import com.jjswigut.personal.components.PageBackground
import com.jjswigut.personal.components.index.MenuRow
import com.jjswigut.personal.util.dynamicLayoutValues
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.GridAutoFlow.Column
import org.jetbrains.compose.web.css.percent

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
        SpanText("Coming Soon!")
    }
}

@Composable
private fun ProjectList() {

}

@Composable
private fun ProjectTemplate() {

}