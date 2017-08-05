package com.stas.JavaOOP.Project;

/**
 * Created by Stas on 06.07.2017.
 */
public class User {
    private String name;
    private UserRole userRole;

    public User(UserRole userRole, String name) {

        this.name = name;
        this.userRole = userRole;
    }

    public String getName() {
        return name;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public Ticket createTicket(TicketType type, String title, String description) {
        return new Ticket(type, title, description, this);
    }

    public Attachment createAttachment(AttachmentType type, String name){
        return new Attachment(type,name,this);
    }

    public Comment createComment(String text){
        return new Comment(text,this);
    }

//    @Override
//    public String toString() {
//        StringJoiner joiner = new StringJoiner(", ","User: ","");
//        return joiner.add("Name: " + getName()).add("Role: " + getUserRole().toString()).toString();
//    }
//}
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userRole=" + userRole +
                '}';
    }
}
