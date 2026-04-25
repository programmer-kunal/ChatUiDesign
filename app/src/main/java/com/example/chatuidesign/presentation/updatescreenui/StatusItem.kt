package com.example.chatuidesign.presentation.updatescreenui
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatuidesign.R

@Composable
fun MyStatus() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(12.dp)
        .background(colorResource(id = R.color.dark_blue)),verticalAlignment = Alignment.CenterVertically){
        Box{
            Image(
                painter = painterResource(id = R.drawable.uzumaki_naruto),
                contentDescription = null,
                modifier = Modifier
                    .size(60.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )
            Icon(
                painter = painterResource(id = R.drawable.baseline_add_24),
                contentDescription = null,
                modifier = Modifier
                    .size(25.dp)
                    .align(Alignment.BottomEnd)
                    .padding(2.dp)
                    .background(
                        colorResource(id = R.color.light_blue),
                        shape = RoundedCornerShape(12.dp)
                    )
            )

        }
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text(text = "My Status", fontWeight = FontWeight.Bold,color=colorResource(id=R.color.light_blue), fontSize = 16.sp)
            Text(text = "Tap to add status update", fontSize = 14.sp, color = Color.Gray)
        }
    }
}

data class StatusData(val image: Int, val name: String, val time: String)

@Composable
fun  StatusItem(statusData: StatusData) {
    Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 12.dp, vertical = 8.dp),verticalAlignment = Alignment.CenterVertically){
        Image(
            painter = painterResource(statusData.image),
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .padding(4.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop

        )
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text(text = statusData.name, fontWeight = FontWeight.Bold, fontSize = 16.sp,color=colorResource(id=R.color.light_blue))
            Text(text = statusData.time, fontSize = 14.sp, color = Color.Gray)

        }
    }


}