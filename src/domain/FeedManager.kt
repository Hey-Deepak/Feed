package domain

import data.repo.FeedRepository
import presentation.FeedView

class FeedManager(
    private val feedRepository: FeedRepository,
    private val rendererFactory: FeedItemRendererFactory
) {
    fun getRenderedFeed(): List<FeedView> {
        val feedItems = feedRepository.getFeedData()
        return feedItems.map { rendererFactory.getRenderer(it).render(it) }
    }
}