package com.jjswigut.personal.components.index

import androidx.compose.runtime.Composable
import com.jjswigut.personal.components.IconButton
import com.jjswigut.personal.styles.SocialIconStyle
import com.jjswigut.personal.util.SocialIcons
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.px

@Composable
fun SharingRow(){
    Row(
        modifier = Modifier.fillMaxWidth().gap(12.px),
        horizontalArrangement = Arrangement.Center
    ) {
        SocialIcons.entries.forEach { icon ->
            IconButton(
                modifier = SocialIconStyle.toModifier(),
                link = icon.link,
                icon = icon.iconRes
            )
        }
    }
}