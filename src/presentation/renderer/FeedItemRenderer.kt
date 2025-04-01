package presentation.renderer

import domain.model.FeedItem
import presentation.view.FeedView

interface FeedItemRenderer {
    fun render(feedItem: FeedItem): FeedView
}