package com.stas.JavaOOP.Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * Created by Stas on 06.07.2017.
 */
public class Ticket {
    private TicketType type;
    private String title;
    private TicketStatus ticketStatus;
    private String description;
    private final User creator;
    private User assigne;
    private List<Comment> comments = new ArrayList<>();
    private List<Attachment> attachments = new ArrayList<>();
    private double originalEstimate;
    private double loggedTime;

    public Ticket(TicketType type, String title, String description, User creator) {
        if (type.equals(TicketType.Epic) && !creator.getUserRole().equals(UserRole.PM)) {
            throw new IllegalArgumentException("Epic could create only PM");
        }
        if (title.isEmpty() || Objects.isNull(title)) {
            throw new IllegalArgumentException("Title is empty or null: " + title);
        }
        this.type = type;
        this.ticketStatus = TicketStatus.Open;
        this.title = title;
        this.description = description;
        this.creator = creator;
    }

    public User getCreator() {
        return creator;
    }

    public TicketType getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title.isEmpty() || Objects.isNull(title)) {
            throw new IllegalArgumentException ("Title is empty or null: " + title);
        }
        this.title = title;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }

    //need to add status tree
    public void setTicketStatus(TicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.isEmpty() || Objects.isNull(description)) {
            throw new IllegalArgumentException("Description is empty or null: " + description);
        }
        this.description = description;
    }

    public User getAssigne() {
        return assigne;
    }

    public void setAssigne(User assigne) {
        this.assigne = assigne;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void addAttachment(Attachment attachment){
        attachments.add(attachment);
    }

    public void addComment(Comment comment){
        comments.add(comment);
    }

    public double getOriginalEstimate() {
        return originalEstimate;
    }

    public void setOriginalEstimate(double originalEstimate) {
        if (originalEstimate < 0) {
            throw new IllegalArgumentException("Time should be > 0, now it " + originalEstimate);
        }
        if (ticketStatus.equals(TicketStatus.Closed) || ticketStatus.equals(TicketStatus.Canceled)) {
            throw new IllegalArgumentException("Epic closed or canceled " + ticketStatus);
        }
        this.originalEstimate = originalEstimate;
    }

    public double getLoggedTime() {
        return loggedTime;
    }

    public void logTime(double logTime) {
        if (logTime < 0) {
            throw new IllegalArgumentException("Time should be > 0, now it " + logTime);
        }
        if (ticketStatus.equals(TicketStatus.Closed) || ticketStatus.equals(TicketStatus.Canceled)) {
            throw new IllegalArgumentException("Epic closed or canceled " + ticketStatus);
        }
        this.loggedTime = getLoggedTime() + logTime;
    }


//    @Override
//    public String toString() {
//        StringJoiner joiner = new StringJoiner("\n","Epic\n","\n");
//        return joiner
//                .add("Type: " + getType())
//                .add("Title: " + getTitle())
//                .add("Status: " + getTicketStatus())
//                .add("Creator: " + getCreator())
//                .add("Assigne: " + getAssigne())
//                .add("Logged time: " + getLoggedTime())
//                .toString();
//    }

    @Override
    public String toString() {
        return "Ticket{" +
                "type=" + type +
                ", title='" + title + '\'' +
                ", ticketStatus=" + ticketStatus +
                ", creator=" + creator +
                ", assigne=" + assigne +
                ", originalEstimate=" + originalEstimate +
                ", loggedTime=" + loggedTime +
                '}';
    }
}
