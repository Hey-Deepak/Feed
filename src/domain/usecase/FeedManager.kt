package domain.usecase

import domain.repo.FeedRepository
import presentation.view.FeedView
import presentation.renderer.FeedItemRendererFactory

class FeedManager(
    private val feedRepository: FeedRepository,
    private val rendererFactory: FeedItemRendererFactory
) {
    fun getRenderedFeed(): List<FeedView> {
        val feedItems = feedRepository.getFeedData()
        return feedItems.map { rendererFactory.getRenderer(it).render(it) }
    }
}