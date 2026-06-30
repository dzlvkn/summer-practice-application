package com.example.practice

import androidx.compose.ui.graphics.Color

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import kotlin.random.Random

@Composable
fun GuessTheNum() {

    val numToGuess = rememberSaveable { Random.nextInt(0, 101) }
    var text by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("Число загадано") }
    var isGuessed by remember { mutableStateOf(false) }


    Column(modifier = Modifier.padding(start = 70.dp, top = 300.dp)) {

        if (isGuessed) {

            Text(
                text = "Угадал!",
                fontSize = 30.sp,
                modifier = Modifier
                    .padding(start = 80.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            AsyncImage(
                model = "https://sun9-63.userapi.com/s/v1/ig2/ViMXxdE3q8fGRESXztNig7yNsRmekdwHd9xWw3zxqcbJap7esSHaMKT7loC_7YUF0On8eSumhyfN24RkTufYwOhS.jpg?quality=95&as=32x32,48x48,72x72,108x108,160x160,240x240,360x360,480x480,540x540,640x640,720x720&from=bu&u=QVxh8dTSalEFVIdm7ZTHuF9itCLfFHi2iO_fSlA7QnY&cs=720x0",
                contentDescription = null,
                modifier = Modifier.size(270.dp)
            )

        } else {

            Text(
                text = message,
                fontSize = 24.sp
            )
            Spacer(modifier = Modifier.height(10.dp))

            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Введите число от 0 до 100") }
            )

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = {
                    val inputNum = text.toIntOrNull()

                    when {
                        inputNum == null -> message = "Введите число"
                        inputNum < 0 || inputNum > 100 -> message = "Введите корректное число"
                        inputNum < numToGuess -> message = "Загаданное число больше"
                        inputNum > numToGuess -> message = "Загаданное число меньше"
                        else -> {
                            isGuessed = true
                        }

                    }

                    text = ""
                },
                modifier = Modifier.size(width = 280.dp, height = 50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Gray)
            ) {
                Text(
                    text = "Проверить",
                    fontSize = 20.sp
                )
            }
        }
    }

}

