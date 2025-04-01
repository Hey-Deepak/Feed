package domain.model

data class TextFeedItem(
    override val id: String,
    override val userName: String,
    override val timestamp: Long,
    val text: String
): FeedItem(
    id = id,
    userName = userName,
    timestamp = timestamp
)
