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
                text = "Hello world! This is a text post.",
                likeCount = 1,
                commentCount = 1
            ),
            ImageFeedItem(
                id = "2",
                userName = "HiDeepak",
                timestamp = System.currentTimeMillis(),
                imageUrls = listOf("image1.png", "image2.png"),
                likeCount = 2,
                commentCount = 2
            ),
            VideoFeedItem(
                id = "3",
                userName = "NamasteDeepak",
                timestamp = System.currentTimeMillis(),
                videoUrl = "video.mp4",
                likeCount = 3,
                commentCount = 3
            )
        )
    }
}
