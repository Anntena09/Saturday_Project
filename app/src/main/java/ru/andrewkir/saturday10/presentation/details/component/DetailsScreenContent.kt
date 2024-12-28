package ru.andrewkir.saturday10.presentation.details.component

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import com.ramcosta.composedestinations.annotation.Destination
import ru.andrewkir.saturday10.data.models.UserModel
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier



@Destination
@Composable
fun UsersCard(
  user: UserModel,
) {
  Column(
    modifier = Modifier
      .fillMaxSize()
      .padding(16.dp),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
  ) {
    Surface(
      modifier = Modifier
        .padding(bottom = 16.dp)
        .width(200.dp)
        .height(100.dp),
      shape = RoundedCornerShape(16.dp),
      border = BorderStroke(2.dp, Color.Red),
    ) {
      Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
      ) {
        Text(
          text = "Hello ${user.login}!",
          fontSize = 24.sp,
          color = Color.Red
        )
      }
    }
    Surface(
      modifier = Modifier
        .width(200.dp)
        .padding(top = 8.dp),
      shape = RoundedCornerShape(16.dp),
      border = BorderStroke(2.dp, Color.Gray)
    ) {
      Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
      ) {
        Text(text = "ID: ${user.id}", fontSize = 16.sp)
        Text(text = "Avatar URL: ${user.imageUrl}", fontSize = 16.sp)
        Text(text = "Repository URL: ${user.repository_url}", fontSize = 16.sp)
        Text(text = "Followers URL: ${user.followers_url}", fontSize = 16.sp)
      }
    }
  }
}