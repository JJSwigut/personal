package com.jjswigut.personal.styles

import com.jjswigut.personal.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.functions.CSSClamp
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vw

val BodyStyle by ComponentStyle {
    base {
        Modifier
            .fontFamily(Res.Font.Nunito)
            .textAlign(TextAlign.Center)
            .color(Res.Color.LightText)
            .fontSize(CSSClamp(min = 12.px, value = 2.vw, max = 20.px))
    }
}