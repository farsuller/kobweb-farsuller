package com.far.suller.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.far.suller.components.header
import com.far.suller.components.socialBar
import com.far.suller.models.Section
import com.far.suller.models.Theme
import com.far.suller.styles.MainButtonStyle
import com.far.suller.styles.MainImageStyle
import com.far.suller.util.Constants.FONT_FAMILY
import com.far.suller.util.Constants.LOREM_IPSUM_SHORTER
import com.far.suller.util.Constants.SECTION_WIDTH
import com.far.suller.util.Res
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs


import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Button

import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun mainSection(onMenuClicked: ()-> Unit){
    Box(
        modifier = Modifier
            .id(Section.Home.id)
            .maxWidth(SECTION_WIDTH.px),
        contentAlignment = Alignment.TopCenter
    ) {

        mainBackground()
        mainContent(onMenuClicked = onMenuClicked)
    }
}

@Composable
private fun mainBackground(){

    Image(
        modifier = Modifier.fillMaxSize().objectFit(ObjectFit.Cover),
        src = Res.Image.background,
        desc = "Background Image"
    )
}

@Composable

private fun mainContent(onMenuClicked: ()-> Unit){
    val breakpoint by rememberBreakpoint()

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        header(onMenuClicked = onMenuClicked)
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            SimpleGrid(modifier = Modifier.fillMaxWidth(
                if(breakpoint >= Breakpoint.MD) 80.percent else 90.percent
            ),
                numColumns = numColumns(base = 1, md = 2)
            ){
                mainText(breakpoint)
                mainImage()
            }

        }

    }
}

@Composable
private fun mainText(breakpoint: Breakpoint){

    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ){
        if(breakpoint > Breakpoint.MD){
            socialBar()
        }
        Column {
            P(
                attrs = Modifier
                    .margin(topBottom = 0.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(if(breakpoint >= Breakpoint.LG)45.px else 20.px)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Primary.rgb)
                    .toAttrs()
            ){
                Text("Hello I'm")
            }
            P(
                attrs = Modifier
                    .margin(top = 20.px, bottom = 0.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(if(breakpoint >= Breakpoint.LG)68.px else 40.px)
                    .fontWeight(FontWeight.Bolder)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ){
                Text("Florence Suller")

            }
            P(
                attrs = Modifier
                    .margin(top = 10.px, bottom = 5.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(20.px)
                    .fontWeight(FontWeight.Bold)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ){
                Text("Android Developer")

            }
            P(
                attrs = Modifier
                    .margin(bottom = 25.px)
                    .maxWidth(400.px)
                    .fontFamily(FONT_FAMILY)
                    .fontSize(15.px)
                    .fontStyle(FontStyle.Italic)
                    .fontWeight(FontWeight.Normal)
                    .color(Theme.Secondary.rgb)
                    .toAttrs()
            ){
                Text(LOREM_IPSUM_SHORTER)

            }
            Button(
                attrs = MainButtonStyle.toModifier()
                .height(40.px)
                .border( 0.px)
                .borderRadius(r = 5.px)
                .backgroundColor(Theme.Primary.rgb)
                .color(Colors.White)
                .cursor(Cursor.Pointer)
                .toAttrs()
            ) {

                Link(
                    modifier = Modifier
                        .color(Colors.White)
                        .textDecorationLine(TextDecorationLine.None),
                    text = "Hire me",
                    path = Section.Contact.path
                    )

            }
        }
    }
}


@Composable
private fun mainImage(){
    Column (modifier = Modifier.fillMaxSize(80.percent).fillMaxHeight(),
        verticalArrangement = Arrangement.Center) {
        Image(
            modifier = MainImageStyle.toModifier().fillMaxWidth(),
            src = Res.Image.mainImage,
            desc = "Main Image"
        )
    }
}