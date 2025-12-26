package com.plcoding.contactscomposemultiplatform.ui.theme.contacts.data

import com.plcoding.contactscomposemultiplatform.ui.theme.contacts.domain.Contact

fun ContactEntity.toContact(): Contact{
    return Contact(
        id = id,
        firstName = firstName,
        lastName = lastName,
        email = email,
        phoneNumber = phoneNumber,
        photoBytes = null
    )
}