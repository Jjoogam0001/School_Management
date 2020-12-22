package org.Lexicon.model;

import org.Lexicon.Sequencer.SchoolSequencer;

public class Lecture {
    private  final int id;
    private String Lecturename;

    public Lecture( String lecturename) {
        this.id = SchoolSequencer.getnextId();
        Lecturename = lecturename;

    }

    public int getId() {
        return id;
    }

    public String getLecturename() {
        return Lecturename;
    }

    public void setLecturename(String lecturename) {
        Lecturename = lecturename;
    }
}
