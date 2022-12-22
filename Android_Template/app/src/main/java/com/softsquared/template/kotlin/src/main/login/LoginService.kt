package com.softsquared.template.kotlin.src.main.login

import com.softsquared.template.kotlin.config.ApplicationClass
import com.softsquared.template.kotlin.src.main.login.models.PostSignUpRequest
import com.softsquared.template.kotlin.src.main.login.models.SignUpResponse
import com.softsquared.template.kotlin.src.main.login.models.UserResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginService(val loginFragmentInterface: LoginFragmentInterface) {

    fun tryGetUsers(){
        val loginRetrofitInterface = ApplicationClass.sRetrofit.create(LoginRetrofitInterface::class.java)
        loginRetrofitInterface.getUsers().enqueue(object : Callback<UserResponse>{
            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                loginFragmentInterface.onGetUserSuccess(response.body() as UserResponse)
            }

            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                loginFragmentInterface.onGetUserFailure(t.message ?: "통신 오류")
            }
        })
    }

    fun tryPostSignUp(postSignUpRequest: PostSignUpRequest){
        val loginRetrofitInterface = ApplicationClass.sRetrofit.create(LoginRetrofitInterface::class.java)
        loginRetrofitInterface.postSignUp(postSignUpRequest).enqueue(object : Callback<SignUpResponse>{
            override fun onResponse(call: Call<SignUpResponse>, response: Response<SignUpResponse>) {
                loginFragmentInterface.onPostSignUpSuccess(response.body() as SignUpResponse)
            }

            override fun onFailure(call: Call<SignUpResponse>, t: Throwable) {
                loginFragmentInterface.onPostSignUpFailure(t.message ?: "통신 오류")
            }
        })
    }

}
