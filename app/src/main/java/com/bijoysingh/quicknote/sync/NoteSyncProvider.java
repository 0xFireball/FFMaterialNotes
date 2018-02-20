package com.bijoysingh.quicknote.sync;

import com.bijoysingh.quicknote.database.Note;
import com.bijoysingh.quicknote.sync.providers.FilesystemNoteSyncProvider;

/**
 * Created by nihal on 2/20/18.
 */

public abstract class NoteSyncProvider {
    private static NoteSyncProvider _instance;

    public static NoteSyncProvider get() {
        if (_instance == null) {
            _instance = new FilesystemNoteSyncProvider();
        }
        return _instance;
    }

    public abstract void save(Note note);
    public abstract void delete(Note note);
}
