package com.example.composedemo

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.composedemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                Text()
        }
    }
}
@Composable
fun Text(
){
    val context = LocalContext.current
    Text(
         text = "Anurag Shekhawat",
         fontSize = 45.sp,
         fontFamily = FontFamily.Cursive ,
         color = Color.Green ,
         modifier = Modifier.clickable {
             Toast.makeText(context,"You got me ",Toast.LENGTH_LONG).show()
         }

    )
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    Surface (modifier = Modifier.fillMaxSize()){
        Text()
    }
}