package org.Lexicon.Sequencer;

public class SchoolSequencer {

    private static int id;

    public static int getnextId() {
        id = ++id;
        return id;
    }

    public static void reset() {
        id = 0;
    }
}
