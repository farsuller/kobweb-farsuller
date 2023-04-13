package com.far.suller.sections

import androidx.compose.runtime.*
import com.far.suller.components.contactForm
import com.far.suller.components.sectionTitle
import com.far.suller.models.Section
import com.far.suller.util.Constants.SECTION_WIDTH
import com.far.suller.util.ObserverViewPortEntered
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun contactSection(){
    Box(
        modifier = Modifier
            .id(Section.Contact.id)
            .maxWidth(SECTION_WIDTH.px)
            .padding(topBottom = 100.px),
        contentAlignment = Alignment.Center
    ) {
        contactContent()
    }
}

@OptIn(ExperimentalComposeWebApi::class)
@Composable
private fun contactContent(){
    val breakpoint by rememberBreakpoint()
    val scope = rememberCoroutineScope()
    var animatedRotation by remember { mutableStateOf(0.deg) }

    ObserverViewPortEntered(
        sectionId = Section.Contact.id,
        distanceFromTop = 500.0,
        onViewPortEntered = {
            animatedRotation = 10.deg
            scope.launch {
                delay(500)
                animatedRotation = 0.deg
            }
        }
    )
    Column(
        modifier = Modifier
            .fillMaxWidth(
                if(breakpoint >= Breakpoint.MD) 100.percent
                else 90.percent),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        sectionTitle(
            modifier = Modifier
                .fillMaxWidth()
                .margin(bottom = 25.px)
                .transform {
                           rotate(animatedRotation)
                }
                .transition(CSSTransition("transform", duration = 500.ms)),
            section = Section.Contact,
            alignment = Alignment.CenterHorizontally)

        contactForm(breakpoint)
    }
}
