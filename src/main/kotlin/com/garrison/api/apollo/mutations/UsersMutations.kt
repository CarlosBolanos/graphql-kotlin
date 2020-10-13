package com.garrison.api.apollo.mutations

import com.expediagroup.graphql.spring.operations.Mutation
import com.garrison.api.business.UserService
import com.garrison.api.business.models.UserModel
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.RequestBody

@Component
class UsersMutations(var userService: UserService): Mutation {
    fun createUser(@RequestBody user: UserModel): UserModel = userService.saveOrUpdate(user)
}