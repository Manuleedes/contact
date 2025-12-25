package com.plcoding.contactscomposemultiplatform.ui.theme

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.plcoding.contactscomposemultiplatform.ui.theme.contacts.presentation.ContactListScreen
import com.plcoding.contactscomposemultiplatform.ui.theme.core.presentation.ContactsTheme

@Composable
fun App(
    darkTheme : Boolean,
    dynamicColor: Boolean
){
    ContactsTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ){
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ){
            ContactListScreen(

            )
        }
    }
}