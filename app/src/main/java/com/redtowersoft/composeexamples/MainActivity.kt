package com.redtowersoft.composeexamples

import android.graphics.drawable.Icon
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.redtowersoft.composeexamples.ui.theme.ComposeExamplesTheme
import kotlin.random.Random
import androidx.compose.material3.Text as Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(modifier = Modifier.fillMaxWidth()) {
                UnitConverter()
            }

            }
        }
}

@Composable
fun UnitConverter() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {

        var inputValue by remember{ mutableStateOf("")}
        var outputValue by remember{ mutableStateOf("")}

        var inputUnit by remember{ mutableStateOf("Centimeters")}
        var outputUnit by remember{ mutableStateOf("Meters")}

        var iExpanded by remember{ mutableStateOf(false)}
        var oExpanded by remember{ mutableStateOf(false)}

        var conversionFactor by remember{ mutableStateOf(0.01)}

        Text(text = "Dummy name 1 example")
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = inputValue,
            onValueChange =
            {
                inputUnit = it
            },
            label = { Text(text="Enter a value")}
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row{


            Box{
                Button(onClick = {
                    iExpanded = true
                }) {
                    Text(text = "Click me")
                    Icon(Icons.Default.ArrowDropDown, "Lobo")
                }
                DropdownMenu(expanded = iExpanded,
                    onDismissRequest =
                    {
                        iExpanded = false
                    })
                {
                    DropdownMenuItem(text = { Text(text = "Lobo") },
                        onClick = {
                            iExpanded = false
                            conversionFactor = 0.01
                        })
                    DropdownMenuItem(text = { Text(text = "Rufa") },
                        onClick = {
                            iExpanded = false
                        })
                    DropdownMenuItem(text = { Text(text = "Rufo") },
                        onClick = {
                            iExpanded = false
                        })
                    
                }
            }
            Spacer(modifier = Modifier.width(16.dp))
            Box{
                Button(onClick = {
                    oExpanded = true
                }) {
                    Text(text = "Click me")
                    Icon(Icons.Default.ArrowDropDown, "Lobo")
                }
                DropdownMenu(expanded = oExpanded,
                    onDismissRequest =
                    {
                        oExpanded = false
                    })
                {
                    DropdownMenuItem(text = { Text(text = "Lobo") }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text(text = "Rufa") }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text(text = "Rufo") }, onClick = { /*TODO*/ })

                }
            }
        }

        Text(text = "Rrsult: ")
    }

}

@Preview(showBackground = false)
@Composable
fun UnitConverterPreview() {
    UnitConverter()
}
