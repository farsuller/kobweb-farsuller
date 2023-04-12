package com.far.suller.sections

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.far.suller.components.portfolioCard
import com.far.suller.components.sectionTitle
import com.far.suller.models.Portfolio
import com.far.suller.models.Section
import com.far.suller.styles.PortfolioArrowIconStyle
import com.far.suller.util.Constants.SECTION_WIDTH
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.Overflow
import com.varabyte.kobweb.compose.css.ScrollBehavior
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowLeft
import com.varabyte.kobweb.silk.components.icons.fa.FaArrowRight
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.browser.document
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun portfolioSection(){
    Box(
        modifier = Modifier
            .id(Section.Portfolio.id)
            .maxWidth(SECTION_WIDTH.px)
            .padding(topBottom = 100.px),
        contentAlignment = Alignment.Center
    ) {
        portfolioContent()
    }
}

@Composable
private fun portfolioContent(){
    val breakpoint by rememberBreakpoint()

    Column(
        modifier = Modifier
            .fillMaxWidth(
                if(breakpoint >= Breakpoint.MD) 100.percent
                else 90.percent),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        sectionTitle(
            modifier = Modifier.fillMaxWidth().margin(25.px),
            section = Section.Portfolio
        )
        portfolioCards(breakpoint)
        portfolioNavigation()
    }
}

@Composable
private fun portfolioCards(breakpoint: Breakpoint){
    Row(modifier = Modifier
        .id("scrollableContainer")
        .fillMaxWidth()
        .margin(bottom = 25.px)
        .maxWidth(
            if(breakpoint > Breakpoint.MD) 950.px
            else if (breakpoint > Breakpoint.SM) 625.px
            else 300.px)
        .overflow(Overflow.Hidden)
        .scrollBehavior(ScrollBehavior.Smooth)
    )
    {
        Portfolio.values().forEach { portfolio ->
            portfolioCard(
                modifier = Modifier
                    .margin(
                        right = if( portfolio!= Portfolio.Five) 25.px
                        else 0.px),
                portfolio = portfolio,
                link = portfolio.link

            )
        }
    }
}

@Composable
private fun portfolioNavigation(){

    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center) {

        FaArrowLeft(
            modifier = PortfolioArrowIconStyle.toModifier()
                .margin(right = 40.px)
                .cursor(Cursor.Pointer)
                .onClick {
                    document.getElementById("scrollableContainer")
                        ?.scrollBy(x = (-325.0), y = 0.0)
                },
            size = IconSize.LG
        )

        FaArrowRight(
            modifier = PortfolioArrowIconStyle.toModifier()
                .cursor(Cursor.Pointer)
                .onClick {
                         document.getElementById("scrollableContainer")
                             ?.scrollBy(x = 325.0, y = 0.0)
                },
            size = IconSize.LG
        )

    }

}