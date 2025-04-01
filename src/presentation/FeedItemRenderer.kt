package presentation

import domain.model.FeedItem

interface FeedItemRenderer {
    fun render(feedItem: FeedItem): FeedView
}