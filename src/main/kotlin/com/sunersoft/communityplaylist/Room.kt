package com.sunersoft.communityplaylist

import java.util.UUID
import java.util.Queue
import java.util.concurrent.ConcurrentLinkedQueue

class Room(val name: String) {
    private val id: UUID = UUID.randomUUID()
    private val songs: Queue<Song> = ConcurrentLinkedQueue()

    fun addSong(song: Song): Boolean = songs.add(song)
    fun nextSong(): Song? = songs.remove()
}