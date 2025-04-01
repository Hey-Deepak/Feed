package domain.model

data class ImageFeedItem(
    override val id: String,
    override val userName: String,
    override val timestamp: Long,
    override var likeCount: Int,
    override var commentCount: Int,
    val imageUrls: List<String>,
): FeedItem(
    id = id,
    userName = userName,
    timestamp = timestamp
), Likeable, Commentable {
    override fun onLike() { likeCount++ }
    override fun onComment() { commentCount++ }
}
