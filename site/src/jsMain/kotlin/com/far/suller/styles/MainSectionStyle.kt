package com.far.suller.styles

import com.far.suller.models.Theme
import com.varabyte.kobweb.compose.css.Transition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.transform
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.anyLink
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.ExperimentalComposeWebApi
import org.jetbrains.compose.web.css.*

val NavigationItemStyle = CssStyle {
    base {
        Modifier
            .color(Theme.Secondary.rgb)
            .transition(Transition.of(property = "color", duration = 200.ms))

    }
    anyLink {
        Modifier.color(Theme.Secondary.rgb)
    }
    hover {
        Modifier.color(Theme.Primary.rgb)
    }
}


val LogoStyle = CssStyle {
    base {
        Modifier.transform { rotate(0.deg) }
            .transition(Transition.of(property = "transform", duration = 200.ms))
    }

    hover {
        Modifier.transform { rotate((-10).deg) }
    }
}

val SocialLinksStyle = CssStyle {
    base {
        Modifier
            .color(Theme.Gray.rgb)
            .transition(
                Transition.of(property = "color", duration = 200.ms)
            )
    }
    hover {
        Modifier.color(Theme.Primary.rgb)
    }
}

val MainButtonStyle = CssStyle {
    base {
        Modifier.width(100.px)
            .transition(Transition.of(property = "width", duration = 200.ms))
    }
    hover {
        Modifier.width(120.px)
    }
}

@OptIn(ExperimentalComposeWebApi::class)
val MainImageStyle = CssStyle {
    base {
        Modifier.styleModifier {
            filter {
                grayscale(100.percent)
            }
        }
            .transition(Transition.of(property = "filter", duration = 200.ms))
    }
    hover {
        Modifier.styleModifier {
            filter {
                grayscale(0.percent)
            }
        }
    }
}