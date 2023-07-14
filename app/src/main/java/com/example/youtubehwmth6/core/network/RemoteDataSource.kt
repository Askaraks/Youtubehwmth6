package com.example.youtubehwmth6.core.network

import androidx.viewbinding.BuildConfig
import com.example.youtubehwmth6.core.base.BaseDataSource
import com.example.youtubehwmth6.data.remote.ApiService
import com.example.youtubehwmth6.utils.Constants

class RemoteDataSource(private val apiService: ApiService) : BaseDataSource() {

    suspend fun getPlaylists() = getResult {
        apiService.getPlaylists(
            part = Constants.PART,
            channelId = Constants.CHANNEL_ID,
            apiKey = BuildConfig.BUILD_TYPE,
            maxResults = 20
        )
    }

    suspend fun getPlaylistItems(id: String) = getResult {
        apiService.getPlaylistItem(
            key = BuildConfig.BUILD_TYPE,
            part = Constants.PART,
            playlistId = id,
            maxResults = 100
        )
    }

    suspend fun getVideos(id: String) = getResult {
        apiService.getVideos(
            key = BuildConfig.BUILD_TYPE,
            part = Constants.PART,
            id
        )
    }
}