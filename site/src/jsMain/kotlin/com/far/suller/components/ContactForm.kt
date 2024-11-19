package com.far.suller.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.far.suller.models.Theme
import com.far.suller.styles.InputStyle
import com.far.suller.styles.MainButtonStyle
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.attrsModifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import kotlinx.browser.window
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.*

@Composable
fun contactForm(breakpoint: Breakpoint) {

    val name by remember { mutableStateOf("") }
    val email by remember { mutableStateOf("") }
    val message by remember { mutableStateOf("") }


    Form(
        attrs = Modifier
            .attr("action", "#")
            .toAttrs()
    ) {

        Label(
            attrs = Modifier
                .classNames("form-label")
                .toAttrs(),
            forId = "inputName"
        ) {
            Text("Name")
        }


        TextInput(
            value = name,
            attrs = InputStyle
                .toModifier()
                .id("inputName")
                .classNames("form-control")
                .margin(bottom = 10.px)
                .width(
                    if (breakpoint >= Breakpoint.MD) 500.px
                    else 250.px
                )
                .backgroundColor(Theme.LighterGray.rgb)
                .boxShadow(0.px, 0.px, 0.px, 0.px, null)
                .attrsModifier {
                    attr("placeholder", "Full Name")
                    attr("name", "name")
                    attr("required", "true")
                }
                .toAttrs()
        )


        Label(
            attrs = Modifier
                .classNames("form-label")
                .toAttrs(),
            forId = "inputEmail"
        ) {
            Text("Email")
        }
        EmailInput(
            value = email,
            attrs = InputStyle
                .toModifier()
                .id("inputEmail")
                .classNames("form-control")
                .margin(bottom = 10.px)
                .width(
                    if (breakpoint >= Breakpoint.MD) 500.px
                    else 250.px
                )
                .backgroundColor(Theme.LighterGray.rgb)
                .boxShadow(0.px, 0.px, 0.px, 0.px, null)
                .attrsModifier {
                    attr("placeholder", "Email Address")
                    attr("name", "email")
                    attr("required", "true")
                }
                .toAttrs()
        )


        Label(
            attrs = Modifier
                .classNames("form-label")
                .toAttrs(),
            forId = "inputMessage"
        ) {
            Text("Message")
        }

        TextArea(
            value = message,
            attrs = InputStyle
                .toModifier()
                .id("inputMessage")
                .classNames("form-control")
                .margin(bottom = 20.px)
                .height(150.px)
                .width(
                    if (breakpoint >= Breakpoint.MD) 500.px
                    else 250.px
                )
                .backgroundColor(Theme.LighterGray.rgb)
                .boxShadow(0.px, 0.px, 0.px, 0.px, null)
                .attrsModifier {
                    attr("placeholder", "Your Message")
                    attr("name", "message")
                    attr("required", "true")
                }
                .toAttrs()
        )
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Button(
                attrs = MainButtonStyle
                    .toModifier()
                    .height(40.px)
                    .border(width = 0.px)
                    .borderRadius(r = 5.px)
                    .backgroundColor(Theme.Primary.rgb)
                    .color(Colors.White)
                    .cursor(Cursor.Pointer)
                    .toAttrs()
            ) {
                Text("Submit")
            }
        }

        if (name.isNotEmpty() && email.isNotEmpty() && message.isNotEmpty()) {
            val mailTo = "mailto:florence.suller@gmail.com" +
                    "?subject=Message%20from%20Contact%20Form" +
                    "&body=Name%3A%20$name%0AEmail%3A%20$email%0AMessage%3A%20$message"
            // Opens the Gmail compose window with pre-filled information
            window.location.href = mailTo
        }
    }
}