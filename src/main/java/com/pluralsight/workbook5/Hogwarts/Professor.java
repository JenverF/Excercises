package com.pluralsight.workbook5.Hogwarts;

public class Professor extends Wizard{
    private String subject;

    public Professor(String name, String house, int powerLevel, String subject) {
        super(name, house, powerLevel);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String castSpell(String spell) {
        System.out.println("Professor " + getName() + " elegantly demonstrates " + spell + " in " + subject + " class.");
        return spell;
    }
    public void teachSpell(String spell) {
        System.out.println("Professor " + getName() + " teaches you " + spell + " in " + subject + " class.");
    }
}
