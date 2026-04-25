package com.example.chatuidesign.callscreenui

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatuidesign.R

@Composable
@Preview(showBackground = true)
fun FavouriteSection() {
    val sampleFavourite=listOf(
        FavouriteContact(image = R.drawable.sharadha_kapoor,name="Sharadha Kapoor"),
        FavouriteContact(image = R.drawable.rashmika,name="Rashmika Mandanna"),
        FavouriteContact(image = R.drawable.tripti_dimri,name="Tripti Dimri"),
        FavouriteContact(image = R.drawable.disha_patani,name="Disha Patani"),
        FavouriteContact(image = R.drawable.gara,name="Gara"),
        FavouriteContact(image = R.drawable.kakashi_hatake,name="Kakashi Hatake"),
        FavouriteContact(image = R.drawable.naruto,name="Naruto Uzumaki"),
        FavouriteContact(image = R.drawable.naruto_jiraiya,name="Master Jiraiya")
    )


    Column(modifier = Modifier.padding(start = 16.dp, bottom = 8.dp).background(color = colorResource(id = R.color.dark_blue))){
        Text(text = "Favourites",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom =8.dp),
            color = colorResource(id = R.color.light_blue)
        )
        Row(modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())) {
            sampleFavourite.forEach {
                FavouriteItem(it)
                 }
        }
    }


}
data class FavouriteContact(
    val image: Int,val name: String
)
