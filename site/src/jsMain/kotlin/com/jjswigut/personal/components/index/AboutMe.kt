package com.jjswigut.personal.components.index

import androidx.compose.runtime.Composable
import com.jjswigut.personal.styles.BodyStyle
import com.jjswigut.personal.styles.EmailButtonStyle
import com.jjswigut.personal.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Spacer
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.forms.ButtonStyle
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.breakpoint.displayIfAtLeast
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import kotlinx.browser.window
import org.jetbrains.compose.web.css.px

@Composable
fun AboutMe() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SpanText(modifier = BodyStyle.toModifier().padding(bottom = 16.px), text = Strings.Description1)
        SpanText(modifier = BodyStyle.toModifier().padding(bottom = 16.px), text = Strings.Description2)
        SpanText(modifier = BodyStyle.toModifier().padding(bottom = 24.px), text = Strings.Description3)
        Column(Modifier.fillMaxHeight().displayIfAtLeast(Breakpoint.MD)){}
        Button(
            modifier = EmailButtonStyle.toModifier(),
            size = ButtonSize.LG,
            onClick = { window.location.href = Res.String.Email }
        ) {
            Image(
                modifier = Modifier.margin(right = 12.px),
                src = Res.Icon.Mail
            )
            SpanText(
                modifier = Modifier
                    .fontSize(14.px)
                    .fontWeight(FontWeight.Bold)
                    .fontFamily(Res.Font.Nunito),
                text = Res.String.EmailButtonText
            )
        }
    }
}

private object Strings {
    const val Description1 = "Hey!"
    const val Description2 = "I'm an Android Engineer passionate about building amazing products with a focus on improving the developer experience along the way!"
    const val Description3 = "Drop me a line, I'd love to connect!"
}