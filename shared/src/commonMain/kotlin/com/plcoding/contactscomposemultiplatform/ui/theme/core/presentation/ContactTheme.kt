package com.plcoding.contactscomposemultiplatform.ui.theme.core.presentation

import androidx.compose.runtime.Composable
@Composable
expect fun ContactsTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
)