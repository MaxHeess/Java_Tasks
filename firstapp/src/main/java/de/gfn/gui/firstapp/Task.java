package de.gfn.gui.firstapp;

import java.time.LocalDateTime;

public class Task {

    private String title;
    private LocalDateTime createdAt;
    private boolean done;
    private LocalDateTime doneAt;

    public Task() {
    }

    public Task(String title) {
        this.title = title;
    }

    public Task(String title, LocalDateTime createAt, boolean done, LocalDateTime doneAt) {
        this.title = title;
        this.createdAt = createAt;
        this.done = done;
        this.doneAt = doneAt;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getCreateAt() {
        return createdAt;
    }

    public boolean isDone() {
        return done;
    }

    public LocalDateTime getDoneAt() {
        return doneAt;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createdAt = createAt;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setDoneAt(LocalDateTime doneAt) {
        this.doneAt = doneAt;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", title, (done ? "erledigt" : "offen"));
    }
}
