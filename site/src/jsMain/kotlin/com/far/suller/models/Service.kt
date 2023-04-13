package com.far.suller.models

import com.far.suller.util.Constants.LOREM_IPSUM_SHORTER
import com.far.suller.util.Res


enum class Service(
    val icon:String,
    val imageDesc: String,
    val title: String,
    val description: String
) {
    Android(
        icon = Res.Icon.android,
        imageDesc = "Android Icon",
        title = "Android Development",
        description = LOREM_IPSUM_SHORTER
    ),
    IOS(
        icon = Res.Icon.ios,
        imageDesc = "Apple Icon",
        title = "iOS Development",
        description = LOREM_IPSUM_SHORTER
    ),
    Web(
        icon = Res.Icon.web,
        imageDesc = "Desktop Icon",
        title = "Web Development",
        description = LOREM_IPSUM_SHORTER
    ),
    Flutter(
        icon = Res.Icon.flutter,
        imageDesc = "Flutter Icon",
        title = "Flutter Development",
        description = LOREM_IPSUM_SHORTER
    ),
    Design(
        icon = Res.Icon.design,
        imageDesc = "Pen Icon",
        title = "UI/UX Design",
        description = LOREM_IPSUM_SHORTER
    ),
    Video(
        icon = Res.Icon.video,
        imageDesc = "Video Icon",
        title = "Video Editing",
        description = LOREM_IPSUM_SHORTER
    )
}