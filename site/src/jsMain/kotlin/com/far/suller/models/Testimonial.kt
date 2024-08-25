package com.far.suller.models

import com.far.suller.util.Res

enum class Testimonial(
    val image: String,
    val fullName: String,
    val profession: String,
    val review : String
) {
    First(
        image = Res.Image.avatar1,
        fullName = "John Paul Ebreo",
        profession = "Senior Software Engineer",
        review = "Florence is a great developer, not only technically but also as a team player.",
    ),

    Second(
        image = Res.Image.avatar2,
        fullName = "Mark Abenir",
        profession = "Senior Java Developer",
        review = "Exceptional coding, strong teamwork, and creativity skills. Able to align the app development and design with the company goals.",
    ),

    Third(
        image = Res.Image.avatar3,
        fullName = "Julian Basco",
        profession = "ReactJs Developer",
        review = "Florence is a very diligent worker and team player. He would be a good fit for any position!",
    ),

    Fourth(
        image = Res.Image.avatar4,
        fullName = "Caroline Ignacio",
        profession = "iOS Software Engineer",
        review = "His technical skills and dedication to quality work make them a valuable asset to any team!",
    ),
    Fifth(
        image = Res.Image.avatar5,
        fullName = "Raymart Entuna",
        profession = "Sr. Dotnet  Developer",
        review = "Brought a new level of expertise to our team. His dedication to creating seamless user experiences is unmatched.",
    ),

    Sixth(
        image = Res.Image.avatar6,
        fullName = "Reynaleen Soriano",
        profession = "CEO - Technation",
        review = "His coding prowess and attention to detail ensured our mobile app exceeded expectations.",
    ),
}