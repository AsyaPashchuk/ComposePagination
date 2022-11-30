package com.composepagination.pagination

interface Paginator<Key,Item> {
    suspend fun loadNextItems()
    fun reset()
}