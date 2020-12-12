package org.Lexicon.Sequencer;

import java.time.LocalDate;

public class DateSequencer {
    private static LocalDate localDate;

    public static LocalDate getDate() {
        localDate = LocalDate.now();
        return localDate;
    }

}
