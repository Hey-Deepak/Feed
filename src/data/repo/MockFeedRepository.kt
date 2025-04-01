package data.repo

import domain.model.FeedItem
import domain.model.ImageFeedItem
import domain.model.TextFeedItem
import domain.model.VideoFeedItem

class MockFeedRepository : FeedRepository {

    override fun getFeedData(): List<FeedItem> {
        return listOf(
            TextFeedItem(
                id = "1",
                userName = "HeyDeepak",
                timestamp = System.currentTimeMillis(),
                text = "This is a text post"
            ),
            ImageFeedItem(
                id = "2",
                userName = "HeyDeepak",
                timestamp = System.currentTimeMillis(),
                imageUrls = listOf("image1.jpg", "image2.jpg"),
            ),
            VideoFeedItem(
                id = "3",
                userName = "HeyDeepak",
                timestamp = System.currentTimeMillis(),
                videoUrl = "video.mp4",
            )
        )
    }
}
