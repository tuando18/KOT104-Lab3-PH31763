

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dovantuan.kot104_lab3_ph31763.ui.theme.BTBuoi4_PH31749Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BTBuoi4_PH31749Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        GetTextTitle(title = "Do Van Tuan - PH31763")
                    }
                }
            }
        }
    }
}

@Composable
fun GetTextTitle(title: String, modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf(title) }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MessageCard(title = text)
        Button(onClick = { text = "Hi!" }) {
            Text("Say Hi!")
        }
    }
}


@Composable
fun MessageCard(title: String) {
    Text(
        text = title,
        modifier = Modifier
            .padding(0.dp, 16.dp)
            .fillMaxWidth(),
        color = Color.Red,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
    )
}

//@Composable
//fun CounterCard() {
//    var count by rememberSaveable { mutableIntStateOf(0) }
//    Column(
//        modifier = ModifierfillMaxWidth().padding(24.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        MessageCard("You have clicked the button $count times.")
//        Button(onClick = { count++ }) {
//            Text("Click me")
//        }
//    }
//}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BTBuoi4_PH31749Theme {
        Column {
            GetTextTitle(title = "Nguyen Cong Thuong - PH31749")
        }
    }
}
