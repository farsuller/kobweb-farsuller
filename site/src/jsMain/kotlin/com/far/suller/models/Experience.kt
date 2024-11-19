package com.far.suller.models

import com.far.suller.util.Constants.BCS
import com.far.suller.util.Constants.COLLABERA
import com.far.suller.util.Constants.EMAPTA
import com.far.suller.util.Constants.FPT
import com.far.suller.util.Constants.YONDU
import com.far.suller.util.Constants.ZIGZAG
import com.far.suller.util.Res


enum class Experience(
    val number: String,
    val jobPosition: String,
    val description: List<String>,
    val company: String,
    val from: String,
    val to: String,
    val image: String,
) {
    First(
        number = "01",
        jobPosition = "Jr. Mobile Application Developer",
        description = ZIGZAG,
        company = "Zigzag OffShoring",
        from = "March 2017",
        to = "December 2019",
        image = Res.Image.WORK_1,
    ),
    Second(
        number = "02",
        jobPosition = "Jr. Mobile Application Developer",
        description = EMAPTA,
        company = "EMAPTA",
        from = "January 2020",
        to = "September 2020",
        image = Res.Image.WORK_2,
    ),
    Third(
        number = "03",
        jobPosition = "(Software Engineer) Android Mobile Developer",
        description = YONDU,
        company = "Yondu Inc.",
        from = "September 2020",
        to = "February 2022",
        image = Res.Image.WORK_3,
    ),
    Fourth(
        number = "04",
        jobPosition = "Android Developer",
        description = COLLABERA,
        company = "Collabera Digital",
        from = "February 2022",
        to = "January 2024",
        image = Res.Image.WORK_4,
    ),
    Fifth(
        number = "05",
        jobPosition = "Software Developer Engineer",
        description = FPT,
        company = "FPT Software Philippines Corp.",
        from = "February 2024",
        to = "Oct. 2024",
        image = Res.Image.WORK_5,
    ),
    Sixth(
        number = "06",
        jobPosition = "Android Developer",
        description = BCS,
        company = "BCS Technology International Pty Ltd",
        from = "Oct. 2024",
        to = "Present",
        image = Res.Image.WORK_6,
    ),
}