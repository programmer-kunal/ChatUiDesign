package com.example.chatuidesign.callscreenui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatuidesign.R
import com.example.chatuidesign.presentation.bottomnavigataionui.BottomNavigation
import com.example.chatuidesign.presentation.updatescreenui.TopBar
import com.example.kchat.presentation.callscreen.Call

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CallScreen() {
    val sampleCall = listOf(
        Call(
            image = R.drawable.salman_khan,
            name = "Salman Khan",
            isMissed = true,
            time = "Yesterday,11:30 AM"
        ),
        Call(
            image = R.drawable.sharadha_kapoor,
            name = "Sharadha Kapoor",
            isMissed = false,
            time = "Today,10:30 AM"
        ),
        Call(
            image = R.drawable.rashmika,
            name = "Rashmika Mandanna",
            isMissed = true,
            time = "20 Aug,09:30 AM"
        ),
        Call(
            image = R.drawable.tripti_dimri,
            name = "Tripti Dimri",
            isMissed = false,
            time = "Yesterday,08:30 AM"
        ),
        Call(
            image = R.drawable.disha_patani,
            name = "Disha Patani",
            isMissed = true,
            time = "Yesterday,12:30 AM"
        ),
        Call(image = R.drawable.gara, name = "Gara", isMissed = false, time = "Yesterday,01:30 AM"),
        Call(
            image = R.drawable.kakashi_hatake,
            name = "Kakashi Hatake",
            isMissed = true,
            time = "Yesterday,02:30 AM"
        ),
        Call(
            image = R.drawable.naruto,
            name = "Naruto Uzumaki",
            isMissed = false,
            time = "Yesterday,03:30 AM"
        ),
        Call(
            image = R.drawable.naruto_jiraiya,
            name = "Master Jiraiya",
            isMissed = true,
            time = "Yesterday,04:30 AM"
        ),
        Call(
            image = R.drawable.ajay_devgn,
            name = "Ajay Devgn",
            isMissed = false,
            time = "Yesterday,05:30 AM"
        ),
        Call(
            image = R.drawable.akshay_kumar,
            name = "Akshay Kumar",
            isMissed = true,
            time = "Yesterday,06:30 AM"
        ),
        Call(
            image = R.drawable.bhuvan_bam,
            name = "Bhuvan Bam",
            isMissed = false,
            time = "Yesterday,07:30 AM"
        )
    )

    Scaffold(
        containerColor = colorResource(id = R.color.dark_blue),
        topBar = { TopBar("Calls") },
        bottomBar = {
            BottomNavigation()
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = colorResource(id = R.color.light_blue),
                modifier = Modifier.size(65.dp),
                contentColor = Color.White
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.add_call),
                    contentDescription = null
                )
            }
        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            Spacer(modifier = Modifier.height(16.dp))
            FavouriteSection()

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.light_blue)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    text = "Start a New Call",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Recent Calls",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.light_blue),
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )

            LazyColumn {
                items(sampleCall) { data ->
                    CallItemDesign(data)
                }
            }
        }
    }
}
