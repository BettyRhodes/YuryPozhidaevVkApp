package com.example.vkapi.data.datasource

import com.example.vkapi.data.network.Api
import com.example.vkapi.data.response.PostResponse
import io.reactivex.Single
import javax.inject.Inject

interface PostsDataSource {
    fun getPosts(userId: Int): Single<List<PostResponse>>
}

class PostsDataSourceImpl @Inject constructor(private val api: Api): PostsDataSource{
    override fun getPosts(userId: Int): Single<List<PostResponse>> =
            api.getPosts(userId)

}