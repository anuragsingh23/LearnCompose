package com.example.composedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}


data class Users(
    val id : Int
)

@Composable
fun MainContent(){
    val user = Users(1)
    val users = remember{
        mutableStateListOf(user)
    }
    Box{
        UserList(user = users )
        Button(modifier =
        Modifier.
        padding(24.dp).
        align(Alignment.BottomCenter),
            onClick = {
                users.add(Users(1))
        })
        {
            Text(text = "add More")
        }
    }
}

@Composable
fun UserList(
    user :List<Users>
){


    LazyColumn{
        items(user){
            user ->
            UserCard()

        }
    }

}




@Composable
fun UserCard(){
    Card(
        elevation = 4.dp,
        modifier = Modifier
            .padding(12.dp)
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        Row (
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp)
                .padding(12.dp)

        ){
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
            )
            Column() {
                Text(text = stringResource(id = R.string.app_name))
                Button( onClick = {
                    //Button action
                }) {
                    Text(text = "View Profile")
                }

            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun UserCAseCard(){
       Surface() {
             Modifier.fillMaxSize()

       }
}