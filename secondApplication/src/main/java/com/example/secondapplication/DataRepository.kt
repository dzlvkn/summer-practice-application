package com.example.secondapplication

object DataRepository {

    var listOfSongs: List<SongModel> = emptyList()

    fun generateListOfSongs(cnt: Int) {
        val sampleSongs = listOf(
            SongModel(
                id = 1,
                imageLink = "https://avatars.yandex.net/get-music-content/4399834/0415f8b8.a.17439837-1/m1000x1000",
                albumName = "Tragic City",
                songTitle = "Плевок в вечность",
                singer = "LSP"
            ),
            SongModel(
                id = 2,
                imageLink = "https://avatars.yandex.net/get-music-content/5412783/a3cafcec.a.19444071-1/m1000x1000",
                albumName = "FLOWJOB",
                songTitle = "GENDER",
                singer = "SQWOZ BAB"
            ),
            SongModel(
                id = 3,
                imageLink = "https://avatars.yandex.net/get-music-content/9837520/803771a6.a.32589300-2/m1000x1000",
                songTitle = "Turbo",
                singer = "Big Baby Tape",
                releaseYear = 2024
            ),
            SongModel(
                id = 4,
                imageLink = "https://avatars.yandex.net/get-music-content/14350511/3d3749a7.a.37030465-1/m1000x1000",
                songTitle = "Ну-ка снимай",
                singer = "MAYOT",
                releaseYear = 2025
            ),
            SongModel(
                id = 5,
                imageLink = "https://avatars.yandex.net/get-music-content/4399834/0415f8b8.a.17439837-1/m1000x1000",
                albumName = "Tragic City",
                songTitle = "Ползать",
                singer = "LSP"
            ),
            SongModel(
                id = 6,
                imageLink = "https://avatars.mds.yandex.net/i?id=d1cb84728090abdc9f77d2efb1cc810ba379f7c3-4901917-images-thumbs&n=13",
                albumName = "ОПГ сити ",
                songTitle = "Лил мами",
                singer = "OG Buda"
            ),
            SongModel(
                id = 7,
                imageLink = "https://avatars.yandex.net/get-music-content/16406615/cdd1df81.a.39362975-1/m1000x1000",
                albumName = "Судный день",
                songTitle = "Терминатор",
                singer = "LSP"
            ),
            SongModel(
                id = 8,
                imageLink = "https://avatars.yandex.net/get-music-content/5412783/a3cafcec.a.19444071-1/m1000x1000",
                albumName = "FLOWJOB",
                songTitle = "DISNEY",
                singer = "SQWOZ BAB"
            ),
            SongModel(
                id = 9,
                imageLink = "https://cdn-image.zvuk.com/pic?hash=b5e1ea72-642c-40bc-a118-a86dcd8ff3ea&id=36536331&size=large&type=release",
                songTitle = "Chuchuka",
                singer = "Big Baby Tape",
                releaseYear = 2024
            ),
            SongModel(
                id = 10,
                imageLink = "https://cdn-image.zvuk.com/pic?hash=c852a1b9-03cb-4c67-80ca-38c7ed4cc994&id=22386773&size=large&type=release",
                songTitle = "Москва",
                singer = "Yanix",
                releaseYear = 2016
            ),
            SongModel(
                id = 11,
                imageLink = "https://avatars.mds.yandex.net/i?id=d1cb84728090abdc9f77d2efb1cc810ba379f7c3-4901917-images-thumbs&n=13",
                albumName = "ОПГ сити ",
                songTitle = "Биг бой слайм",
                singer = "OG Buda"
            ),
            SongModel(
                id = 12,
                imageLink = "https://lh3.googleusercontent.com/dg0-pdw9D8j_BsLTmvC2FXTPzKUQJ0VSbycjwuMGkGQLBQwJl2xevaY17ZUXqFUB3AfTOyxSU5gvUzwo=w544-h544-l90-rj",
                songTitle = "Да или нет",
                singer = "Yanix",
                releaseYear = 2019
            ),
            SongModel(
                id = 13,
                imageLink = "https://avatars.yandex.net/get-music-content/10918712/e55dea9a.a.30930079-3/m1000x1000",
                songTitle = "Озеро в лесу",
                singer = "SQWOZ BAB",
                releaseYear = 2024
            ),
            SongModel(
                id = 14,
                imageLink = "https://cdn-image.zvuk.com/pic?hash=ce978cdb-3a0d-4a9e-80ea-00c6538a61fa&id=49849706&size=large&type=release",
                songTitle = "Тени",
                singer = "MAYOT",
                releaseYear = 2026
            ),
            SongModel(
                id = 15,
                imageLink = "https://avatars.yandex.net/get-music-content/16406615/cdd1df81.a.39362975-1/m1000x1000",
                albumName = "Судный день",
                songTitle = "Герой",
                singer = "LSP"
            ),
            SongModel(
                id = 16,
                imageLink = "https://avatars.yandex.net/get-music-content/4796762/e7dd7107.a.16142403-1/m1000x1000",
                songTitle = "Стейк",
                singer = "Yanix",
                releaseYear = 2021
            ),
            SongModel(
                id = 17,
                imageLink = "https://cdn-image.zvuk.com/pic?hash=0d4a52a5-de31-4d6d-b875-7d47ad596bd5&id=34113040&size=large&type=release",
                songTitle = "Кайфариат",
                singer = "SQWOZ BAB",
                releaseYear = 2019
            ),
            SongModel(
                id = 18,
                imageLink = "https://avatars.yandex.net/get-music-content/99892/2e5502a2.a.6072366-1/m1000x1000",
                songTitle = "Gimme the Loot",
                singer = "Big Baby Tape",
                releaseYear = 2018
            ),
            SongModel(
                id = 19,
                imageLink = "https://avatars.yandex.net/get-music-content/16406615/cdd1df81.a.39362975-1/m1000x1000",
                albumName = "Судный день",
                songTitle = "Пьяндекс",
                singer = "LSP"
            ),
            SongModel(
                id = 20,
                imageLink = "https://avatars.mds.yandex.net/i?id=d1cb84728090abdc9f77d2efb1cc810ba379f7c3-4901917-images-thumbs&n=13",
                albumName = "ОПГ сити ",
                songTitle = "Откровения",
                singer = "OG Buda"
            )
        )

        listOfSongs = sampleSongs.take(cnt)
    }

    fun clearList() {
        listOfSongs = emptyList()
    }

}