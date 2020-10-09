package com.garrison.api.apollo.queries

import com.expediagroup.graphql.spring.operations.Query
import com.garrison.api.business.UserService
import com.garrison.api.business.models.UserModel
import org.springframework.stereotype.Component

@Component
class UsersQuery(var userService: UserService): Query {
    fun users() :List<UserModel?> = userService.getAllUsers();
}