package com.far.suller.models

import com.far.suller.util.Constants.LOREM_IPSUM_LONG
import com.far.suller.util.Res

enum class Testimonial(
    val image: String,
    val fullName: String,
    val profession: String,
    val review : String
) {
    First(
        image = Res.Image.avatar1,
        fullName = "Ellen Grace",
        profession = "Bussiness Analyst",
        review =  LOREM_IPSUM_LONG
    ),

    Second(
    image = Res.Image.avatar2,
    fullName = "Reynaleen Soriano",
    profession = "CEO - Technation",
    review =  LOREM_IPSUM_LONG
    ),

    Third(
        image = Res.Image.avatar3,
        fullName = "Raymart Entuna",
        profession = "Software Engineer",
        review =  LOREM_IPSUM_LONG
    ),

    Fourth(
        image = Res.Image.avatar4,
        fullName = "Goldy Grace",
        profession = "UI/UX Designer",
        review =  LOREM_IPSUM_LONG
    ),

    Fifth(
        image = Res.Image.avatar5,
        fullName = "Renz Suller",
        profession = "Android Developer",
        review =  LOREM_IPSUM_LONG
    ),

    Sixth(
        image = Res.Image.avatar6,
        fullName = "Marinells Esperancilla",
        profession = "SAP Consultant",
        review =  LOREM_IPSUM_LONG
    )
}