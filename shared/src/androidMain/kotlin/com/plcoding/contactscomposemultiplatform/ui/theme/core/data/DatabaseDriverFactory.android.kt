package com.plcoding.contactscomposemultiplatform.ui.theme.core.data

import android.content.Context
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

actual class DatabaseDriverFactory(
    private val context: Context
) {
    actual fun create(): SqlDriver {
        return AndroidSqliteDriver(
            ContactDataBase.Schema,
            context,
            "contact.db"
        )
    }
}