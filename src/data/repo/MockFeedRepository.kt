package data.repo

import domain.model.FeedItem
import domain.model.ImageFeedItem
import domain.model.TextFeedItem
import domain.model.VideoFeedItem
import domain.repo.FeedRepository

class MockFeedRepository : FeedRepository {

    override fun getFeedData(): List<FeedItem> {
        return mutableListOf(
            TextFeedItem(
                id = "1",
                userName = "HeyDeepak",
                timestamp = System.currentTimeMillis(),
                text = "Hey everyone! Just got back from a trip to the mountains. It was amazing!",
                likeCount = 11,
                commentCount = 1,
                comments = mutableListOf("Wow, sounds fun!")
            ),
            ImageFeedItem(
                id = "2",
                userName = "HiDeepak",
                timestamp = System.currentTimeMillis(),
                imageUrls = listOf(
                    "https://example.com/images/pic1.jpg",
                    "https://example.com/images/pic2.jpg"
                ),
                likeCount = 22,
                commentCount = 2,
                comments = mutableListOf(
                    "Osm View",
                    "Chilling View"
                )
            ),
            VideoFeedItem(
                id = "3",
                userName = "NamasteDeepak",
                timestamp = System.currentTimeMillis(),
                videoUrl = "https://example.com/videos/sunset.mp4",
                likeCount = 33,
                commentCount = 3,
                comments = mutableListOf(
                    "Stunning view!",
                    "Where was this shot?",
                    "I am in Love with this Video!"
                )
            )
        )
    }
}
