package com.stas.JavaOOP.Project;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stas on 06.07.2017.
 */
public class Epic extends Ticket {
    private List<Ticket> tickets = new ArrayList<>();

    Epic(String title, String description, User creator){
        super(TicketType.Epic,title,description,creator);
    }

    public void linkToEpic(Ticket ticket) {
        if (ticket.getType().equals(TicketType.Epic)){
            throw new IllegalArgumentException("Epic could not be linked to other epic");
        }
        tickets.add(ticket);
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    @Override
    public String toString() {
        return  "Epic{" +
                "type=" + getType() +
                ", title='" + getTitle() + '\'' +
                ", ticketStatus=" + getTicketStatus() +
                ", creator=" + getCreator() +
                ", assigne=" + getAssigne() +
                '}';
    }
}
