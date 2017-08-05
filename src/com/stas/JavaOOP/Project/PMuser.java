package com.stas.JavaOOP.Project;

/**
 * Created by stanislavz on 15-Jul-17.
 */
public class PMuser extends User {

    public PMuser(String name) {
        super(UserRole.PM,name);
    }

    public Epic createEpic(String title, String description){
        return new Epic(title,description, this);
    }
}
