package com.example.myandroidsuperapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat.startActivity
import com.example.myandroidsuperapp.ui.theme.MyAndroidSuperAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAndroidSuperAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Column{
                        Greeting("Android")
                        SecondActivityButton()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Welcome to the $name world")
}

@Composable
fun SecondActivityButton(){
    val context = LocalContext.current
    Button(onClick = {
        context.startActivity(Intent(context, SecondActivity::class.java))
    }) {
        Text(text = "Second Activity")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyAndroidSuperAppTheme {
        Greeting("Android")
    }
}