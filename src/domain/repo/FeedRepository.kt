package domain.repo

import domain.model.FeedItem

interface FeedRepository {
    fun getFeedData(): List<FeedItem>
}