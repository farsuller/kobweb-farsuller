package com.far.suller.sections

import androidx.compose.runtime.*
import com.far.suller.components.experienceCard
import com.far.suller.components.sectionTitle
import com.far.suller.models.Experience
import com.far.suller.models.Section
import com.far.suller.util.Constants.SECTION_WIDTH
import com.far.suller.util.ObserverViewPortEntered
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun experienceSection(){
    Box(
        modifier = Modifier
            .id(Section.Experience.id)
            .maxWidth(SECTION_WIDTH.px)
            .padding(topBottom = 100.px),
        contentAlignment = Alignment.Center
    ) {
        experienceContent()
    }
}

@Composable
private fun experienceContent(){
    val breakpoint by rememberBreakpoint()
    var animatedMargin by remember { mutableStateOf(200.px) }

    ObserverViewPortEntered(
        sectionId = Section.Experience.id,
        distanceFromTop = 500.0,
        onViewPortEntered = {
            animatedMargin = 50.px
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
                .fillMaxWidth(
                    if (breakpoint >= Breakpoint.MD) 60.percent
                    else 90.percent
                )
                .margin(bottom = 25.px),
            section = Section.Experience
        )
        Experience.values().reversed().forEach { experience ->
            experienceCard(
                breakpoint = breakpoint,
                active = experience == Experience.Fifth,
                experience = experience,
                animatedMargin = animatedMargin
            )
        }
    }
}