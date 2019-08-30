package tk.kituthegreat.notes;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class NoteViewModel extends AndroidViewModel {
    private NoteRepository repository;
    public NoteViewModel(@NonNull Application application) {
        super(application);
    }
}
