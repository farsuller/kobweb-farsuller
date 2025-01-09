package com.far.suller.components

import androidx.compose.runtime.*
import com.far.suller.models.Section
import com.far.suller.models.Theme
import com.far.suller.util.Constants
import com.far.suller.util.observerViewPortEntered
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun sectionTitle(
    modifier: Modifier = Modifier,
    section: Section,
    alignment: Alignment.Horizontal = Alignment.Start
) {
    val scope = rememberCoroutineScope()
    var titleMargin by remember { mutableStateOf(50.px) }
    var subTitleMargin by remember { mutableStateOf(50.px) }

    observerViewPortEntered(
        sectionId = section.id,
        distanceFromTop = 700.0,
        onViewPortEntered = {
            scope.launch {
                subTitleMargin = 0.px
                if (alignment == Alignment.Start) {
                    delay(25)
                }
                titleMargin = 0.px

            }
        }
    )

    Column(
        modifier = modifier,
        horizontalAlignment = alignment
    )
    {
        P(
            attrs = Modifier
                .fillMaxWidth()
                .textAlign(
                    when (alignment) {
                        Alignment.CenterHorizontally -> TextAlign.Center
                        Alignment.End -> TextAlign.End
                        else -> TextAlign.Start
                    }
                )
                .margin(
                    left = titleMargin,
                    top = 0.px,
                    bottom = 0.px
                )
                .fontFamily(Constants.FONT_FAMILY)
                .fontSize(25.px)
                .fontWeight(FontWeight.Normal)
                .color(Theme.Primary.rgb)
                .transition(Transition.of(property = "margin", duration = 300.ms))
                .toAttrs()
        ) {
            Text(section.title)
        }
        P(
            attrs = Modifier
                .fillMaxWidth()
                .textAlign(
                    when (alignment) {
                        Alignment.CenterHorizontally -> TextAlign.Center
                        Alignment.End -> TextAlign.End
                        else -> TextAlign.Start
                    }
                )
                .margin(
                    left = if (alignment == Alignment.Start) subTitleMargin else 0.px,
                    right = if (alignment == Alignment.CenterHorizontally) subTitleMargin else 0.px,
                    bottom = 10.px,
                    top = 0.px
                )
                .fontFamily(Constants.FONT_FAMILY)
                .fontSize(40.px)
                .fontWeight(FontWeight.Bold)
                .color(Theme.Secondary.rgb)
                .transition(Transition.of(property = "margin", duration = 300.ms))
                .toAttrs()
        ) {
            Text(section.subtitle)
        }

        Box(
            modifier = Modifier
                .height(2.px)
                .width(80.px)
                .backgroundColor(Theme.Primary.rgb)
                .borderRadius(r = 50.px)
        )
    }
}