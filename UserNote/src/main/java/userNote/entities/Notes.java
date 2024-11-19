package userNote.entities;

import jakarta.persistence.*;

@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int noteId;
    private String note;

    public Notes(int noteId, String note) {
        this.noteId = noteId;
        this.note = note;
    }

    public Notes() {
        super();
    }

    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "noteId=" + noteId +
                ", note='" + note + '\'' +
                '}';
    }
}
