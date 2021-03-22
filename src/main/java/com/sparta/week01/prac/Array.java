package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        //List 배열 , add 값을 넣을 때 사용 , get 값을 뽑아 쓸때 사용 , remove 값을 지울 때 사용
        List<String> myList = new ArrayList<>();
        String course1 = "웹개발의 봄 String";
        String course2 = "프론트앤드의 꽃 React";
        myList.add(course1);
        myList.add(course2);
        System.out.println(myList);
        System.out.println(myList.get(0));
        myList.remove(1);
        System.out.println(myList);

    }
}
