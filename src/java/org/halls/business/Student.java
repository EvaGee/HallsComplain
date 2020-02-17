/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.halls.business;

/**
 *
 * @author Eva Gee
 */
public class Student {

    private String name;
    private String regno;
    private String hostel;
    private String room;
    private String block;
    private String password;
    
    public Student()
    {
        name="";
        regno="";
        hostel="";
        room="";
        block="";
        password="";
    }

    public Student(String name, String regno, String hostel, String block, String room, String password) {
        this.name=name;
        this.regno=regno;
        this.hostel=hostel;
        this.block=block;
        this.room=room;
        this.password=password;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the regno
     */
    public String getRegno() {
        return regno;
    }

    /**
     * @param regno the regno to set
     */
    public void setRegno(String regno) {
        this.regno = regno;
    }

    /**
     * @return the hostel
     */
    public String getHostel() {
        return hostel;
    }

    /**
     * @param hostel the hostel to set
     */
    public void setHostel(String hostel) {
        this.hostel = hostel;
    }

    /**
     * @return the room
     */
    public String getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(String room) {
        this.room = room;
    }

    /**
     * @return the block
     */
    public String getBlock() {
        return block;
    }

    /**
     * @param block the block to set
     */
    public void setBlock(String block) {
        this.block = block;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

   
    
}
