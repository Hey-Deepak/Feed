package presentation.renderer

import domain.model.FeedItem
import domain.model.ImageFeedItem
import domain.model.TextFeedItem
import domain.model.VideoFeedItem

class FeedItemRendererFactory {
    fun getRenderer(item: FeedItem): FeedItemRenderer = when (item) {
        is TextFeedItem -> TextFeedItemRenderer()
        is ImageFeedItem -> ImageFeedItemRenderer()
        is VideoFeedItem -> VideoFeedItemRenderer()
    }
}