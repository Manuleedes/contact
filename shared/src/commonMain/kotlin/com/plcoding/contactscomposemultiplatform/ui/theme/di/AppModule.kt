package com.plcoding.contactscomposemultiplatform.ui.theme.di

import com.plcoding.contactscomposemultiplatform.ui.theme.contacts.domain.ContactDataSource

expect class AppModule {
     val contactDataSource: ContactDataSource
}