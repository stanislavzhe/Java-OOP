package com.stas.JavaOOP.Project;

import java.util.*;
import java.util.function.Predicate;

/**
 * Created by Stas on 20.07.2017.
 */
public class TicketsList {
    private List<Ticket> ticketsList = new ArrayList<>();

    public void addToList(Ticket ticket) {
        ticketsList.add(ticket);
    }

    public void addEpicWithTickets(Epic epic) {
        ticketsList.add(epic);
        for (Ticket ticket: epic.getTickets()) {
            ticketsList.add(ticket);
        }
    }

    public List<Ticket> getTicketsList() {
        return ticketsList;
    }

    public List<Ticket> filter(Predicate<Ticket> predicate) { // TODO: move to TicketList
        List<Ticket> list = new ArrayList<>();
        for (Ticket ticket : ticketsList) {
                if (predicate.test(ticket)) {
                    list.add(ticket);
                }
        }
        return list;
    }

    public void sortBy(Comparator<Ticket> comparator){ // TODO move2 to TicketList
        ticketsList.sort(comparator);
    }

//    @Override
//    public String toString() {
//        StringJoiner joiner = new StringJoiner("; ","TicketsList: ","");
//        for (Epic ticket: epiclist
//             ) {
//            joiner.add(ticket.toString());
//        }
//        return joiner.toString();
//    }


    @Override
    public String toString() {
        return "TicketsList{" +
                "ticketsList=" + ticketsList +
                '}';
    }
}
