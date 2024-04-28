package com.jjswigut.personal.components

import androidx.compose.runtime.Composable
import com.jjswigut.personal.util.Res
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundImage
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxHeight
import com.varabyte.kobweb.compose.ui.modifiers.width
import org.jetbrains.compose.web.css.vw

@Composable
fun PageBackground(
    alignment: Alignment,
    content: @Composable () -> Unit
) {
    Box(
        Modifier.width(100.vw).fillMaxHeight().backgroundImage(
            linearGradient(
                dir = LinearGradient.Direction.ToBottom,
                from = Res.Color.BackgroundTopGradient,
                to = Res.Color.BackgroundBottomGradient
            )
        ), contentAlignment = alignment
    ) {
        content()
    }
}