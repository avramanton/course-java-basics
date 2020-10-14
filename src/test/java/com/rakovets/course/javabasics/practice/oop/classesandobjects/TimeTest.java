package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class TimeTest {
        public static void main(String[] args) {
            Time hours = new Time(3600);
            Time minutes = new Time(60);
            Time seconds = new Time(1);
            System.out.println("Hours: " + hours.getHours());
            System.out.println("Minutes: " + minutes.getMinutes());
            System.out.println("Seconds: " + seconds.getSeconds());
        }
    }
