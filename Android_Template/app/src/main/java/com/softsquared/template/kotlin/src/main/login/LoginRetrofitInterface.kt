package com.softsquared.template.kotlin.src.main.login

import com.softsquared.template.kotlin.src.main.login.models.PostSignUpRequest
import com.softsquared.template.kotlin.src.main.login.models.SignUpResponse
import com.softsquared.template.kotlin.src.main.login.models.UserResponse
import retrofit2.Call
import retrofit2.http.*

interface LoginRetrofitInterface {
    @GET("/template/users")
    fun getUsers() : Call<UserResponse>

    @POST("/template/users")
    fun postSignUp(@Body params: PostSignUpRequest): Call<SignUpResponse>
}
