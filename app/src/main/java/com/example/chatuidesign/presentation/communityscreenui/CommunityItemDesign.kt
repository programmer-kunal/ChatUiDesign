package com.example.chatuidesign.presentation.communityscreenui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatuidesign.R

@Composable
fun CommunityItemDesign(communities: Communities) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .background(color = colorResource(id = R.color.dark_blue)),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Image(
            painter = painterResource(id =communities.image), contentDescription = null,
            modifier = Modifier.size(50.dp)
        )

        Spacer(modifier = Modifier.width(12.dp))
        Column{
            Text(
                text = communities.name,
                color = colorResource(id = R.color.light_blue),
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
            Text(
                text = communities.members,
                color = Color.Gray,
                fontSize = 14.sp
            )


        }

    }

}
data class Communities(val name: String, val members: String,val image: Int)