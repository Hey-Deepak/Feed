package presentation.renderer

import domain.model.FeedItem
import domain.model.TextFeedItem
import presentation.view.FeedType
import presentation.view.FeedView

class TextFeedItemRenderer : FeedItemRenderer {
    override fun render(feedItem: FeedItem): FeedView {
        val item = feedItem as TextFeedItem
        return FeedView(
            id = item.id,
            type = FeedType.TEXT,
            userName = item.userName,
            timestamp = item.timestamp,
            content = item.text,
            onClick = { println("Text clicked: ${item.text}") },
            onLongClick = { println("Text copied: ${item.text}") },
            onLike = { item.onLike() },
            onComment = { commentText ->
                item.onComment(commentText)
            },
            likeCount = item.likeCount,
            commentCount = item.commentCount
        )
    }
}