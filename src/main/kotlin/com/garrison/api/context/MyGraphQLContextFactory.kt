package com.garrison.api.context

import com.expediagroup.graphql.spring.execution.GraphQLContextFactory
import org.springframework.http.server.reactive.ServerHttpRequest
import org.springframework.http.server.reactive.ServerHttpResponse
import org.springframework.stereotype.Component

@Component
class MyGraphQLContextFactory: GraphQLContextFactory<MyGraphQLContext> {
    override suspend fun generateContext(
            request: ServerHttpRequest,
            response: ServerHttpResponse
    ): MyGraphQLContext = MyGraphQLContext(
            myCustomValue = request.headers.getFirst("MyHeader") ?: "defaultContext"
    )
}