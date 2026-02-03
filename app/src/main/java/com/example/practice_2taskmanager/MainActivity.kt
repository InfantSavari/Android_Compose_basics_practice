package com.example.practice_2taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.practice_2taskmanager.ui.theme.Practice2TaskManagerTheme
import androidx.compose.ui.text.font.*
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Practice2TaskManagerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier.padding(innerPadding).fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        ImageLoader(Modifier.size(200.dp))
                        Content(Modifier.padding())
                    }

                }
            }
        }
    }
}

@Composable
fun ImageLoader(modifier: Modifier){
    Image(painter = painterResource(id = R.drawable.ic_task_completed),modifier = modifier, contentDescription = "Just a practice", contentScale = ContentScale.Inside)
}

@Composable
fun Content(modifier: Modifier){
    val string1: String = "All tasks completed"
    val string2: String = "Nice Work!"
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = string1,modifier = modifier, fontFamily = FontFamily.Default, fontSize = 15.sp, fontWeight = FontWeight.Bold)
        Text(text = string2, modifier = modifier, fontSize = 12.sp, fontFamily = FontFamily.Default, fontWeight = FontWeight.Medium)
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Practice2TaskManagerTheme {

    }
}