package com.jjswigut.personal.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.*
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.icons.fa.Fa3
import com.varabyte.kobweb.silk.components.icons.fa.FaSpaghettiMonsterFlying
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import org.w3c.dom.css.CSS

@Page
@Composable
fun HomePage() {
    val pageContext = rememberPageContext()
    var showCoolThing by remember { mutableStateOf(false) }
    Column(
        Modifier.fillMaxSize().background(Color.black),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        H1(attrs = Modifier.padding(all = 16.px).fontSize(40.px).color(Color.whitesmoke).toAttrs {
            onMouseOver {
                showCoolThing = true
            }
            onMouseOut {
                showCoolThing = false
            }
        }) {
            Text("Joshy's Site")
        }
        P(attrs = Modifier.fillMaxWidth().fontSize(24.px).color(Color.whitesmoke).toAttrs()) {
            Row(Modifier.fillMaxWidth().padding(16.px)) {
                Text("Woah")
                Spacer()
                Text("Nelly")
            }
        }

        Button(
            onClick = {
            pageContext.router.navigateTo("/about")
        }) {
            Text("To About Me")
        }

        if (showCoolThing) {
            FaSpaghettiMonsterFlying(Modifier.padding(16.px).color(Color.whitesmoke))
        }


    }
}