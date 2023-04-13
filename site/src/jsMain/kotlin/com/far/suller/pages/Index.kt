package com.far.suller.pages

import androidx.compose.runtime.*
import com.far.suller.components.backToTopButton
import com.far.suller.components.overflowMenu
import com.far.suller.sections.*
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page

@Page
@Composable
fun homePage() {
    var menuOpened by remember { mutableStateOf(false) }

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            mainSection(onMenuClicked = {
                menuOpened = true
            })
            aboutSection()
            serviceSection()
            portfolioSection()
          //  achievementSection()
            testimonialSection()
            experienceSection()
            contactSection()
            footerSection()
        }
        backToTopButton()
        if(menuOpened){
            overflowMenu(onMenuClosed = {
                menuOpened = false
            })
        }
    }
}
