package domain.model

interface Commentable {
    var commentCount: Int
    fun onComment(comment: String)
}
