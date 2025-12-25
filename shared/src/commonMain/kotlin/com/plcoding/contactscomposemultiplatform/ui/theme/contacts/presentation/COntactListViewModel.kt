package com.plcoding.contactscomposemultiplatform.ui.theme.contacts.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.plcoding.contactscomposemultiplatform.ui.theme.contacts.domain.Contact
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ContactListViewModel: ViewModel(){
    private val _state = MutableStateFlow(ContactListState(
        contacts = contacts
    ))

    val state = _state.asStateFlow()

    var newContact: Contact? by mutableStateOf(null)

    fun onEvent(event: ContactListEvent){

    }

}

private val contacts = (1 .. 50).map {
    Contact(
        id = it.toLong(),
        firstName = "First$it",
        lastName = "Last$it",
        email = "manuleedes@gmail$it.com",
        phoneNumber = "0712345666",
        photoBytes = null
    )
}