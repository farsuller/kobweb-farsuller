package com.far.suller.components

import androidx.compose.runtime.Composable
import com.far.suller.styles.SocialLinksStyle
import com.far.suller.util.Constants.FACEBOOK_LINK
import com.far.suller.util.Constants.INSTAGRAM_LINK
import com.far.suller.util.Constants.LINKEDIN_LINK
import com.far.suller.util.Constants.TWITTER_LINK
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.px


@Composable
fun SocialBar(){
    Column(modifier = Modifier
        .margin(right = 25.px)
        .padding(topBottom = 25.px)
        .minWidth(40.px)
        .borderRadius(20.px)
        .backgroundColor(Colors.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SocialLinks()
    }
}

@Composable
private fun SocialLinks(){
    Link(
        path = FACEBOOK_LINK,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ){
        FaFacebook(modifier = SocialLinksStyle.toModifier().margin(bottom = 40.px), size = IconSize.LG)
    }
    Link(
        path = TWITTER_LINK,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB){
        FaTwitter(modifier = SocialLinksStyle.toModifier().margin(bottom = 40.px), size = IconSize.LG)
    }
    Link(
        path = INSTAGRAM_LINK,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB){
        FaInstagram(modifier = SocialLinksStyle.toModifier().margin(bottom = 40.px), size = IconSize.LG)
    }
    Link(
        path = LINKEDIN_LINK,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB){
        FaLinkedin(modifier = SocialLinksStyle.toModifier() , size = IconSize.LG)
    }
}