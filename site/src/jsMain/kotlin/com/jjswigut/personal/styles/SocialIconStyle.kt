package com.jjswigut.personal.styles

import com.jjswigut.personal.util.Res
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.silk.components.style.hover
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.rotate
import com.varabyte.kobweb.compose.ui.modifiers.scale
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val SocialIconStyle by ComponentStyle {
    base {
        Modifier
            .rotate(0.deg)
            .background(Colors.Transparent)
            .transition(
                CSSTransition(property = "rotate", duration = 300.ms),
                CSSTransition(property = "background", duration = 300.ms)
            )
    }
    hover {
        Modifier
            .rotate(10.deg)
            .scale(1.2)
    }
}