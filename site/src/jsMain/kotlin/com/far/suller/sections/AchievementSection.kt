package com.far.suller.sections

import androidx.compose.runtime.*
import com.far.suller.components.achievementCard
import com.far.suller.models.Achievements
import com.far.suller.models.Section
import com.far.suller.models.Theme
import com.far.suller.util.Constants.SECTION_WIDTH
import com.far.suller.util.observerViewPortEntered
import com.far.suller.util.animateNumbers
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.px

@Composable
fun achievementSection() {
    val breakpoint = rememberBreakpoint()
    Box(
        modifier = Modifier
            .id(Section.Achievements.id)
            .fillMaxWidth()
            .maxWidth(SECTION_WIDTH.px)
            .padding(topBottom = 100.px)
            .backgroundColor(Theme.LighterGray.rgb),
        contentAlignment = Alignment.Center
    ) {
        achievementContent(breakpoint = breakpoint)
    }
}

@Composable
private fun achievementContent(breakpoint: Breakpoint) {
    val scope = rememberCoroutineScope()
    var viewPortEntered by remember { mutableStateOf(false) }
    val animatedNumbers = remember { mutableStateListOf(0, 0, 0, 0) }

    observerViewPortEntered(
        sectionId = Section.Achievements.id,
        distanceFromTop = 700.0,
        onViewPortEntered = {
            viewPortEntered = true
            Achievements.values().forEach { achievements ->
                scope.launch {
                    animateNumbers(
                        number = achievements.number,
                        onUpdate = {
                            animatedNumbers[achievements.ordinal] = it
                        }
                    )
                }
            }
        }
    )

    SimpleGrid(numColumns = numColumns(base = 1, md = 2, lg = 4)) {
        Achievements.entries.forEach { achievements ->
            achievementCard(
                modifier = Modifier.margin(
                    right = if (achievements == Achievements.Team) 0.px
                    else {
                        if (breakpoint > Breakpoint.SM) 40.px else 0.px
                    },
                    bottom = if (breakpoint > Breakpoint.MD) 0.px else 40.px
                ),
                animatedNumber = if (viewPortEntered) animatedNumbers[achievements.ordinal] else 0,
                achievements = achievements
            )
        }
    }

}