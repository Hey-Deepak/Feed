package util

import domain.model.FeedItem
import presentation.view.FeedView


/*
*   FeedCard is a simple helper wrapper class that you create to keep track of both:
*   1. The original FeedItem (the data model that can be updated)
*   2. The rendered FeedView (the UI snapshot that is shown in the feed)
* */

data class FeedCard(
    val item: FeedItem,
    var view: FeedView
)