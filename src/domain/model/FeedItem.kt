package domain.model


sealed class FeedItem(
    val id: String = "",
    val timestamp: Long = 0L,
    val userName: String = ""
)