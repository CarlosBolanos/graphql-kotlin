package com.garrison.api.persistence.entities

import com.garrison.api.business.models.UserModel
import javax.persistence.*

@Entity
@Table(name="users")
data class User (
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Int,
    var firstName: String,
    var lastName: String,
    var email: String,
    var password: String,
    var userRole: UserRole,
    var isActive: Boolean
) {

    fun toViewModel(): UserModel {
        return UserModel(this.id, this.firstName, this.lastName, this.email, this.password, this.userRole, this.isActive)
    }
}