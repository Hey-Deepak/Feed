package domain.model

data class ImageFeedItem(
    override val id: String,
    override val userName: String,
    override val timestamp: Long,
    val imageUrls: List<String>
): FeedItem(
    id = id,
    userName = userName,
    timestamp = timestamp
)
