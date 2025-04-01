package domain.model

data class VideoFeedItem(
    override val id: String,
    override val userName: String,
    override val timestamp: Long,
    override var likeCount: Int,
    override var commentCount: Int,
    val videoUrl: String,
    val comments: MutableList<String> = mutableListOf()
) : FeedItem(
    id = id,
    userName = userName,
    timestamp = timestamp
), Likeable, Commentable {

    override fun onLike() {
        likeCount++
    }

    override fun onComment(comment: String) {
        comments.add(comment)
        commentCount = comments.size
        println("New comment: \"$comment\" on VideoFeedItem by $userName")
    }
}

