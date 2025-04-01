package domain.model


sealed class FeedItem(
    open val id: String,
    open val userName: String,
    open val timestamp: Long
)

interface Likeable {
    var likeCount: Int
    fun onLike()
}

interface Commentable {
    var commentCount: Int
    fun onComment(comment: String)
}
