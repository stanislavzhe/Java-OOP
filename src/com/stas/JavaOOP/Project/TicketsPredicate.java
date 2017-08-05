package com.stas.JavaOOP.Project;

import java.util.Objects;
import java.util.function.Predicate;

public class TicketsPredicate {
    public Predicate<Ticket> typeIs(TicketType type) {
        return p -> p.getType().equals(type);
    } // TODO: move to other class

    public static Predicate<Ticket> titleContainsText(String text) {
        return p -> p.getTitle().contains(text);
    }

    public static Predicate<Ticket> statusIs(TicketStatus status) {
        return p -> p.getTicketStatus().equals(status);
    }

    public static Predicate<Ticket> creatorIs(User user) {
        return p -> p.getCreator().equals(user);
    }

    public static Predicate<Ticket> assigneIs(User user) {
        return p -> !Objects.isNull(p.getAssigne()) && p.getAssigne().equals(user);
    }

    public static Predicate<Ticket> loggedTimeMoreThen(double loggedtime) {
        return p -> p.getLoggedTime() >= loggedtime;
    }

    public static Predicate <Ticket> twoConditions(Predicate predicate, Predicate predicateTwo) {
        return predicate.and(predicateTwo);
        //p -> predicate.test(p) && predicateTwo.test(p);
    }
}
