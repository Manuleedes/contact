package com.plcoding.contactscomposemultiplatform.ui.theme.core.presentation

import androidx.compose.ui.window.ComposeUIViewController
import com.plcoding.contactscomposemultiplatform.ui.theme.App

fun MainViewController() = ComposeUIViewController {
    val isDarkTheme = UIScreen.mainScreen.traitCollection.userInterfaceStyle ==
            UIUserInterfaceStyle.UIUserInterfaceStyleDark
    App(darkTheme = isDarkTheme,
        dynamicColor = false)
}