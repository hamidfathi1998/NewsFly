/*
 * Written and Developed by Inuwa Ibrahim - https://linktr.ee/Ibrajix
*/

package com.ibrajix.newsfly.network

import com.ibrajix.newsfly.model.responses.AllNewsResponse
import com.ibrajix.newsfly.model.responses.PopularNewsResponse
import com.ibrajix.newsfly.utils.Urls
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface ApiService {

    @GET("everything")
    suspend fun getRecentNews(
        @Query("q") q: String = "crypto",
        @Query("apiKey") apiKey: String = Urls.API_KEY,
        @Query("page") page: Int,
        @Query("pageSize") pageSize: Int
    ) : AllNewsResponse

    @GET("everything")
    suspend fun getPopularNews(
            @Query("q") q: String = "crypto",
            @Query("apiKey") apiKey: String = Urls.API_KEY,
            @Query("pageSize") pageSize: Int = 5
    ) : PopularNewsResponse

    @GET("everything")
    suspend fun searchForNews(
            @Query("q") q: String,
            @Query("apiKey") apiKey: String = Urls.API_KEY
    ): Response<AllNewsResponse>

}