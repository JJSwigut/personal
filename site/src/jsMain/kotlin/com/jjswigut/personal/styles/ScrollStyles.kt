package com.jjswigut.personal.styles

import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.overflow
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.base

val HorizontalScroll by ComponentStyle.base {
    Modifier.overflow(overflowX = Overflow.Auto, overflowY = Overflow.Visible)
}

val VerticalScroll by ComponentStyle.base {
    Modifier.overflow(overflowX = Overflow.Visible, overflowY = Overflow.Auto)
}