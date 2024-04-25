package com.jjswigut.personal.components.index

import androidx.compose.runtime.Composable
import com.jjswigut.personal.styles.MenuStyle
import com.jjswigut.personal.styles.NameStyle
import com.jjswigut.personal.util.MenuItems
import com.jjswigut.personal.util.Res
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.vw


@Composable
fun MenuRow() {
    Row(modifier = Modifier.fillMaxWidth().padding(16.px), verticalAlignment = Alignment.Bottom) {
        SpanText(
            modifier = NameStyle.toModifier().padding(right = 16.px),
            text = Res.String.FullName,
        )
        Spacer()
        Row(Modifier.height(26.px).gap(12.px), verticalAlignment = Alignment.CenterVertically) {
            MenuItems.entries.forEach { menuItem ->
                SpanText(
                    modifier = MenuStyle.toModifier(),
                    text = menuItem.title,
                )
            }
        }
    }
}