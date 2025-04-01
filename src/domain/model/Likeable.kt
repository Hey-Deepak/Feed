package domain.model

interface Likeable {
    var likeCount: Int
    fun onLike()
}
