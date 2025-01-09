package com.far.suller.sections

import androidx.compose.runtime.*
import com.far.suller.components.sectionTitle
import com.far.suller.components.skillBar
import com.far.suller.models.MeRate
import com.far.suller.models.Section
import com.far.suller.models.Theme
import com.far.suller.styles.AboutImageStyle
import com.far.suller.styles.AboutTextStyle
import com.far.suller.util.Constants
import com.far.suller.util.Constants.ABOUT_ME
import com.far.suller.util.Constants.SECTION_WIDTH
import com.far.suller.util.observerViewPortEntered
import com.far.suller.util.Res
import com.far.suller.util.animateNumbers
import com.varabyte.kobweb.compose.css.FontStyle
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun aboutSection() {
    Box(
        modifier = Modifier
            .id(Section.About.id)
            .maxWidth(SECTION_WIDTH.px)
            .padding(topBottom = 150.px),
        contentAlignment = Alignment.Center
    ) {
        aboutContent()
    }
}

@Composable
private fun aboutContent() {
    val breakpoint = rememberBreakpoint()

    Column(
        modifier = Modifier
            .fillMaxWidth(
                if (breakpoint >= Breakpoint.MD) 100.percent
                else 90.percent
            )
            .maxWidth(1200.px),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        SimpleGrid(
            modifier = Modifier.fillMaxWidth(
                if (breakpoint >= Breakpoint.MD) 90.percent
                else 100.percent
            ),
            numColumns = numColumns(base = 1, md = 2)
        )
        {
            if (breakpoint >= Breakpoint.MD) {
                aboutImage()
            }
            aboutMe()
        }

    }
}

@Composable
private fun aboutImage() {
    Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = AboutImageStyle.toModifier().fillMaxWidth(80.percent),
            src = Res.Image.aboutImage,
        )
    }
}

@Composable
private fun aboutMe() {
    val scope = rememberCoroutineScope()
    var viewPortEntered by remember { mutableStateOf(false) }
    val animatedPercentage = remember { mutableStateListOf(0, 0, 0, 0, 0) }

    observerViewPortEntered(
        sectionId = Section.About.id,
        distanceFromTop = 200.0,
        onViewPortEntered = {
            viewPortEntered = true
            MeRate.values().forEach { skill ->
                scope.launch {
                    animateNumbers(
                        number = skill.percentage.value.toInt(),
                        onUpdate = {
                            animatedPercentage[skill.ordinal] = it
                        }
                    )
                }
            }
        }
    )

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center
    ) {

        sectionTitle(section = Section.About)
        P(
            attrs = AboutTextStyle.toModifier()
                .margin(topBottom = 25.px)
                .maxWidth(500.px)
                .fontFamily(Constants.FONT_FAMILY)
                .fontSize(18.px)
                .fontWeight(FontWeight.Normal)
                .fontStyle(FontStyle.Italic)
                .color(Theme.Secondary.rgb)
                .toAttrs()
        ) {
            Text(ABOUT_ME)
        }
        MeRate.values().forEach { skill ->
            skillBar(
                name = skill.title,
                index = skill.ordinal,
                percentage = if (viewPortEntered) skill.percentage else 0.percent,
                animatedPercentage = if (viewPortEntered) animatedPercentage[skill.ordinal] else 0
            )
        }
    }
}