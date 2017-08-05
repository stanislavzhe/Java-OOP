package com.stas.JavaOOP.Project;

/**
 * Created by Stas on 16.07.2017.
 */
public enum  TicketStatus {
    Open(1),
    In_Progress(2),
    Done(3),
    Closed(4),
    Canceled(5),
    Reopened(6);

    private int id;

    public int getId() {
        return id;
    }

    TicketStatus(int id) {
        this.id = id;
    }
}
