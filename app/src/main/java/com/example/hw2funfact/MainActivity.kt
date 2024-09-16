package com.example.hw2funfact

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hw2funfact.ui.theme.HW2FunFactTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column (
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            )
            {
                Text("Fun Fact: ",
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 32.dp),
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xffe83f6f),
                    textAlign = androidx.compose.ui.text.style.TextAlign.Center,
                )
                DisplayFact()
            }
        }
    }
}

@Composable
fun DisplayFact() {
    var fact by remember { mutableStateOf(getFact()) }

    Column(modifier = Modifier.padding(16.dp),

            horizontalAlignment = Alignment.CenterHorizontally,) {
        Text(
            text = fact,
            fontSize = 20.sp,
            textAlign = androidx.compose.ui.text.style.TextAlign.Center,
        )
        Button(onClick = { fact = getFact() }, modifier = Modifier.padding(top = 16.dp)) {
            Text(text = "Next")
        }

    }

}

fun getFact() : String {
    val facts = listOf(
        "McDonald’s once made bubblegum-flavored broccoli.",
                "Finland has more saunas than cars.",
                "The longest time someone has spent holding their breath underwater is 24 minutes and 37 seconds. ",
                "Frida Kahlo painted 55 self-portraits.",
                "Avocados are actually fruits, not vegetables.",
                "NFL Super Bowl referees also get Super Bowl rings.",
                "It’s illegal to own only one guinea pig in Switzerland.",
                "Only four countries in the world have national anthems with no lyrics.",
                "The letter “Q” doesn’t appear in any American state’s name.",
                "Walt Disney currently holds the most Academy Awards at a lifetime total of 26.",
                "The average cloud weighs over one million pounds.",
                "Wearing a necktie could reduce blood flow to your brain by up to 7.5 percent.",
                "Animals can also be allergic to humans.",
                "Finland has ranked as the happiest country in the world for 7 years straight.",
                "Bottlenose dolphins are the only other species to have names for themselves.",
                "Your brain alone burns around 400 to 500 calories each day.",
                "Approximately 10% of people are left-handed.",
                "Besides water, tea is the most popular beverage worldwide.",
                "Your heart beats an average of 100,000 times each day.",
                "The first animals to travel to outer space were fruit flies.",
                "A mile is 5,280 feet long. ",
                "Platypuses sweat milk.",
                "Massachusetts is the home of basketball and volleyball. ",
                "Bananas glow blue under black lights.",
                "A woman in the United Kingdom once called the police when her ice cream didn’t have enough sprinkles.",
                "Russia has 11 time zones.",
                "Japan released sushi-inspired Kit Kats.",
                "Comets smell like rotten eggs. ",
                "Vatican City is the smallest country in the world.",
                "Bees can fly higher than Mount Everest.",
                "A fear of long words is called Hippopotomonstrosesquippedaliophobia.",
                "People once ate arsenic to improve their skin.",
                "“The Terminator” script was sold for \$1.",
                "Venus is the only planet to spin clockwise.",
                "Allodoxaphobia is the fear of other people’s opinions.",
                "Human teeth are the only part of the body that cannot heal themselves.",
                "Flamingos aren’t born pink.",
                "Your nose and ears never stop growing.",
                "Cats can’t taste anything sweet.",
                "The surface of the sun is around 10,000 degrees Fahrenheit.",
                "Male deer shed their antlers every year.",
                "Approximately one quarter of the bones in your body are in your feet.",
                "Horses and cows usually sleep standing up.",
                "There are more than one million different species of insects on the planet.",
                "Around 80 percent of orange cats are male.",
                "The world’s largest butterfly, Queen Alexandra’s birdwing, has a wingspan of around 10 inches."
    )

        val randomIndex = Random.nextInt(facts.size)

    return facts[randomIndex]
}


@Preview(showBackground = true)
@Composable
fun Preview() {

}