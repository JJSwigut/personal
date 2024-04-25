package com.jjswigut.personal.styles

import com.jjswigut.personal.util.Res
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TransitionProperty
import com.varabyte.kobweb.compose.css.functions.CSSClamp
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vw

val MenuStyle by ComponentStyle {
    base {
        Modifier
            .fontWeight(FontWeight.Normal)
            .fontFamily(Res.Font.RubikMonoOne)
            .color(Res.Color.LightText)
            .fontSize(CSSClamp(min = 12.px, value = 2.vw, max = 24.px))
            .transition(
                CSSTransition(property = TransitionProperty.All, duration = 100.ms),
            )
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