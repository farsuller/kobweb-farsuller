package com.far.suller.util

import androidx.compose.runtime.*
import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.coroutines.delay
import org.w3c.dom.events.EventListener

@Composable
fun observerViewPortEntered(
    sectionId:String,
    distanceFromTop: Double,
    onViewPortEntered: () -> Unit
){
    var viewPortEntered by remember { mutableStateOf(false) }
    val listener = remember {
        EventListener {
            val top = document.getElementById(sectionId)?.getBoundingClientRect()?.top
            if(top != null  && top < distanceFromTop){
                viewPortEntered = true
            }
        }
    }

    LaunchedEffect(viewPortEntered){
        if(viewPortEntered){
            onViewPortEntered()
            window.removeEventListener(type= "scroll", callback = listener)
        }
        else{
            window.addEventListener(type ="scroll", callback = listener)
        }
    }
}

suspend fun animateNumbers(
    number: Int,
    delay : Long = 10L,
    onUpdate: (Int) -> Unit
){
    (0..number).forEach {
        delay(delay)
        onUpdate(it)
    }
}