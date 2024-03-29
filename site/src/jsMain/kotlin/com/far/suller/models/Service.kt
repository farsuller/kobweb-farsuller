package com.far.suller.models

import com.far.suller.util.Constants.ANDROID_SERVICE
import com.far.suller.util.Constants.CROSS_PLATFORM_SERVICE
import com.far.suller.util.Constants.EDITING_SERVICE
import com.far.suller.util.Constants.IOS_SERVICE
import com.far.suller.util.Constants.UI_UX_SERVICE
import com.far.suller.util.Constants.WEB_SERVICE
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
        description = ANDROID_SERVICE
    ),
    IOS(
        icon = Res.Icon.ios,
        imageDesc = "Apple Icon",
        title = "iOS Development",
        description = IOS_SERVICE
    ),
    Web(
        icon = Res.Icon.web,
        imageDesc = "Desktop Icon",
        title = "Web Development",
        description = WEB_SERVICE
    ),
    CrossPlatform(
        icon = Res.Icon.flutter,
        imageDesc = "Cross Platform Icon",
        title = "Cross Platform Development",
        description = CROSS_PLATFORM_SERVICE
    ),
    Design(
        icon = Res.Icon.design,
        imageDesc = "Pen Icon",
        title = "UI/UX Design",
        description = UI_UX_SERVICE
    ),
    Video(
        icon = Res.Icon.video,
        imageDesc = "Video Icon",
        title = "Video Editing",
        description = EDITING_SERVICE
    )
}