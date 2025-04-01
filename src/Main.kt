import data.repo.MockFeedRepository
import domain.model.FeedCard
import presentation.renderer.FeedItemRendererFactory

fun main() {

    val repository = MockFeedRepository()
    val rendererFactory = FeedItemRendererFactory()

    val feedItems = repository.getFeedData()

    // Wrapping each FeedItem and its rendered FeedView in a FeedCard
    val feedCards = feedItems.map { item ->
        FeedCard(item, rendererFactory.getRenderer(item).render(item))
    }

    /*  Note:- When we use onComment() or onLike() then object will not change like or comment count because
    *   FeedView is a data snapshot, not a reference.
    *   We are not using viewModel here otherWise changes will show directly.
    *   Solution: Re-render FeedView after any state change
    *
    *   FeedCard is a simple helper wrapper class that you create to keep track of both:
    *   1. The original FeedItem (the data model that can be updated)
    *   2. The rendered FeedView (the UI snapshot that is shown in the feed)
    */

    feedCards.forEach { card ->

        val feedView = card.view

        println("\n-- FeedView --")
        println("Type: ${feedView.type}")
        println("Username: ${feedView.userName}")
        println("Timestamp: ${feedView.timestamp}")
        println("Content: ${feedView.content}")
        println("Likes: ${feedView.likeCount}, Comments: ${feedView.commentCount}")

        // Trigger interaction
        card.view.onLike?.invoke()
        card.view.onComment?.invoke("You are Looking Like a WoW!!!")
        card.view.onClick.invoke()
        card.view.onLongClick?.invoke()

        // Re-render to get updated like/comment counts
        card.view = rendererFactory.getRenderer(card.item).render(card.item)

        // Print updated data
        println("Updated Likes: ${card.view.likeCount}, Comments: ${card.view.commentCount}")

    }
}