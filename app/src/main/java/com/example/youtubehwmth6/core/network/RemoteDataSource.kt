package com.example.youtubehwmth6.core.network

import com.example.youtubehwmth6.BuildConfig
import com.example.youtubehwmth6.core.base.BaseDataSource
import com.example.youtubehwmth6.data.remote.ApiService
import com.example.youtubehwmth6.utils.Constants

class RemoteDataSource(private val apiService: ApiService) : BaseDataSource() {

    suspend fun getPlaylists() = getResult {
        apiService.getPlaylists(
            part = Constants.PART,
            channelId = Constants.CHANNEL_ID,
            apiKey = BuildConfig.API_KEY,
            maxResults = 20
        )
    }

    suspend fun getPlaylistItems(id: String) = getResult {
        apiService.getPlaylistItem(
            key = BuildConfig.BASE_URL,
            part = Constants.PART,
            playlistId = id,
            maxResults = 100
        )
    }

    suspend fun getVideos(id: String) = getResult {
        apiService.getVideos(
            key = BuildConfig.API_KEY,
            part = Constants.PART,
            id
        )
    }
}