package org.Lexicon.model;

import org.Lexicon.Sequencer.SchoolSequencer;

public class Teacher {

    private  final int id;
    private String name;
    private String email;

    public Teacher( String name, String email) {
        this.id = SchoolSequencer.getnextId();
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
