package presentation

enum class FeedType {
    TEXT, IMAGE, VIDEO
}

data class FeedView(
    val id: String,
    val type: FeedType,
    val userName: String,
    val timestamp: Long,
    val content: Any, // text or image/video URL(s)
    val onClick: () -> Unit,
    val onLongClick: (() -> Unit)? = null,
    val onLike: (() -> Unit)? = null,
    val onComment: (() -> Unit)? = null
)