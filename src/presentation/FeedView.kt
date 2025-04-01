package presentation

interface FeedView {
    val onClick: () -> Unit
    val onLongClick: (() -> Unit)?
    val onLike: (() -> Unit)?
    val onComment: (() -> Unit)?
}