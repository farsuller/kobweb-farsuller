package com.far.suller.models

import com.far.suller.util.Constants.LOREM_IPSUM_LONGER


enum class Experience(
    val number:String,
    val jobPosition:String,
    val description:String,
    val company:String,
    val from:String,
    val to:String
) {
    First(
        number = "01",
        jobPosition = "Mobile Application Developer",
        description = LOREM_IPSUM_LONGER,
        company = "Zigzag OffShoring",
        from = "March 2017",
        to = "December 2020"
    ),
    Second(
        number = "02",
        jobPosition = "Mobile Application Developer",
        description = LOREM_IPSUM_LONGER,
        company = "EMAPTA",
        from = "January 2020",
        to = "September 2020"
    ),
    Third(
        number = "03",
        jobPosition = "Android Mobile Developer",
        description = LOREM_IPSUM_LONGER,
        company = "Yondu Inc.",
        from = "September 2020",
        to = "February 2022"
    ),
    Fourth(
        number = "04",
        jobPosition = "Android Developer",
        description = LOREM_IPSUM_LONGER,
        company = "Collabera Digital",
        from = "February 2022",
        to = "Present"
    ),
}