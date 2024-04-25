package com.jjswigut.personal.styles

import com.jjswigut.personal.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.functions.CSSClamp
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vw

val NameStyle by ComponentStyle {
    base {
        Modifier
            .fontWeight(FontWeight.Light)
            .fontFamily(Res.Font.RubikMonoOne)
            .color(Res.Color.LightText)
            .fontSize(CSSClamp(min = 16.px, value = 4.vw, max = 32.px))
    }
}