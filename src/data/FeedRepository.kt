package data

import domain.model.FeedItem

interface FeedRepository {
    fun getFeedData(): List<FeedItem>
}