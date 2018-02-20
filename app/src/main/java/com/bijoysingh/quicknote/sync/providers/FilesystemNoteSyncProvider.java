package com.bijoysingh.quicknote.sync.providers;

import android.util.Log;

import com.bijoysingh.quicknote.database.Note;
import com.bijoysingh.quicknote.sync.NoteSyncProvider;

import org.jetbrains.annotations.NotNull;

/**
 * Created by nihal on 2/20/18.
 */

public class FilesystemNoteSyncProvider extends NoteSyncProvider {

    @Override
    public void save(@NotNull Note note) {
        Log.d("fs_note_sync", "save note " + note.toString());
    }

    @Override
    public void delete(@NotNull Note note) {
        Log.d("fs_note_sync", "delete note " + note.toString());
    }
}
