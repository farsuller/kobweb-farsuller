package com.far.suller.models

import com.far.suller.util.Res


enum class Skills (
    val title:String,
    val year: Int,){

    Kotlin(
        title = "Kotlin",
        year = 7
    ),
    Java(
        title = "Java",
        year = 7
    ),
    AndroidSDK(
        title = "Android SDK",
        year = 7
    ),
    Android(
        title = "Android Development",
        year = 7
    ),
    XML(
        title = "XML",
        year = 7
    ),
    MobileDesign(
        title = "Mobile Design",
        year = 7
    ),
    MVVM(
        title = "MVVM",
        year = 7
    ),
    VersionControl(
        title = "Git",
        year = 7
    ),
    RESTAPI(
        title = "Rest API",
        year = 4
    ),

    DI(
        title = "Dependency Injection",
        year = 4
    ),
    Modularization(
        title = "Modular",
        year = 3
    ),

    MVC(
        title = "MVC",
        year = 2
    ),
    CLEAN(
        title = "CLEAN Architecture",
        year = 2
    ),
    MVI(
        title = "MVI",
        year = 1
    ),

    RxKotlin(
        title = "RxKotlin",
        year = 2
    ),
    CICD(
        title = "CI CD",
        year = 2
    ),
    UnitTesting(
        title = "Unit Testing",
        year = 2
    ),
    Flutter(
        title = "Flutter",
        year = 1
    ),
    Dart(
        title = "Dart",
        year = 1
    ),
    JC(
        title = "Jetpack Compose",
        year = 1
    ),
}