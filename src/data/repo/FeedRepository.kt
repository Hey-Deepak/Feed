package data.repo

import domain.model.FeedItem

interface FeedRepository {
    fun getFeedData(): List<FeedItem>
}