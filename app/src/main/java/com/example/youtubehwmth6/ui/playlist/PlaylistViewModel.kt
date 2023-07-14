package com.example.youtubehwmth6.ui.playlist

import androidx.lifecycle.LiveData
import com.example.youtubehwmth6.core.base.BaseViewModel
import com.example.youtubehwmth6.core.network.Resource
import com.example.youtubehwmth6.data.model.PlayListsModel
import com.example.youtubehwmth6.repository.Repository

class PlaylistViewModel(private val repository: Repository) : BaseViewModel() {

    fun playlists(): LiveData<Resource<PlayListsModel>> {
        return repository.getPlayLists()
    }
}