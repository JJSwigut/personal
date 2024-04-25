package com.jjswigut.personal.components.index

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxHeight
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.width
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.vw

@Composable
fun SmallHomePageLayout() {
    Column(modifier = Modifier.width(100.vw).fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally) {
        MenuRow()
        ProfileAndSharing()
        AboutMe()
    }
}