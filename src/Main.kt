import data.repo.MockFeedRepository
import domain.usecase.FeedManager
import presentation.renderer.FeedItemRendererFactory

fun main() {
    val repository = MockFeedRepository()
    val rendererFactory = FeedItemRendererFactory()
    val feedManager = FeedManager(repository, rendererFactory)

    val renderedFeed = feedManager.getRenderedFeed()
    renderedFeed.forEach {
        println("Rendered FeedView: ${it}")
        it.onClick.invoke()
        it.onLike?.invoke()
    }
}