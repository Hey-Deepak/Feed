package domain

import domain.model.FeedItem
import domain.model.ImageFeedItem
import domain.model.TextFeedItem
import domain.model.VideoFeedItem
import domain.repo.ImageFeedItemRenderer
import domain.repo.TextFeedItemRenderer
import domain.repo.VideoFeedItemRenderer
import presentation.FeedItemRenderer

class FeedItemRendererFactory {
    fun getRenderer(item: FeedItem): FeedItemRenderer = when (item) {
        is TextFeedItem -> TextFeedItemRenderer()
        is ImageFeedItem -> ImageFeedItemRenderer()
        is VideoFeedItem -> VideoFeedItemRenderer()
    }
}