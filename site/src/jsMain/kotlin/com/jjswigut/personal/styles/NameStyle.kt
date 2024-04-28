package com.jjswigut.personal.styles

import com.jjswigut.personal.util.Res
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.css.functions.CSSClamp
import com.varabyte.kobweb.compose.css.functions.LengthColorStopsBuilder
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vw
import org.w3c.dom.css.CSS

val NameStyle by ComponentStyle {
    base {
        Modifier
            .fontWeight(FontWeight.Light)
            .fontFamily(Res.Font.RubikMonoOne)
            .color(Res.Color.LightText)
            .fontSize(CSSClamp(min = 16.px, value = 4.vw, max = 32.px))
            .transition(
                CSSTransition(property = TransitionProperty.All, duration = 100.ms)
            )
    }

    hover {
        Modifier.scale(1.05).cursor(Cursor.Pointer).color(
            Colors.Transparent
        ).backgroundClip(BackgroundClip.Text).backgroundImage(
            linearGradient(
                dir = LinearGradient.Direction.ToBottomRight,
                from = Colors.Coral,
                to = Colors.Aquamarine,
            )
        )
    }
}