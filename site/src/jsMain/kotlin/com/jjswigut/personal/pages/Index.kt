package com.jjswigut.personal.pages

import androidx.compose.runtime.Composable
import com.jjswigut.personal.components.index.CroppedImage
import com.jjswigut.personal.components.index.LargeHomePageLayout
import com.jjswigut.personal.components.index.SharingRow
import com.jjswigut.personal.components.index.SmallHomePageLayout
import com.jjswigut.personal.util.Res
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.css.vw

@Page
@Composable
fun HomePage() {
    val pageContext = rememberPageContext()
    val (mainAlignment, pageComposable) = dynamicLayoutValues(rememberBreakpoint())

    Box(Modifier.width(100.vw).fillMaxHeight().backgroundImage(
        linearGradient(
            dir = LinearGradient.Direction.ToBottom,
            from = Res.Color.BackgroundTopGradient,
            to = Res.Color.BackgroundBottomGradient
        )
    ), contentAlignment = mainAlignment) {
        pageComposable()
    }
}

private fun dynamicLayoutValues(breakpoint: Breakpoint): Pair<Alignment, @Composable () -> Unit> {
    return if (breakpoint >= Breakpoint.MD) {
        Pair(Alignment.Center) { LargeHomePageLayout() }
    } else {
        Pair(Alignment.TopCenter) { SmallHomePageLayout() }
    }
}