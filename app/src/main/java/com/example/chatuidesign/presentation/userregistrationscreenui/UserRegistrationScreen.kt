package com.example.chatuidesign.presentation.userregistrationscreenui
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatuidesign.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun UserRegistrationScreen() {
    var expanded by remember { mutableStateOf(false) }
    var selectedCountry by remember { mutableStateOf("India") }
    var countryCode by remember { mutableStateOf("+91") }
    var phoneNumber by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.dark_blue))
            .padding(top = 40.dp, bottom = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Enter your phone number",
            fontSize = 20.sp,
            color = colorResource(id = R.color.light_blue),
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(24.dp))
        Row {
            Text(text = "chatApp will need to verify your phone number.",color= colorResource(id = R.color.light_blue))
            Spacer(modifier = Modifier.width(4.dp))

            Text(text = "what's", color = Color.Gray)
        }
        Text(text = "my phone number", color = Color.Gray)

        Spacer(modifier = Modifier.height(16.dp))


        // Country selection
        TextButton(onClick = { expanded = true }, modifier = Modifier.fillMaxWidth()) {
            Box(modifier = Modifier.width(230.dp)) {
                Text(
                    text = selectedCountry,
                    color = colorResource(id = R.color.light_blue),
                    modifier = Modifier.align(Alignment.Center),
                    fontSize = 16.sp
                )
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = null,
                    tint = colorResource(id = R.color.light_blue),
                    modifier = Modifier.align(Alignment.CenterEnd)
                )
            }
        }
        HorizontalDivider(
            modifier = Modifier.padding(horizontal = 66.dp), thickness = 2.dp,
            color = colorResource(id = R.color.light_blue),
        )
        DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
            listOf("India,", "USA", "UK", "Germany").forEach { country ->
                DropdownMenuItem(
                    text = { Text(text = country) }, onClick = {
                        selectedCountry = country
                        expanded = false
                    })
            }
        }
        Spacer(modifier = Modifier.height(16.dp))

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = colorResource(id = R.color.dark_blue))
                .padding(top = 40.dp, bottom = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                TextField(
                    value = countryCode,
                    onValueChange = {},
                    modifier = Modifier.width(70.dp),
                    singleLine = true,
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = colorResource(id = R.color.dark_blue),
                        focusedContainerColor = colorResource(id = R.color.dark_blue),
                        unfocusedIndicatorColor = colorResource(id = R.color.light_blue),
                        focusedIndicatorColor = colorResource(id = R.color.light_blue),
                        unfocusedTextColor = colorResource(id = R.color.light_blue),
                        focusedTextColor = colorResource(id = R.color.light_blue)
                    )
                )

                Spacer(modifier = Modifier.width(10.dp))
                TextField(
                    value = phoneNumber,
                    onValueChange = { phoneNumber = it },
                    placeholder = { Text(text = "Phone Number") },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true,
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
            }
            Spacer(modifier = Modifier.height(26.dp))
            Button(
                onClick = {},
                shape = RoundedCornerShape(6.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.light_blue))
            ) {
                Text("Send OTP", fontSize = 16.sp, color = Color.White)
            }
        }
    }
}