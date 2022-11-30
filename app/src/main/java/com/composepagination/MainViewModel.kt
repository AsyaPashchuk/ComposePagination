package com.composepagination

import androidx.lifecycle.ViewModel
import com.composepagination.data.model.ListItem

class MainViewModel: ViewModel() {

}

data class ScreenState(
    val isLoading: Boolean = false,
    val items: List<ListItem> = emptyList(),
    val error: String? = null,
    val endReached: Boolean = false,
    val page: Int = 0
)