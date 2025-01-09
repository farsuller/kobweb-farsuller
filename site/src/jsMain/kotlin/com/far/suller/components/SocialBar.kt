package com.far.suller.components

import androidx.compose.runtime.Composable
import com.far.suller.styles.SocialLinksStyle
import com.far.suller.util.Constants.FACEBOOK_LINK
import com.far.suller.util.Constants.GITHUB_LINK
import com.far.suller.util.Constants.GOOGLE_DEVELOPER_LINK
import com.far.suller.util.Constants.LINKEDIN_LINK
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.icons.fa.*
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.px


@Composable
fun socialBar(row: Boolean = false) {
    if (row) {
        Row(
            modifier = Modifier
                .margin(top = 25.px)
                .padding(leftRight = 25.px)
                .minHeight(40.px)
                .borderRadius(r = 20.px)
                .backgroundColor(Colors.White),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            socialLinks(row = true)
        }
    } else {
        Column(
            modifier = Modifier
                .margin(right = 25.px)
                .padding(topBottom = 25.px)
                .minWidth(40.px)
                .borderRadius(20.px)
                .backgroundColor(Colors.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            socialLinks()
        }
    }
}

@Composable
private fun socialLinks(row: Boolean = false) {

    Link(
        path = LINKEDIN_LINK,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaLinkedin(
            modifier = SocialLinksStyle
                .toModifier()
                .margin(
                    bottom = if (row) 0.px else 40.px,
                    right = if (row) 40.px else 0.px
                ), size = IconSize.LG
        )
    }
    Link(
        path = GITHUB_LINK,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaGithub(
            modifier = SocialLinksStyle
                .toModifier()
                .margin(
                    bottom = if (row) 0.px else 40.px,
                    right = if (row) 40.px else 0.px
                ),
            size = IconSize.LG
        )
    }
    Link(
        path = GOOGLE_DEVELOPER_LINK,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaGooglePlay(
            modifier = SocialLinksStyle
                .toModifier()
                .margin(
                    bottom = if (row) 0.px else 40.px,
                    right = if (row) 40.px else 0.px
                ),
            size = IconSize.LG
        )
    }
    Link(
        path = FACEBOOK_LINK,
        openExternalLinksStrategy = OpenLinkStrategy.IN_NEW_TAB
    ) {
        FaFacebook(
            modifier = SocialLinksStyle
                .toModifier(), size = IconSize.LG
        )
    }
}