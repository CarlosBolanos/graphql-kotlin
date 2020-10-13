package com.garrison.api.business

import com.garrison.api.business.models.UserModel
import com.garrison.api.persistence.*
import org.springframework.stereotype.Service


@Service
class UserService (var userRepository: UserRepository) {
    fun getAllUsers() : List<UserModel?> = userRepository.findAll().map{ user -> user?.toViewModel() }

    fun saveOrUpdate(user: UserModel): UserModel {
        var updatedUser = userRepository.save(user.toEntity())
        return updatedUser.toViewModel()
    }
}