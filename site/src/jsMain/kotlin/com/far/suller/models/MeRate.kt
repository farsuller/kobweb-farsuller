package com.far.suller.models

import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.percent

enum class MeRate(
    val title: String,
    val percentage: CSSSizeValue<CSSUnit.percent>
) {
    Delivery(
        title = "On Time Delivery",
        percentage = 100.percent
    ),
    Communication(
        title = "Communication Skills",
        percentage = 93.percent
    ),
    ProblemSolving(
        title = "Problem Solving",
        percentage = 91.percent
    ),
    TeamPlayer(
        title = "Team Player",
        percentage = 95.percent
    ),
    Adaptability(
        title = "Adaptability",
        percentage = 94.percent
    )
}