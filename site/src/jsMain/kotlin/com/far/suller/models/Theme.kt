package com.far.suller.models

import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.rgb


enum class Theme(
    val hex: String,
    val rgb: CSSColorValue
) {
    Primary(hex = "#00A78E", rgb = rgb(r = 0, g = 18, b = 113)),
    Secondary(hex = "#121D34", rgb = rgb(r = 39, g = 70, b = 135)),
    Gray(hex = "#CFCFCF", rgb = rgb(r = 207, g = 207, b = 207)),
    LightGray(hex = "#EDEDED", rgb = rgb(r = 237, g = 237, b = 237)),
    LighterGray(hex = "#F9F9F9", rgb = rgb(r = 249, g = 249, b = 249))
}