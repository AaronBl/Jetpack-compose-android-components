package com.example.myapplication.state.livedata.domain

import com.example.jetexample.state.livedata.data.model.User
import com.example.myapplication.utils.Result

interface Repo {
    fun getUserList(): Result<List<User>>
}