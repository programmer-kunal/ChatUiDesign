package com.example.chatuidesign.presentation.updatescreenui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatuidesign.R

@Composable
@Preview(showBackground = true)
fun TopBar(
    title: String = "Updates" // default title, can be "KChat", "Communities", "Calls", etc.
) {
    var isSearching by remember { mutableStateOf(false) }
    var search by remember { mutableStateOf("") }
    var showMenu by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(colorResource(id = R.color.dark_blue))
            .statusBarsPadding() // replaces hardcoded top padding
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (isSearching) {
                    TextField(
                        value = search,
                        onValueChange = { search = it },
                        placeholder = { Text(text = "Search") },
                        colors = TextFieldDefaults.colors(
                            unfocusedPlaceholderColor = colorResource(id = R.color.light_blue),
                            focusedPlaceholderColor = colorResource(id = R.color.light_blue),
                            unfocusedContainerColor = colorResource(id = R.color.dark_blue),
                            focusedContainerColor = colorResource(id = R.color.dark_blue),
                            unfocusedIndicatorColor = colorResource(id = R.color.light_blue),
                            focusedIndicatorColor = colorResource(id = R.color.light_blue),
                            unfocusedTextColor = colorResource(id = R.color.light_blue),
                            focusedTextColor = colorResource(id = R.color.light_blue)
                        ),
                        modifier = Modifier
                            .weight(1f)
                            .padding(end = 8.dp),
                        singleLine = true
                    )
                } else {
                    Text(
                        text = title,
                        fontSize = 28.sp,
                        color = colorResource(id = R.color.light_blue),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .alignByBaseline()
                            .padding(start = 4.dp)
                    )
                }

                Spacer(modifier = Modifier.weight(1f))

                if (isSearching) {
                    IconButton(onClick = {
                        isSearching = false
                        search = ""
                    }) {
                        Icon(
                            painter = painterResource(id = R.drawable.cross),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp),
                            tint = colorResource(id = R.color.light_blue)
                        )
                    }
                } else {
                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(id = R.drawable.camera),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp),
                            tint = colorResource(id = R.color.light_blue)
                        )
                    }
                    IconButton(onClick = { isSearching = true }) {
                        Icon(
                            painter = painterResource(id = R.drawable.search),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp),
                            tint = colorResource(id = R.color.light_blue)
                        )
                    }
                    IconButton(onClick = { showMenu = true }) {
                        Icon(
                            painter = painterResource(id = R.drawable.more),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp),
                            tint = colorResource(id = R.color.light_blue)
                        )
                        DropdownMenu(
                            expanded = showMenu,
                            onDismissRequest = { showMenu = false },
                            modifier = Modifier.background(color = colorResource(id = R.color.light_blue))
                        ) {
                            DropdownMenuItem(
                                text = { Text(text = "Status Privacy", color = Color.DarkGray) },
                                onClick = { showMenu = false }
                            )
                            DropdownMenuItem(
                                text = { Text(text = "Create Channel", color = Color.DarkGray) },
                                onClick = { showMenu = false }
                            )
                            DropdownMenuItem(
                                text = { Text(text = "Settings", color = Color.DarkGray) },
                                onClick = { showMenu = false }
                            )
                        }
                    }
                }
            }

            // Horizontal divider below top bar
            HorizontalDivider(color = Color.Gray, thickness = 1.dp)
        }
    }
}
