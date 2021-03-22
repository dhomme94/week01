package com.sparta.week01.prac;

public class Prac {


    public static void main(String[] args) {

        Course course = new Course();
        course.title = "웹개발의 봄, Spring";
        course.tutor = "김도현";
        System.out.println(course.title);
        System.out.println(course.tutor);

        String title = "웹개발의 봄, Spring";
        String tutor = "김도현";
        int days = 28;
        Course course1 = new Course(title, tutor, days);
        System.out.println(course1.title);
        System.out.println(course1.tutor);
        System.out.println(course1.days);


    }


}









