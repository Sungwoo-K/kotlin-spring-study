package com.swk.myapp.post

// query-model, view-model
// domain-model(JPA entity)
data class PostResponse(
    val id : Long,
    val title : String,
    val content: String,
    val createdDate: String
)