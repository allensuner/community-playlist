package com.sunersoft.communityplaylist

fun main() {
    val room = Room("Allen's Test Room")
    for (i in (0 until 10)) {
        room.addSong(Song("title_$i", "artist_$i", "album_$i", i))
    }
    val song = room.nextSong()
    if (song != null) {
        println(song)
    } else {
        println("no song!")
    }
}