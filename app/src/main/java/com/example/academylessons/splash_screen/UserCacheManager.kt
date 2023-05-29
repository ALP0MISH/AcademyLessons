package com.example.academylessons.splash_screen

import android.content.Context
import com.example.academylessons.models.User
import com.google.gson.Gson

private const val USER_SHARED_PREF_KEY = "USER_SHARED_PREF_KEY"
private const val USER_PREF_KEY = "USER_PREF_KEY"

class UserCacheManager(
    private val context: Context
) {

    private val sharedPreferences = context.getSharedPreferences(
        USER_SHARED_PREF_KEY,
        Context.MODE_PRIVATE
    )

    fun getUser(): User {
        val userString = sharedPreferences.getString(
            USER_PREF_KEY,
            null
        )

        val user = Gson().fromJson(userString, User::class.java)
        return user
    }

    fun saveNewUser(user: User) {
        val userGsonString: String = Gson().toJson(user)
        sharedPreferences
            .edit()
            .putString(USER_PREF_KEY, userGsonString)
            .apply()
    }

    fun removeCurrentUser() {
    sharedPreferences
        .edit()
        .clear()
        .apply()
    }
}