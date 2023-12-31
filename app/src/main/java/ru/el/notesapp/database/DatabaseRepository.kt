package ru.el.notesapp.database

import androidx.lifecycle.LiveData
import ru.el.notesapp.model.Note

interface DatabaseRepository {
    val readAll: LiveData<List<Note>>
     suspend fun create(note: Note, onSuccess: () -> Unit)

    suspend fun update(note: Note, onSuccess: () -> Unit)

    suspend fun delete(note: Note, onSuccess: () -> Unit)

}