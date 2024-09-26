package com.redtowersoft.composeexamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.redtowersoft.composeexamples.ui.theme.ComposeExamplesTheme

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