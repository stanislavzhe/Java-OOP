package com.stas.JavaOOP.Project;

import java.io.*;
import java.util.List;

/**
 * Created by Stas on 06.07.2017.
 */
public class MainRunner {
    public static void main(String[] args) throws IOException {
        //create 3 user
        User dev = new User(UserRole.Dev, "John");
        User qa = new User(UserRole.QA, "Micke");
        PMuser pm = new PMuser("Bob");

        //create 2 epic
        Epic epic = pm.createEpic("First epic", "Need to add new tasks for all types");
        Epic epic2 = pm.createEpic("Second one", "");

        //create some tickets
        Ticket defect = qa.createTicket(TicketType.Defect, "Unkown issue", "STR: 1\n2\n\3");
        Ticket defect2 = qa.createTicket(TicketType.Defect, "Project crashes", "STR: 1\n2\n\3");
        Ticket defect3 = qa.createTicket(TicketType.Defect, "Project out of memory", "STR: 1\n2\n\3");
        Ticket task = dev.createTicket(TicketType.Task, "Code review", "code review round 1");
        Ticket task2 = pm.createTicket(TicketType.Task, "Develop new project", "Need to add some ideas");
        Ticket task3 = qa.createTicket(TicketType.Task, "Add debug", "Add debug with cheat for test execution");

        //add tickets to epics
        epic.linkToEpic(task);
        epic.linkToEpic(task2);
        epic.linkToEpic(defect);
        epic.linkToEpic(defect2);
        epic2.linkToEpic(defect3);
        epic2.linkToEpic(task3);

        //add tickets to ticketsList
        TicketsList ticketsList = new TicketsList();
        Ticket defect4 = qa.createTicket(TicketType.Defect, "No internet connection", "For all projects");
        ticketsList.addToList(defect4);
        System.out.println(ticketsList);
        ticketsList.addEpicWithTickets(epic);
        System.out.println(ticketsList);
        ticketsList.addEpicWithTickets(epic2);
        System.out.println(ticketsList);

        System.out.println("Dev info: " + dev);
        System.out.println("PM info: " + pm);
        System.out.println("Epic info: " + epic);

        Ticket ticket1 = dev.createTicket(TicketType.Task, "Developemnt", "Add content");
        epic.linkToEpic(ticket1);
        ticketsList.addToList(ticket1);
        Ticket ticket2 = pm.createTicket(TicketType.Defect, "Defect", "Add content for defect");
        epic.linkToEpic(ticket2);
        ticketsList.addToList(ticket2);
        ticket1.setAssigne(dev);

        ticket1.setOriginalEstimate(1);
        ticket1.logTime(0.7);
        ticket1.logTime(1.2);
        ticket1.setTicketStatus(TicketStatus.In_Progress);
        ticket1.addComment(dev.createComment("Start working with revision 123"));
        ticket1.addAttachment(dev.createAttachment(AttachmentType.Picture, "Screen.png"));

        System.out.println(ticket1);
        ticket2.setAssigne(dev);
        System.out.println(ticket2);
        ticket2.logTime(1.9);

        ticketsList.sortBy(new TicketsComparator.TicketsByLoggedTimeComparator().
                thenComparing(new TicketsComparator.TicketsByStatusComparator()).reversed());
        System.out.println(ticketsList);
        System.out.println();


        System.out.println(ticketsList.filter(TicketsPredicate.creatorIs(pm)));
        System.out.println("Filter: " + ticketsList.filter(TicketsPredicate.loggedTimeMoreThen(1)));

        System.out.println("Filter of two: " + ticketsList.filter(TicketsPredicate.twoConditions(TicketsPredicate.
                loggedTimeMoreThen(1), TicketsPredicate.creatorIs(dev))));

        System.out.println("Filter of two: " + ticketsList.filter(TicketsPredicate.twoConditions(TicketsPredicate.
                assigneIs(dev), TicketsPredicate.creatorIs(dev))));
    }
}
