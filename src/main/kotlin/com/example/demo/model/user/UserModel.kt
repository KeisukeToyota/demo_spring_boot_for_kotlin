package com.example.demo.model.user

/**
 * Created by toyotakeisuke on 2017/05/29.
 */
data class UserModel(val id: Int, val name: String) {
    companion object {
        private val ALL_USERS: List<UserModel> = listOf(
                UserModel(1, "Alice"),
                UserModel(2, "Bob"),
                UserModel(3, "Chris"),
                UserModel(4, "Denis")
        )
        fun findAll(): List<UserModel> {
            return ALL_USERS
        }
        fun findById(id: Int): UserModel? {
            return ALL_USERS.find { u -> u.id == id }
        }
    }
}