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
    About(
        id = "about",
        title = "About me",
        subtitle = "Why Hire Me?",
        path= "#about"
    ),
    Service(
        id = "service",
        title = "Service",
        subtitle = "I'm Good at",
        path= "#service"
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
    Contact(
        id = "contact",
        title = "Contact Me",
        subtitle = "Get in Touch",
        path= "#contact"
    ),
    Testimonial(
        id = "testimonial",
        title = "Testimonial",
        subtitle = "Recommendations",
        path= "#testimonial"
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