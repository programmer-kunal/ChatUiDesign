package com.example.chatuidesign.presentation.welcomescreenui
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
@Preview(showBackground = true,showSystemUi = true)
@Composable
fun WelcomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.dark_blue)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.welcomescreen),
            contentDescription = null,
            modifier = Modifier.size(300.dp)
        )
        Text(
            "Welcome to ChatApp",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.light_blue)
        )
        Spacer(modifier = Modifier.height(24.dp))
        Row {
            Text("Read Our",color= Color.Gray)
            Spacer(modifier = Modifier.width(8.dp))
            Text("Privacy Policy",color= colorResource(id = R.color.light_blue))
            Spacer(modifier = Modifier.width(8.dp))
            Text("Tap Agree and continue to ",color= Color.Gray)
        }

        Row {
            Text("accept the ",color= Color.Gray)
            Spacer(modifier = Modifier.width(8.dp))
            Text("Terms of Services",color= colorResource(id = R.color.light_blue))
        }
        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {},
            modifier = Modifier.size(280.dp, 43.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.light_blue))
        ) {

            Text("Agree and Continue", fontSize = 16.sp)}

    }


}