package com.redtowersoft.composeexamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.redtowersoft.composeexamples.ui.theme.ComposeExamplesTheme
import androidx.compose.material3.Text as Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

                    DummyComposableListFunction(
                        dummyName = "Rufo",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                            .background(Color.Red)
                    )

            }


        }

}

//C3
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DummyComposableTopBarFunction(dummyName: String, modifier: Modifier = Modifier) {
    LargeTopAppBar(modifier = modifier, title  = {Text("Dummy name example: $dummyName")})
}

@Preview(showBackground = false)
@Composable
fun DummyComposableTopBarFunctionPreview() {
    DummyComposableTopBarFunction("Rufo")
}

@Composable
fun DummyComposableFActionFunction() {
    FloatingActionButton(
        onClick = { /*TODO*/ },
        content = {
            Icon(
                imageVector = Icons.Default.Add ,
                contentDescription = "New Chat"
            )
        }
    )
}

@Preview(showBackground = false)
@Composable
fun DummyComposableEActionFunctionPreview() {
    DummyComposableFActionFunction()
}

@Composable
fun DummyComposableEActionFunction(dummyText: String) {
    ExtendedFloatingActionButton(
        onClick = { /*TODO*/ },
        content = {
            Icon(
                imageVector = Icons.Default.Add ,
                contentDescription = "New Chat"
            )
            Text(
                modifier = Modifier.padding(10.dp),
                text = dummyText
            )
        }
    )
}

@Preview(showBackground = false)
@Composable
fun DummyComposableFActionFunctionPreview() {
    DummyComposableEActionFunction("Dummy Action")
}

@Composable
fun DummyComposableBottomAppBarsFunction() {
    BottomAppBar(
        actions = {
            Icon(
                imageVector = Icons.Rounded.Home, contentDescription =
                "Home Screen"
            )
            Icon(
                imageVector = Icons.Rounded.ShoppingCart,
                contentDescription = "Cart Screen"
            )
            Icon(
                imageVector = Icons.Rounded.AccountCircle,
                contentDescription = "Account Screen"
            )
        }
    )
}

@Preview(showBackground = false)
@Composable
fun DummyComposableBottomAppBarsFunctionPreview() {
    DummyComposableBottomAppBarsFunction()
}

//*************************************************************************
// C2
@Composable
fun DummyComposableFunction(dummyName: String, modifier: Modifier = Modifier) {
    Text(modifier = modifier, text = "Dummy name example: $dummyName")
}

@Composable
fun DummyComposableColumnFunction(dummyName1: String, dummyName2: String,modifier: Modifier = Modifier) {
    Column  {
        Text(modifier = modifier, text = "Dummy name 1 example: $dummyName1")
        Text(modifier = modifier, text = "Dummy name 2 example: $dummyName2")
    }
}

@Composable
fun DummyComposableListFunction(dummyName: String, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        items(100) {
            Text(
                modifier = modifier,
                text = "$dummyName $it"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DummyComposableFunctionPreview() {
    DummyComposableFunction("Rufo",modifier = Modifier
        .fillMaxWidth()
        .padding(5.dp)
        .background(Color.Red))
}

@Preview(showBackground = true)
@Composable
fun DummyComposableColumnFunctionPreview() {
    DummyComposableColumnFunction("Rufo", "Rufa", modifier = Modifier
        .fillMaxWidth()
        .padding(5.dp)
        .background(Color.Red))
}

@Preview(showBackground = true)
@Composable
fun DummyComposableListFunctionPreview() {
    DummyComposableListFunction("Rufo", modifier = Modifier
        .fillMaxWidth()
        .padding(5.dp)
        .background(Color.Red))
}