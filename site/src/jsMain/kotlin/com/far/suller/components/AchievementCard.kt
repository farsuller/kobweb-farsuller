package com.far.suller.components

import androidx.compose.runtime.Composable
import com.far.suller.models.Achievements
import com.far.suller.models.Theme
import com.far.suller.util.Constants.FONT_FAMILY

import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun achievementCard(
    modifier: Modifier = Modifier,
    animatedNumber: Int,
    achievements: Achievements
) {

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            modifier = Modifier
                .size(70.px)
                .margin(right = 20.px),
            src = achievements.icon,
        )
        Column {
            P(
                attrs = Modifier
                    .fillMaxWidth()
                    .margin(topBottom = 0.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(30.px)
                    .fontWeight(FontWeight.Bolder)
                    .color(Theme.Primary.rgb)
                    .toAttrs()
            ) {
                Text(
                    if (achievements == Achievements.Completed) "$animatedNumber+"
                    else "$animatedNumber"
                )
            }
            P(
                attrs = Modifier
                    .fillMaxWidth()
                    .margin(topBottom = 0.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(16.px)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Secondary.rgb)
                    .opacity(50.percent)
                    .toAttrs()
            ) {
                Text(achievements.description)
            }
        }
    }

}