package com.example.demo.app.model.user

/**
 * Created by toyotakeisuke on 2017/05/29.
 */
data class UserModel(val id: Int, val name: String, val pref: String) {
    companion object {
        private val ALL_USERS: List<UserModel> = listOf(
                UserModel(1, "Alice", "熊本県"),
                UserModel(2, "Bob", "熊本県"),
                UserModel(3, "Chris", "熊本県"),
                UserModel(4, "Denis", "熊本県")
        )

        fun findAll(): List<UserModel> {
            return ALL_USERS
        }

        fun findById(id: Int): UserModel? {
            return ALL_USERS.find { u -> u.id == id }
        }
    }
}