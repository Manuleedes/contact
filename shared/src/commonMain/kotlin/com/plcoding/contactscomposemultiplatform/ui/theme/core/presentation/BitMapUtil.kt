package com.plcoding.contactscomposemultiplatform.ui.theme.core.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap

@Composable
expect fun rememberBitMapFromBytes(bytes: ByteArray?): ImageBitmap?
