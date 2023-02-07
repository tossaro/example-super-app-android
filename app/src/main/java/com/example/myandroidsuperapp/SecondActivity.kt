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
import com.example.myandroidsuperapp.ui.theme.MyAndroidSuperAppTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAndroidSuperAppTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Column{
                        Text(text = "Second Activity")
                        MainActivityButton()
                    }
                }
            }
        }
    }
}

@Composable
fun MainActivityButton(){
    val context = LocalContext.current
    Button(onClick = {
        context.startActivity(Intent(context, MainActivity::class.java))
    }) {
        Text(text = "Main Activity")
    }
}
