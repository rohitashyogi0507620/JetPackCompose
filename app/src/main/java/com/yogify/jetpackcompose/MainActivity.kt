package com.yogify.jetpackcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yogify.jetpackcompose.ui.theme.JetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    CreateCard("Rohitash")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    JetPackComposeTheme {
        CreateCard("Rohitash")
    }
}

@Composable
fun CreateCard(name: String) {
    Surface(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(12.dp)
    ) {
        Card(
            modifier = Modifier
                .width(200.dp)
                .height(300.dp),
            elevation = 20.dp, shape = RoundedCornerShape(corner = CornerSize(20.dp)),
            backgroundColor = Color.White,
        ) {
            Column(
                modifier = Modifier.height(300.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                CreateUserProfile()
                Divider(
                    thickness = 2.dp,
                    color = Color.LightGray,
                )
                CustomerInfo()
                Button(onClick = {

                    Log.d("Clicked", "CreateCard: Clicked")
                }) {
                    Text(text = "Follow", style = MaterialTheme.typography.button)
                }

            }

        }


    }
    // Text(text = "Hello Bro $name") Show Text View
}

@Composable
private fun CustomerInfo() {
    Column(modifier = Modifier.padding(10.dp)) {

        Text(
            text = "Rohitash Yogi",
            style = MaterialTheme.typography.h5,
            color = MaterialTheme.colors.primaryVariant
        )
        Text(
            text = "Hey I am an adroid developer about past 2 year",
            modifier = Modifier.padding(5.dp)
        )
        Text(
            text = "@i_Rohitash",
            modifier = Modifier.padding(5.dp),
            style = MaterialTheme.typography.subtitle1
        )
    }
}

@Composable
private fun CreateUserProfile(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier
            .size(100.dp)
            .padding(4.dp),
        shape = CircleShape,
        border = BorderStroke(1.dp, Color.LightGray),
        elevation = 4.dp,

    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_baseline_perm_identity_24),
            contentDescription = "Profile Image",
            modifier = Modifier.size(135.dp),
            contentScale = ContentScale.Crop
        )

    }
}