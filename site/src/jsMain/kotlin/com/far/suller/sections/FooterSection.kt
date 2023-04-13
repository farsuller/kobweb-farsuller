package com.far.suller.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.far.suller.components.socialBar
import com.far.suller.models.Section
import com.far.suller.models.Theme
import com.far.suller.styles.NavigationItemStyle
import com.far.suller.util.Constants
import com.far.suller.util.Constants.FONT_FAMILY
import com.far.suller.util.Constants.SECTION_WIDTH
import com.far.suller.util.Res
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun footerSection(){

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .maxWidth(SECTION_WIDTH.px)
            .padding(topBottom = 150.px)
            .backgroundColor(Theme.LighterGray.rgb),
        contentAlignment = Alignment.Center
    ) {
        footerContent()
    }
}

@Composable
private fun footerContent(){
    val breakpoint by rememberBreakpoint()

        Column(
            modifier = Modifier
                .fillMaxWidth(
                    if(breakpoint >= Breakpoint.MD) 100.percent
                    else 90.percent),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier.size(100.px),
                src = Res.Image.logo,
                desc = "Logo Image"
            )
            if(breakpoint > Breakpoint.SM){
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center){
                    footerMenu()
                }
            }else{
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    footerMenu(row = false)
                }
            }
            socialBar(row = true)
        }
}
@Composable
private fun footerMenu(row:Boolean = true){
    Section.values().take(6).forEach { section ->
        Link(
            modifier = NavigationItemStyle
                .toModifier()
                .fontSize(12.px)
                .fontFamily(FONT_FAMILY)
                .fontWeight(FontWeight.Normal)
                .padding(
                    right = if(row)20.px
                    else 0.px,
                    bottom = if(row) 0.px
                    else 20.px)
                .textDecorationLine(TextDecorationLine.None),
            path = section.path,
            text = section.title
        )
    }
}