package domain.model

data class VideoFeedItem(
    override val id: String,
    override val userName: String,
    override val timestamp: Long,
    val videoUrl: String
): FeedItem(
    id = id,
    userName = userName,
    timestamp = timestamp
)
