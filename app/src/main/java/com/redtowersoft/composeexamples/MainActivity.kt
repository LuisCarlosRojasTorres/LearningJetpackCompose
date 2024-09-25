package com.redtowersoft.composeexamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

            DummyComposableFunction(
                        dummyName = "Rufo",
                        modifier = Modifier.fillMaxWidth().padding(16.dp).background(Color.Red)
                    )
                }
            }
        }

@Composable
fun DummyComposableFunction(dummyName: String, modifier: Modifier = Modifier) {
    Text(modifier = modifier, text = "Dummy name example: $dummyName")
}

@Preview(showBackground = true)
@Composable
fun DummyComposableFunctionPreview() {
    DummyComposableFunction("Rufo",modifier = Modifier.fillMaxWidth().padding(5.dp).background(Color.Red))
}