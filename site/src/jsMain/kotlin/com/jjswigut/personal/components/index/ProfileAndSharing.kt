package com.jjswigut.personal.components.index

import androidx.compose.runtime.Composable
import com.jjswigut.personal.util.Res
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.padding
import org.jetbrains.compose.web.css.px

@Composable
fun ProfileAndSharing() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        CroppedImage(
            modifier = Modifier.padding(16.px),
            src = Res.Image.ProfilePic
        )
        SharingRow()
    }
}