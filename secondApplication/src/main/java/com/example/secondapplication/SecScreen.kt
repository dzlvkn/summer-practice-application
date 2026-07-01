package com.example.secondapplication

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage

@Composable
fun SecScreen() {

    var searchQuery by remember { mutableStateOf("") }
    var appliedQuery by remember { mutableStateOf("") }
    val songsList = DataRepository.listOfSongs

    val filteredList = if (appliedQuery.isBlank()) {
        songsList
    } else {
        songsList.filter { song ->
            song.singer.contains(appliedQuery, ignoreCase = true)
        }
    }


    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {

        OutlinedTextField(
            value = searchQuery,
            onValueChange = { searchQuery = it },
            label = { Text("Введите исполнителя") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = { appliedQuery = searchQuery },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Сортировать")
        }

        Spacer(modifier = Modifier.height(16.dp))

        if (filteredList.isEmpty()) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text("Ничего не найдено")
            }
        } else {
            LazyColumn {
                items(filteredList) { song ->
                    SongItem(song = song)
                }
            }
        }


    }

}

@Composable
fun SongItem(song: SongModel) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        AsyncImage(
            model = song.imageLink,
            contentDescription = null,
            modifier = Modifier.size(60.dp)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column() {

            Text(
                text = song.songTitle.trim(),
                fontSize = 16.sp
            )

            Text(
                text = song.singer,
                fontSize = 12.sp
            )

            song.albumName?.let { album ->
                Text(
                    text = album,
                    fontSize = 12.sp
                )
            }

            song.releaseYear?.let { year ->
                Text(
                    text = year.toString(),
                    fontSize = 12.sp
                )
            }
        }

    }
}