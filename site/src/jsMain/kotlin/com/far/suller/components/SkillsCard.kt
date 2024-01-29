package com.far.suller.components

import androidx.compose.runtime.Composable
import com.far.suller.models.Skills
import com.far.suller.models.Theme
import com.far.suller.util.Constants.FONT_FAMILY
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun skillsCard(
    modifier: Modifier = Modifier,
    skills: Skills
) {

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Column(
            modifier = Modifier
            .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                Modifier
                    .padding(topBottom = 5.px, leftRight = 30.px)
                    .border(1.px, LineStyle.Solid, Theme.Primary.rgb)
                    .borderRadius(5.px)
            ) {

                P(
                    attrs = Modifier
                        .fillMaxWidth()
                        .margin(topBottom = 0.px)
                        .fontFamily(FONT_FAMILY)
                        .fontSize(20.px)
                        .fontWeight(FontWeight.Bolder)
                        .color(Theme.Primary.rgb)
                        .toAttrs()
                ) {
                    Text(skills.title)
                }
            }

            Box(
                Modifier
                    .padding(topBottom = 5.px, leftRight = 30.px)

            ){
                P(
                    attrs = Modifier
                        .fillMaxWidth()
                        .margin(topBottom = 0.px)
                        .fontFamily(FONT_FAMILY)
                        .fontSize(16.px)
                        .fontWeight(FontWeight.Bolder)
                        .color(Theme.Primary.rgb)
                        .toAttrs()
                ) {
                    Text(if (skills.year == 1) "\n${skills.year} year" else "\n${skills.year} years")
                }
            }

        }


    }

}