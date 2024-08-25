package com.far.suller.models

enum class Section(
    val id: String,
    val title: String,
    val subtitle: String,
    val path: String
) {
    Home(
        id = "home",
        title = "Home",
        subtitle = "",
        path= "#home"
    ),
    Portfolio(
        id = "portfolio",
        title = "Portfolio",
        subtitle = "Project Involvements and Others",
        path= "#portfolio"
    ),
    Experience(
        id = "experience",
        title = "Experience",
        subtitle = "Work Experience",
        path= "#experience"
    ),
    Service(
        id = "service",
        title = "Service",
        subtitle = "I'm Good at",
        path= "#service"
    ),
    Testimonial(
        id = "testimonial",
        title = "Testimonial",
        subtitle = "Recommendations",
        path= "#testimonial"
    ),
    Contact(
        id = "contact",
        title = "Contact Me",
        subtitle = "Get in Touch",
        path= "#contact"
    ),
    About(
        id = "about",
        title = "About me",
        subtitle = "Why Hire Me?",
        path= "#about"
    ),

    Achievements(
        id = "achievements",
        title = "Achievements",
        subtitle = "Personal Achievements",
        path= "#achievements"
    ),
    Skills(
        id = "skills",
        title = "Skills",
        subtitle = "Crafting Journey",
        path= "#skills"
    ),
}