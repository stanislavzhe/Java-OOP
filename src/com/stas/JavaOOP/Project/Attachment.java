package com.stas.JavaOOP.Project;

/**
 * Created by Stas on 06.07.2017.
 */
public class Attachment {
    private final AttachmentType type;
    private String attachmentName;
    private final User author;

    public Attachment(AttachmentType type, String attachmentName, User author) {
        this.type = type;
        this.attachmentName = attachmentName;
        this.author = author;
    }

    public AttachmentType getType() {
        return type;
    }

    public String getAttachmentName() {
        return attachmentName;
    }

    public User getAuthor() {
        return author;
    }

    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "type=" + type +
                ", attachmentName='" + attachmentName + '\'' +
                ", author=" + author +
                '}';
    }
}
