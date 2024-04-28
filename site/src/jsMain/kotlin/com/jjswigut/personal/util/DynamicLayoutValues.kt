package com.jjswigut.personal.util

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint

fun dynamicLayoutValues(
    breakpoint: Breakpoint,
    largeAlignment: Alignment = Alignment.Center,
    smallAlignment: Alignment = Alignment.TopCenter,
    largeLayout: @Composable () -> Unit,
    smallLayout: @Composable (() -> Unit)? = null,
): Pair<Alignment, @Composable () -> Unit> {
    return if (breakpoint >= Breakpoint.MD) {
        Pair(largeAlignment) { largeLayout() }
    } else {
        Pair(smallAlignment) { smallLayout?.invoke() ?: largeLayout() }
    }
}