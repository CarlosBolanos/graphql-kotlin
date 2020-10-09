package com.garrison.api.business.models

import com.garrison.api.persistence.entities.User
import com.garrison.api.persistence.entities.UserRole

data class UserModel(
    var id: Int,
    var firstName: String,
    var lastName: String,
    var email: String,
    var password: String,
    var userRole: UserRole,
    var isActive: Boolean
) {
    fun toEntity(): User {
        return User(this.id, this.firstName, this.lastName, this.email, this.password, this.userRole, this.isActive)
    }
}