package com.example;

public class Clock {
    private int hours;
    private int minutes;

    public Clock(int hours, int minutes) {
        // TODO: Initialize the hours and minutes
        this.hours = hours;
        this.minutes = minutes;
    }

    public void addMinutes(int minutes) {
        // TODO: Add the value of the minutes parameter to the current minutes.
        // Adjust the hours and minutes accordingly to represent a valid time.
        this.minutes = this.minutes + minutes;
        if (this.minutes > 59) {
            this.minutes = this.minutes - 60;
            this.hours = this.hours + 1;
        }
        if (this.hours > 12) {
            this.hours = this.hours - 12;
        }
    }

    public String getTime() {
        // TODO: Return the time in the format "HH:MM"
        String hours_ = String.valueOf(this.hours);
        if (this.hours < 10) {
            hours_ = "0" + this.hours;
        }
        return hours_ + ":" + this.minutes; // Change this default return statement
    }
}
