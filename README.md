# Feed Framework (Kotlin)

## 📌 Project Title
**Feed Framework (Kotlin)**  
A modular and extensible feed rendering engine — like a simplified backend for feeds in apps like Facebook, Instagram, or Twitter.

---

## 🧩 Overview
This project is a **low-level design (LLD)** of a **Feed System Framework** in Kotlin.  
It handles:

- Rendering different feed item types (Text, Image, Video)
- Handling user interactions (like, comment, click)
- Simulating a real-world feed system (without actual UI)

---

## 🎯 Features
- ✅ `FeedItem` support (Text, Image, Video)
- ✅ Renderer abstraction (`FeedItemRenderer`)
- ✅ FeedView abstraction for UI layer
- ✅ Like and comment handling
- ✅ Re-rendering logic to reflect state changes
- ✅ Simulated data with `MockFeedRepository`
- ✅ Extensible design: add new types or features easily

---

## 🏗️ Architecture (Clean, MVVM-ish)
```
Data Layer       →    MockFeedRepository
Domain Layer     →    FeedItem, FeedManager, Interfaces
Presentation     →    FeedView, Renderers
Main Entry       →    Simulated feed output with interactions
```

---

## 📦 Project Structure
```
feed/
└── src/
    └── root/
        ├── Main.kt                              // Main entry point
        │
        ├── data/
        │   └── repository/
        │       └── MockFeedRepository.kt      // Fake data provider
        │
        ├── domain/
        │   ├── model/
        │   │   ├── FeedItem.kt
        │   │   ├── TextFeedItem.kt
        │   │   ├── ImageFeedItem.kt
        │   │   ├── VideoFeedItem.kt
        │   │   ├── Likeable.kt
        │   │   └── Commentable.kt
        │   │
        │   ├── repository/
        │   │   └── FeedRepository.kt          // Interface for data source
        │   │
        │   └── usecase/
        │       └── FeedManager.kt             // Main orchestrator
        │
        ├── presentation/
        │   ├── view/
        │   │   ├── FeedType.kt
        │   │   └── FeedView.kt                // View abstraction for UI
        │   │
        │   └── renderer/
        │       ├── FeedItemRenderer.kt
        │       ├── TextFeedItemRenderer.kt
        │       ├── ImageFeedItemRenderer.kt
        │       ├── VideoFeedItemRenderer.kt
        │       └── FeedItemRendererFactory.kt
        │
        └── util/
            └── FeedCard.kt                    // Helper: holds FeedItem + FeedView
```

---

## 🚀 How to Run

1. Clone the repo or copy the files into IntelliJ IDEA (Kotlin → JVM → IntelliJ).
2. Set `Main.kt` as your entry point.
3. Click ▶️ **Run**.
4. Observe the feed data being rendered.
5. Like and comment interactions will trigger, and updated data will be printed.

---

## 🧪 Simulated Output
```
-- FeedView --
Type: TEXT
Username: HeyDeepak
Content: Hello from the mountains!
Likes: 3, Comments: 1
[Like clicked]
[Comment added: "You are Looking Like a WoW!!!"]
[onClick clicked]
[onLongPress clicked]
Updated Likes: 4, Comments: 2
```

---

## 🧠 Design Decisions

- `FeedView` is **immutable**, like a snapshot (just like a UI model).
- `FeedItem` is mutable and stores the actual state.
- `FeedCard` is introduced to **link FeedItem and FeedView**, so you can update both together.
- **Renderer pattern** ensures that adding new feed types (e.g., Poll, Audio) is plug-and-play.
- Like/comment logic is handled via interfaces (`Likeable`, `Commentable`) for separation of concerns.

---

## 🔧 How to Extend

- Add a new type of feed:
  - Create a new data class: `PollFeedItem.kt`
  - Add a new renderer: `PollFeedItemRenderer.kt`
  - Register it in `FeedItemRendererFactory.kt`
- Add new interactions:
  - Update `FeedView` to support callbacks (e.g., onShare)
  - Extend interfaces if needed

---
