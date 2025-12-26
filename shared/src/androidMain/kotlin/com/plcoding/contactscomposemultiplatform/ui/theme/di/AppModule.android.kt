package com.plcoding.contactscomposemultiplatform.ui.theme.di

import android.content.Context
import com.plcoding.contactscomposemultiplatform.ui.theme.contacts.data.SqlDelightContactDataSource
import com.plcoding.contactscomposemultiplatform.ui.theme.contacts.domain.ContactDataSource
import com.plcoding.contactscomposemultiplatform.ui.theme.core.data.DatabaseDriverFactory

actual class AppModule(
    private val context: Context
) {
    actual val contactDataSource: ContactDataSource by lazy {
        SqlDelightContactDataSource(
            db = ContactDatabase(
                driver = DatabaseDriverFactory(context).create()
            )
        )
    }

}