package com.far.suller.models

import com.far.suller.util.Constants.FACEBOOK_LINK
import com.far.suller.util.Constants.GOOGLE_LINK
import com.far.suller.util.Constants.INSTAGRAM_LINK
import com.far.suller.util.Constants.LINKEDIN_LINK
import com.far.suller.util.Constants.TWITTER_LINK
import com.far.suller.util.Res


enum class Portfolio(
    val image:String,
    val title:String,
    val description:String,
    val link:String,
) {
    One(
        image = Res.Image.portfolio1,
        title = "Kudoe",
        description = "Web design",
        link = FACEBOOK_LINK

    ),
    Two(
        image = Res.Image.portfolio2,
        title = "Landing Page for NFT",
        description = "Frontend",
        link = TWITTER_LINK
    ),
    Three(
        image = Res.Image.portfolio3,
        title = "NFT Application",
        description = "Frontend/Backend",
        link = INSTAGRAM_LINK
    ),
    Four(
        image = Res.Image.portfolio4,
        title = "Game Statistics Application",
        description = "Web/Mobile App",
        link = LINKEDIN_LINK
    ),
    Five(
        image = Res.Image.portfolio5,
        title = "Platform for Online Courses",
        description = "Web/Mobile App",
        link = GOOGLE_LINK
    ),

}