package com.far.suller.models

import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.percent

enum class Skill(
    val title: String,
    val percentage: CSSSizeValue<CSSUnit.percent>
) {
    Creative(
        title = "Creative",
        percentage = 67.percent
    ),
    Accountable(
        title = "Accountable",
        percentage = 93.percent
    ),
    HardWordking(
        title = "Hard Wordking",
        percentage = 85.percent
    ),
    Values(
        title = "Value for Money",
        percentage = 72.percent
    ),
    Delivery(
        title = "On Time Delivery",
        percentage = 85.percent
    ),

}