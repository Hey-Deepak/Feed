package domain.repo

import domain.model.FeedItem
import domain.model.VideoFeedItem
import presentation.FeedItemRenderer
import presentation.FeedType
import presentation.FeedView

class VideoFeedItemRenderer : FeedItemRenderer {
    override fun render(feedItem: FeedItem): FeedView {
        val item = feedItem as VideoFeedItem
        return FeedView(
            id = item.id,
            type = FeedType.VIDEO,
            userName = item.userName,
            timestamp = item.timestamp,
            content = item.videoUrl,
            onClick = { println("Playing video: ${item.videoUrl}") }
        )
    }
}