package com.example.youtubehwmth6.ui.detail

import androidx.lifecycle.LiveData
import com.example.youtubehwmth6.core.base.BaseViewModel
import com.example.youtubehwmth6.core.network.Resource
import com.example.youtubehwmth6.data.model.PlayListsModel
import com.example.youtubehwmth6.repository.Repository

class DetailViewModel(private val repository: Repository): BaseViewModel() {

    fun playlistItems(id: String): LiveData<Resource<PlayListsModel>> {
        return repository.getPlaylistItems(id)
    }
}
