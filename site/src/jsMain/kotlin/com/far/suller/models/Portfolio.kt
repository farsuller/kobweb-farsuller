package com.far.suller.models


import com.far.suller.util.Constants.MCDELIVERY_LINK
import com.far.suller.util.Constants.PARKINGBUDDY
import com.far.suller.util.Constants.PUREGOLD
import com.far.suller.util.Constants.SOLOEATS
import com.far.suller.util.Constants.SOLOFOLIO
import com.far.suller.util.Constants.SOLOSCAPE
import com.far.suller.util.Constants.SPARK_CLEANER_LINK
import com.far.suller.util.Constants.UNIONBANK
import com.far.suller.util.Res


enum class Portfolio(
    val image:String,
    val title:String,
    val description:String,
    val link:String,
) {
    SoloScape(
        image = Res.Image.soloscape,
        title = "SoloScape",
        description = "SoloScape - Version 1.0 \n" +
                "Introducing the first version of my Jetpack Compose app, now live on the Play Store—a straightforward journal app.",
        link = SOLOSCAPE

    ),
    Solofolio(
        image = Res.Image.solofolio,
        title = "Solofolio",
        description = "Solofolio - Version 1.0 \n" +
                "Jetpack Compose Upgrade: SoloFolio is now revamped using Jetpack Compose for a more modern and dynamic portfolio experience.",
        link = SOLOFOLIO
    ),
    SoloEats(
        image = Res.Image.soloeats,
        title = "SoloEats",
        description = "SoloEats - Version 1.0 \n" +
                "SoloEats 1.0 is a demo version, not processing real transactions. The release emphasizes an effortless dining experience.",
        link = SOLOEATS
    ),
    UnionBankApp(
        image = Res.Image.portfolio5,
        title = "UnionBank Online",
        description = "I was part of a specific team that developed a feature related to installments, deployed it on the app for users, and subsequently maintained other features within different teams.",
        link = UNIONBANK
    ),
    McDeliveryPH(
        image = Res.Image.portfolio3,
        title = "McDelivery PH",
        description = "During my tenure at the previous company, our team revamped and released the McDelivery PH app to the market.",
        link = MCDELIVERY_LINK
    ),
    PuregoldMobile(
        image = Res.Image.portfolio4,
        title = "Puregold Mobile",
        description = "I oversaw and upheld the management of this application while fulfilling my responsibilities in the DevOps position.",
        link = PUREGOLD
    ),
    ParkingBuddy(
        image = Res.Image.parkingbuddy,
        title = "Parking Buddy",
        description = "I oversaw and upheld the management of this application while fulfilling my responsibilities in the DevOps position.",
        link = PARKINGBUDDY
    ),

    SparkCleaner(
        image = Res.Image.portfolio2,
        title = "Spark Cleaner",
        description = "No longer published. Developed using android native in Kotlin.",
        link = SPARK_CLEANER_LINK
    ),
    BetterCleaner(
        image = Res.Image.portfolio6,
        title = "BetterCleaner",
        description = "No longer published, worked on this during my time at the previous company. Developed using android native in Java.",
        link = ""
    ),

    BetterCleanerLite(
        image = Res.Image.portfolio7,
        title = "BetterCleaner Lite",
        description = "No longer published, worked on this during my time at the previous company. Developed using android native in Kotlin.",
        link = ""
    ),
    HuddleLive(
        image = Res.Image.portfolio8,
        title = "huddle.live",
        description = "No longer publicly accessible, worked on this during my tenure at the previous company. Developed using android native in Kotlin.",
        link = ""
    ),
    OceanSweep(
        image = Res.Image.portfolio9,
        title = "Ocean Sweep",
        description = "No more available publicly, worked on this during my tenure at the previous company. Our team delved into game re-skinning and enhanced features across various platforms.",
        link = ""
    ),
    PetCare(
        image = Res.Image.portfolio10,
        title = "Pet Care",
        description = "No more available publicly, worked on this during my tenure at the previous company. Our team delved into game re-skinning and enhanced features across various platforms.",
        link = ""
    ),
    PetPony(
        image = Res.Image.portfolio11,
        title = "Pet Pony",
        description = "No more available publicly, worked on this during my tenure at the previous company. Our team delved into game re-skinning and enhanced features across various platforms.",
        link = ""
    ),
    FunPopping(
        image = Res.Image.portfolio12,
        title = "Fun Popping Bubbles",
        description = "No more available publicly, worked on this during my tenure at the previous company. Our team delved into game re-skinning and enhanced features across various platforms.",
        link = ""
    ),
    PrincessMagic(
        image = Res.Image.portfolio13,
        title = "Princess Magic Beauty Potion",
        description = "No more available publicly, worked on this during my tenure at the previous company. Our team delved into game re-skinning and enhanced features across various platforms.",
        link = ""
    ),
    EarDoctor(
        image = Res.Image.portfolio14,
        title = "Ear Doctor",
        description = "No more available publicly, worked on this during my tenure at the previous company. Our team delved into game re-skinning and enhanced features across various platforms.",
        link = ""
    ),

}