package com.jjswigut.personal.util

enum class SocialIcons(
    val iconRes: String,
    val link: String,
) {
    X("/x_share_icon.svg", "https://www.x.com/jjswigut"),
    LinkedIn("/linkedin_share_icon.svg", "https://www.linkedin.com/in/joshua-swigut-a91014158/"),
    Github("/github_share_icon.svg", "https://www.github.com/jjswigut"),
    SoundCloud("/soundcloud_share_icon.svg", "https://www.soundcloud.com/swigut"),
    PlayStore("/plays_store_share_icon.svg", "https://play.google.com/store/apps/developer?id=JJSwigut&hl=en_US&gl=US"),
    Discord("/discord_share_icon.svg", "https://discordapp.com/users/531452495738699786")
}