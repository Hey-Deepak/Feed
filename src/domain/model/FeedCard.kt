package domain.model

import presentation.view.FeedView

data class FeedCard(
    val item: FeedItem,
    var view: FeedView
)