package com.example.chatuidesign.presentation.homescreenui
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreen() {
    val chatData= listOf(ChatDesignModel(
       R.drawable.salman_khan,
        name="Salman Khan",
        time="10:00 AM",
        message="Hello!"
    ),
        ChatDesignModel(
            R.drawable.sharukh_khan,
            name="Sharukh Khan",
            time="10:00 AM",
            message="Hello!"
        ),
        ChatDesignModel(
            R.drawable.sharadha_kapoor,
            name="Sharadha Kapoor",
            time="10:00 AM",
            message="Hello!"
        ),
        ChatDesignModel(
            R.drawable.akshay_kumar,
            name="Akshay Kumar",
            time="10:00 AM",
            message="Hello!"
        ),
        ChatDesignModel(
            R.drawable.bhuvan_bam,
            name="Bhuvan Bam",
            time="10:00 AM",
            message="Hello!"
        ),
        ChatDesignModel(
            R.drawable.tripti_dimri,
            name="Tripti Dimri",
            time="10:00 AM",
            message="Hello!"
        ),
        ChatDesignModel(
            R.drawable.rajkummar_rao,
            name="Rajkummar Rao",
            time="10:00 AM",
            message="Hello!"
        ), ChatDesignModel(
            R.drawable.naruto,
            name="Naruto Uzumaki",
            time="10:00 AM",
            message="Hello!"
        ), ChatDesignModel(
            R.drawable.naruto_jiraiya,
            name="Sensei Jiraiya",
            time="10:00 AM",
            message="Hello!"
        ), ChatDesignModel(
            R.drawable.rashmika,
            name="Rashmika",
            time="10:00 AM",
            message="Hello!"
        ),
        ChatDesignModel(
            R.drawable.carryminati,
            name="Carry Minati",
            time="10:00 AM",
            message="Hello!"
        ),
        ChatDesignModel(
            R.drawable.kakashi_hatake,
            name="Kakashi Hatake",
            time="10:00 AM",
            message="Hello!"
        ),

        )




    Scaffold(
        containerColor = colorResource(id = R.color.dark_blue),
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = colorResource(id = R.color.light_blue),
                contentColor = Color.White,
                modifier = Modifier.size(65.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.add_chat_icon),
                    contentDescription = null,
                    modifier = Modifier.size(28.dp),
                    tint = Color.White

                )
            }
        }
        ) {
        Column(
            modifier = Modifier
                .padding(it)
                .background(color = colorResource(id = R.color.dark_blue))
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            Box(modifier = Modifier.fillMaxWidth()) {
                var isSearching by remember { mutableStateOf(false) }
                var searchText by remember { mutableStateOf("") }
                var showMenu by remember { mutableStateOf(false) }
                if (isSearching) {
                    TextField(
                        value = searchText,
                        onValueChange = {
                            searchText = it
                        },
                        placeholder = {
                            Text(text = "Search", color = colorResource(id = R.color.light_blue))
                        },
                        singleLine = true,
                        modifier = Modifier
                            .align(Alignment.CenterStart)
                            .padding(start = 16.dp)
                            .fillMaxWidth(0.8f),
                        colors = TextFieldDefaults.colors(
                            unfocusedPlaceholderColor = colorResource(id = R.color.light_blue),
                            focusedPlaceholderColor = colorResource(id = R.color.light_blue),
                            unfocusedContainerColor = colorResource(id = R.color.dark_blue),
                            focusedContainerColor = colorResource(id = R.color.dark_blue),
                            unfocusedIndicatorColor = colorResource(id = R.color.light_blue),
                            focusedIndicatorColor = colorResource(id = R.color.light_blue),
                            unfocusedTextColor = colorResource(id = R.color.light_blue),
                            focusedTextColor = colorResource(id = R.color.light_blue)
                        )
                    )
                } else {
                    Text(
                        "ChatApp",
                        fontSize = 28.sp,
                        color = colorResource(id = R.color.light_blue),
                        modifier = Modifier
                            .align(Alignment.CenterStart)
                            .padding(start = 16.dp),
                        fontWeight = FontWeight.Bold
                    )
                    Row(modifier = Modifier.align(Alignment.CenterEnd)) {
                        IconButton(onClick = {}) {
                            Icon(
                                painter = painterResource(id = R.drawable.camera),
                                contentDescription = null,
                                modifier = Modifier.size(24.dp),
                                tint = colorResource(id = R.color.light_blue)
                            )
                        }
                        if (isSearching) {
                            IconButton(onClick = {
                                isSearching = false
                                searchText = ""
                            }) {
                                Icon(
                                    painter = painterResource(id = R.drawable.cross),
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp),
                                    tint = colorResource(id = R.color.light_blue)
                                )
                            }
                        }else{
                            IconButton(onClick = {
                                isSearching = true
                            }) {
                                Icon(
                                    painter = painterResource(id = R.drawable.search),
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp),
                                    tint = colorResource(id = R.color.light_blue)
                                )
                            }


                        }

                        IconButton(onClick = {
                            showMenu = !showMenu
                        }) {
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
                            ){
                                DropdownMenuItem(text={ Text(text = "New Group",color=Color.DarkGray)}, onClick = {showMenu=false})

                                DropdownMenuItem(text={ Text(text = "New Broadcast",color=Color.DarkGray)}, onClick = {showMenu=false})

                                DropdownMenuItem(text={ Text(text = "Linked Devices",color=Color.DarkGray)}, onClick = {showMenu=false})

                                DropdownMenuItem(text={ Text(text = "Starred Messages",color=Color.DarkGray)}, onClick = {showMenu=false})

                                DropdownMenuItem(text={ Text(text = "Settings",color=Color.DarkGray)}, onClick = {showMenu=false})

                            }

                        }
                    }

                }
            }

            Spacer(modifier = Modifier.height(8.dp))
            HorizontalDivider()
       LazyColumn {
           items(chatData){
               ChatDesign(chatDesignModel = it)
           }
       }


            Spacer(modifier = Modifier.height(12.dp))


        }

    }
}

@Composable
fun AddUserPopup(
    onDismiss: () -> Unit,
) {
    var phoneNumber by remember { mutableStateOf("") }

    var isSearching by remember { mutableStateOf(false) }


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(color = colorResource(id = R.color.dark_blue))
    ) {
        TextField(
            value = phoneNumber,
            onValueChange = { phoneNumber=it},
            label = {Text("Enter Phone Number")},
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            colors = TextFieldDefaults.colors(
                unfocusedPlaceholderColor =colorResource(id=R.color.light_blue),
                focusedPlaceholderColor =colorResource(id=R.color.light_blue),
                unfocusedContainerColor =colorResource(id=R.color.dark_blue),
                focusedContainerColor =colorResource(id=R.color.dark_blue),
                unfocusedIndicatorColor=colorResource(id=R.color.light_blue),
                focusedIndicatorColor=colorResource(id=R.color.light_blue),
                unfocusedTextColor=colorResource(id=R.color.light_blue),
                focusedTextColor=colorResource(id=R.color.light_blue)
            )
        )
        Row{
            Button(onClick = {}, modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(colorResource(R.color.light_blue))
            ){
                Text(text = "Search")
            }
            Spacer(modifier = Modifier.height(8.dp))

            Button(
                onClick = onDismiss,
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(colorResource(R.color.light_blue))
            )
            {
                Text(text = "Cancel")
            }
        }


    }


}







