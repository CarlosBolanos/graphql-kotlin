package com.garrison.api.context

import com.expediagroup.graphql.execution.GraphQLContext

data class MyGraphQLContext(val myCustomValue: String): GraphQLContext

