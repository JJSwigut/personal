package com.jjswigut.personal.components.index

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.theme.shapes.Circle
import com.varabyte.kobweb.silk.theme.shapes.CircleF
import com.varabyte.kobweb.silk.theme.shapes.CirclePath
import com.varabyte.kobweb.silk.theme.shapes.clip
import org.jetbrains.compose.web.css.percent

@Composable
fun CroppedImage(
    modifier: Modifier = Modifier,
    src: String
){
    Image(
        src = src,
        modifier = modifier.fillMaxWidth(80.percent).objectFit(ObjectFit.Cover).borderRadius(50.percent)
    )
}