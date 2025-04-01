package domain.model


sealed class FeedItem(
    open val id: String,
    open val userName: String,
    open val timestamp: Long
)
