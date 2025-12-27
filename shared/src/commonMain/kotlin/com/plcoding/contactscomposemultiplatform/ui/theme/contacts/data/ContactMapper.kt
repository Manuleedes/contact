package com.plcoding.contactscomposemultiplatform.ui.theme.contacts.data

import com.plcoding.contactscomposemultiplatform.ui.theme.contacts.domain.Contact
import com.plcoding.contactscomposemultiplatform.ui.theme.core.data.ImageStorage

suspend fun ContactEntity.toContact(imageStorage: ImageStorage): Contact{
    return Contact(
        id = id,
        firstName = firstName,
        lastName = lastName,
        email = email,
        phoneNumber = phoneNumber,
        photoBytes = imagePath?.let{imageStorage.getImage(it)}
    )
}