package presentation.renderer

import domain.model.FeedItem
import domain.model.ImageFeedItem
import presentation.view.FeedType
import presentation.view.FeedView

class ImageFeedItemRenderer : FeedItemRenderer {
    override fun render(feedItem: FeedItem): FeedView {
        val item = feedItem as ImageFeedItem
        return FeedView(
            id = item.id,
            type = FeedType.IMAGE,
            userName = item.userName,
            timestamp = item.timestamp,
            content = item.imageUrls,
            onClick = { println("Expanding image(s): ${item.imageUrls}") },
            onLike = { item.onLike() },
            onComment = { commentText ->
                item.onComment(commentText)
            },
            likeCount = item.likeCount,
            commentCount = item.commentCount
        )
    }
}