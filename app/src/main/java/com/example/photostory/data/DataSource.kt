package com.example.photostory.data

import com.example.photostory.R
import com.example.photostory.model.PhotoStory

class Datasource {

    fun loadPhotoStory(): List<PhotoStory> {
        return listOf<PhotoStory>(
            PhotoStory(R.string.PhotoStory1, R.drawable.image1),
            PhotoStory(R.string.PhotoStory2, R.drawable.image2),
            PhotoStory(R.string.PhotoStory3, R.drawable.image3),
            PhotoStory(R.string.PhotoStory4, R.drawable.image4),
            PhotoStory(R.string.PhotoStory5, R.drawable.image5),
            PhotoStory(R.string.PhotoStory6, R.drawable.image6),
            PhotoStory(R.string.PhotoStory7, R.drawable.image7),
            PhotoStory(R.string.PhotoStory8, R.drawable.image8),
            PhotoStory(R.string.PhotoStory9, R.drawable.image9),
            PhotoStory(R.string.PhotoStory10, R.drawable.image10)
        )
    }
}


