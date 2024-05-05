package com.jjswigut.personal.model

data class Project(
    val headerText: String,
    val linkText: String,
    val linkUrl: String,
    val description: String? = null,
    val images: List<String>,
)