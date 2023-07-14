package com.example.youtubehwmth6.ui.player

import androidx.lifecycle.LiveData
import com.example.youtubehwmth6.core.base.BaseViewModel
import com.example.youtubehwmth6.core.network.Resource
import com.example.youtubehwmth6.data.model.PlayListsModel
import com.example.youtubehwmth6.repository.Repository

class PlayerViewModel(private val repository: Repository): BaseViewModel() {

    fun getVideos(id: String): LiveData<Resource<PlayListsModel>> {
        return repository.getVideos(id)
    }
}