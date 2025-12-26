package com.plcoding.contactscomposemultiplatform.ui.theme.core.data

import com.squareup.sqldelight.db.SqlDriver

expect class DatabaseDriverFactory {
     fun create(): SqlDriver

}