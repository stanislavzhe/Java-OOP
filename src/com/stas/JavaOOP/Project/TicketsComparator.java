package com.stas.JavaOOP.Project;

import java.util.Comparator;
import java.util.Objects;

/**
 * Created by stanislavz on 02-Aug-17.
 */
public class TicketsComparator {

    public static class TicketsByAssigneComparator implements Comparator<Ticket> {
        @Override
        public int compare(Ticket o1, Ticket o2) {
            if (Objects.isNull(o2.getAssigne())) {
                return 1;
            }
            if (Objects.isNull(o1.getAssigne())) {
                return -1;
            }
            else return o1.getAssigne().getName().compareTo(o2.getAssigne().getName());
        }
    }

    public static class TicketsByCreatorComparator implements Comparator<Ticket> {
        @Override
        public int compare(Ticket o1, Ticket o2) {
            return o1.getCreator().getName().compareTo(o2.getCreator().getName());
        }
    }

    public static class TicketsByLoggedTimeComparator implements Comparator <Ticket>{
        @Override
        public int compare(Ticket o1, Ticket o2) {
            if (o1.getLoggedTime() < o2.getLoggedTime() ) {
                return -1;
            }
            if (o1.getLoggedTime()  > o2.getLoggedTime()) {
                return 1;
            }
            return 0;
        }
    }

    public static class TicketsByStatusComparator implements Comparator<Ticket> {

        @Override
        public int compare(Ticket o1, Ticket o2) {
            if (o1.getTicketStatus().getId() < o2.getTicketStatus().getId()) {
                return -1;
            }
            if (o1.getTicketStatus().getId() > o2.getTicketStatus().getId()) {
                return 1;
            }
            return 0;
        }
    }

    public static class TicketsByTitleComparator {
        class ticketTitlecomparator implements Comparator<Ticket> {

            @Override
            public int compare(Ticket o1, Ticket o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        }
    }

    public static class TicketsByTypeComparator implements Comparator <Ticket>{

        @Override
        public int compare(Ticket o1, Ticket o2) {
            if (o1.getType().getId() < o2.getType().getId()) {
                return -1;
            }
            if (o1.getType().getId() > o2.getType().getId()) {
                return 1;
            }
            return 0;
        }
    }

    public static Comparator<Ticket> addComp(Comparator<Ticket> comparator, Comparator<Ticket> comparator2){
        return comparator.thenComparing(comparator2);
    }

}
