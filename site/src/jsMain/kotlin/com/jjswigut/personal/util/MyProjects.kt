package com.jjswigut.personal.util

import com.jjswigut.personal.model.Project

object MyProjects {

    private val ShiftKey = Project(
        headerText = "ShiftKey Wallet",
        linkText = "Android",
        linkUrl = "https://play.google.com/store/apps/details?id=com.branchapp.shiftkeywallet",
        images = listOf(
            "/shiftkey_1.png",
            "/shiftkey_2.png",
            "/shiftkey_3.png",
            "/shiftkey_4.png",
            "/shiftkey_5.png",
            "/shiftkey_6.png",
            "/shiftkey_7.png",
            "/shiftkey_8.png",
        )
    )

    private val Paymint = Project(
        headerText = "Paymint",
        linkText = "Android",
        linkUrl = "https://play.google.com/store/apps/details?id=com.branchapp.paymint",
        images = listOf(
            "/paymint_1.png",
            "/paymint_2.png",
            "/paymint_3.png",
            "/paymint_4.png",
            "/paymint_5.png",
        )
    )

   private val NursaDirect = Project(
        headerText = "Nursa Direct",
        linkText = "Android",
        linkUrl = "https://play.google.com/store/apps/details?id=com.branchapp.nursacard",
        images = listOf(
            "/nursa_1.png",
            "/nursa_2.png",
            "/nursa_3.png",
            "/nursa_4.png",
        )
    )

   private val Upc = Project(
        headerText = "Uber Pro Card",
        linkText = "Android",
        linkUrl = "https://play.google.com/store/apps/details?id=com.branchapp.uberprocard",
        images = listOf(
            "/upc_1.png",
            "/upc_2.png",
            "/upc_3.png",
            "/upc_4.png",
            "/upc_5.png",
        )
    )

    private val Branch = Project(
        headerText = "Branch",
        linkText = "Android",
        linkUrl = "https://play.google.com/store/apps/details?hl=en_US&id=com.branchmessenger",
        images = listOf(
            "/branch_1.png",
            "/branch_2.png",
            "/branch_3.png",
            "/branch_4.png",
            "/branch_5.png",
        )
    )

    val allProjects = listOf(
        ShiftKey,
        Paymint,
        NursaDirect,
        Upc,
        Branch
    )
}