import data.repo.MockFeedRepository
import domain.usecase.FeedManager
import presentation.renderer.FeedItemRendererFactory

fun main() {
    val repository = MockFeedRepository()
    val rendererFactory = FeedItemRendererFactory()
    val feedManager = FeedManager(repository, rendererFactory)

    val feedViews  = feedManager.getRenderedFeed()
    feedViews.forEach { feedView ->
        println("\n-- FeedView --")
        println("Type: ${feedView.type}")
        println("Username: ${feedView.userName}")
        println("Timestamp: ${feedView.timestamp}")
        println("Content: ${feedView.content}")
        println("Likes: ${feedView.likeCount}, Comments: ${feedView.commentCount}")
        feedView.onClick.invoke()
        feedView.onLongClick?.invoke()
        feedView.onLike?.invoke()
        feedView.onComment?.invoke()
        println("After click on Like and Comment Button")
        println("Likes: ${feedView.likeCount}, Comments: ${feedView.commentCount}")
    }
}