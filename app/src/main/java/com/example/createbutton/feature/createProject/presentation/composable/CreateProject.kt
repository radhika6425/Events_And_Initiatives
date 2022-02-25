package com.example.createbutton.feature.createProject.presentation.composable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.createbutton.ui.theme.CreateButtonTheme

class CreateProject : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreateButtonTheme {
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    CreateButtonPreview()
                }
            }
        }
    }
}

@Composable
fun CreateButtonPreview()
{

        TextButton(

            colors = ButtonDefaults.buttonColors(backgroundColor = (Color(0xFF47A1AD))),
            onClick = {

            },
            modifier = Modifier
                .padding(top=60.dp)
                .height(50.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(4.dp)

        ) {

            Text(
                text = "CREATE NEW PROJECT",
                color = Color.Black,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,

            )

        }

}