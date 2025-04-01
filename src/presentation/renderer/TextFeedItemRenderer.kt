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
            onClick = {},
            onLongClick = {  println("Copied text: ${item.text}") },
            onLike = {}
        )
    }
}