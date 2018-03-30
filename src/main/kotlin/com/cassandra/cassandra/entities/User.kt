package com.cassandra.cassandra.entities

import com.datastax.driver.core.utils.UUIDs
import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table
import java.util.*


@Table("user")
data class User(
        @PrimaryKey
        val id: UUID= UUIDs.timeBased(),
        val firstName:String="",
        val lastName:String="",
        val birthDay:Date

)
