package com.example.composedemo

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutCompose()
        }
    }
}

@Composable
fun LayoutCompose() {
    val context = LocalContext.current
    Row(modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight()
        .padding(12.dp)
        .border(width = 1.dp, color = Color.LightGray)
        .padding(12.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.pic),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .rotate(270F)
        )
        Column() {
            Text(text = stringResource(id = R.string.name))
            Button(onClick = {
                Toast.makeText(context, "hello handsome", Toast.LENGTH_SHORT).show()
            }) {
                Text(text = "Click me")
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Surface(modifier = Modifier.fillMaxSize()) {
        LayoutCompose()
    }
}