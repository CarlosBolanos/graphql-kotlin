package com.garrison.api.apollo.queries

import com.expediagroup.graphql.spring.operations.Query
import com.garrison.api.context.ContextualResponse
import com.garrison.api.context.MyGraphQLContext
import org.springframework.stereotype.Component

@Component
class ContextualQuery: Query {
    fun contextualQuery(
            value: Int,
            context: MyGraphQLContext
    ) :ContextualResponse {
        var contextualResponse = ContextualResponse(value, context.myCustomValue)

        return contextualResponse;
    }
}