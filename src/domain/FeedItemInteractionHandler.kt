package domain

import domain.model.FeedItem

interface FeedItemInteractionHandler {
    fun onClick(feedItem: FeedItem)
    fun onLongClick(feedItem: FeedItem)
    fun onLike(feedItem: FeedItem)
    fun onComment(feedItem: FeedItem)
}