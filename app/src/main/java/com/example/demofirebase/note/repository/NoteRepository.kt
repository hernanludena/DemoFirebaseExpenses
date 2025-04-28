package com.example.demofirebase.note.repository

import com.example.demofirebase.note.model.Note
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class NoteRepository {

    private val db = FirebaseFirestore.getInstance()
    private val notesCollection = db.collection("notes")

    suspend fun addNote(note: Note) {
        // 🔹 Agrega una nota con un ID generado automáticamente
        notesCollection.add(note).await()
    }

    suspend fun getNotes(): List<Note> {
        val snapshot = notesCollection.get().await()
        return snapshot.documents.mapNotNull {
            it.toObject(Note::class.java)?.copy(id = it.id)
        }
    }

    suspend fun updateNote(note: Note) {
        // 🔹 Actualiza un documento existente por su ID
        if (note.id.isNotBlank()) {
            notesCollection.document(note.id).set(note).await()
        }
    }
}