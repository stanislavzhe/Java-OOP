package com.stas.JavaOOP.Project;

/**
 * Created by stanislavz on 15-Jul-17.
 */
public enum TicketType {
    Epic(1),
    Task(2),
    Defect(3);

    private final int id;

    TicketType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
