package com.garrison.api.persistence
import com.garrison.api.persistence.entities.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User?, Int?>