package com.far.suller.models

import com.far.suller.util.Constants.FACEBOOK_LINK
import com.far.suller.util.Constants.GOOGLE_LINK
import com.far.suller.util.Constants.INSTAGRAM_LINK
import com.far.suller.util.Constants.LINKEDIN_LINK
import com.far.suller.util.Constants.MCDELIVERY_LINK
import com.far.suller.util.Constants.PORFOLIOF
import com.far.suller.util.Constants.PUREGOLD
import com.far.suller.util.Constants.SPARK_CLEANER_LINK
import com.far.suller.util.Constants.TWITTER_LINK
import com.far.suller.util.Constants.UNIONBANK
import com.far.suller.util.Res


enum class Portfolio(
    val image:String,
    val title:String,
    val description:String,
    val link:String,
) {
    One(
        image = Res.Image.portfolio1,
        title = "Porfoliofs",
        description = "Install if you want to see a flutter simple portfolio app. My first flutter publish app in PlayStore",
        link = PORFOLIOF

    ),
    Two(
        image = Res.Image.portfolio2,
        title = "Spark Cleaner",
        description = "Spark Cleaner is the best, fast and secure with very light optimizer app tool for your smartphone without having the need to root it as fast like a spark.",
        link = SPARK_CLEANER_LINK
    ),
    Three(
        image = Res.Image.portfolio3,
        title = "McDelivery PH",
        description = "Enjoy an updated, modern interface designed to make ordering your McDo favorites easier! Choose the nearest store to deliver to your doorstep with the Map Pinning and Store Selection feature.",
        link = MCDELIVERY_LINK
    ),
    Four(
        image = Res.Image.portfolio4,
        title = "Puregold Mobile",
        description = "Want to shop groceries straight from the comforts of your home, office or while travelling?",
        link = PUREGOLD
    ),
    Five(
        image = Res.Image.portfolio5,
        title = "UnionBank Online",
        description = "Get started by opening an account in-app, without ever having to step into a branch. Easily manage your accounts, your cards, transfer funds, pay your bills and more, with just the tap of your finger.",
        link = UNIONBANK
    ),

}