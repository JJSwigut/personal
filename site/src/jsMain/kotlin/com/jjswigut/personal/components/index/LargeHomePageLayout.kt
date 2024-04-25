package com.jjswigut.personal.components.index

import androidx.compose.runtime.Composable
import com.jjswigut.personal.styles.BodyStyle
import com.jjswigut.personal.util.Res
import com.varabyte.kobweb.compose.css.functions.CSSClamp
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vw

@Composable
fun LargeHomePageLayout() {
    Column(
        modifier = Modifier.fillMaxWidth(
            CSSClamp(
                min = 100.px, value = 75.vw, max = Res.Dimen.ProfileCardMaxWidth.px
            )
        )
    ) {
        MenuRow()
        Row(
            modifier = Modifier.boxShadow(
                color = Res.Color.DarkBackground.copy(alpha = 10),
                blurRadius = 50.px,
                spreadRadius = 50.px
            )
                .padding(16.px)
                .borderRadius(16.px)
                .background(Res.Color.DarkBackground)
                .fillMaxWidth()
        ) {
            ProfileAndSharing()
            AboutMe()
        }
    }
}