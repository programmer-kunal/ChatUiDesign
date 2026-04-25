package com.example.chatuidesign.presentation.updatescreenui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
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
@Composable
@Preview(showBackground = true, showSystemUi = true)
fun UpdateScreen() {
    val sampleStatus = listOf(
        StatusData(R.drawable.salman_khan, "Salman Khan", "10 min ago"),
        StatusData(R.drawable.rashmika, "Rashmika Mandanna", "32 min ago"),
        StatusData(R.drawable.sharukh_khan, "Shahrukh Khan", "39 min ago"),
        StatusData(R.drawable.sharadha_kapoor, "Shraddha Kapoor", "42 min ago"),
        StatusData(R.drawable.ajay_devgn, "Ajay Devgn", "46 min ago"),
        StatusData(R.drawable.akshay_kumar, "Akshay Kumar", "49 min ago"),
        StatusData(R.drawable.bhuvan_bam, "Bhuvan Bam", "52 min ago"),
        StatusData(R.drawable.carryminati, "Carry Minati", "55 min ago"),
        StatusData(R.drawable.disha_patani, "Disha Patani", "59 min ago"),
        StatusData(R.drawable.hrithik_roshan, "Hrithik Roshan", "1 h ago"),
        StatusData(R.drawable.kartik_aaryan, "Kartik Aaryan", "1 h ago"),
        StatusData(R.drawable.rajkummar_rao, "Rajkumar Rao", "2 h ago"),
        StatusData(R.drawable.mrbeast, "Mr Beast", "3 h ago"),
        StatusData(R.drawable.tripti_dimri, "Tripti Dimri", "6 h ago"),
    )

    val sampleChannels = listOf(
        Channels(R.drawable.naruto, "Naruto Uzumaki", "Unexpected Character"),
        Channels(R.drawable.gara, "Gara Of The Sand", "Naruto's Friend"),
        Channels(R.drawable.kakashi_hatake, "Kakashi Hatake", "Naruto's Sensei"),
        Channels(R.drawable.naruto_jiraiya, "Master Jiraiya", "Naruto's Mentor")
    )

    Scaffold(
        containerColor = colorResource(id = R.color.dark_blue),
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = colorResource(id = R.color.light_blue),
                modifier = Modifier.size(65.dp),
                contentColor = Color.White
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_photo_camera_24),
                    contentDescription = null
                )
            }
        },
        topBar = { TopBar() }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            // 🔹 Status Section (on top, larger)
            Column(
                modifier = Modifier
                    .weight(2f)
                    .verticalScroll(rememberScrollState())
            ) {
                Text(
                    text = "Status",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.light_blue),
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
                )
                MyStatus()
                sampleStatus.forEach {
                    StatusItem(statusData = it)
                }
            }

            HorizontalDivider(color = Color.Gray)

            // 🔹 Channels Section (below, smaller)
            Column(
                modifier = Modifier
                    .weight(1f)
                    .verticalScroll(rememberScrollState())
            ) {
                Text(
                    text = "Channels",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.light_blue),
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                    Text(
                        text = "Stay updated on topics that matter to you. Find channels to follow below",
                        color = Color.Gray
                    )
                }
                Spacer(modifier = Modifier.height(32.dp))
                Text(text = "Find channels to follow", color = Color.Gray)
                Spacer(modifier = Modifier.height(16.dp))
                sampleChannels.forEach {
                    ChannelItemDesign(channels = it)
                }
            }
        }
    }
}
