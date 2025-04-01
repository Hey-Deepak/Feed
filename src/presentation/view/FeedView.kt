package presentation.view


data class FeedView(
    val id: String,
    val type: FeedType,
    val userName: String,
    val timestamp: Long,
    val content: Any, // text or image/video URL(s)
    val onClick: () -> Unit,
    val onLongClick: (() -> Unit)? = null,
    val onLike: (() -> Unit)? = null,
    val onComment: (() -> Unit)? = null,
    val likeCount: Int = 0,
    val commentCount: Int = 0
)