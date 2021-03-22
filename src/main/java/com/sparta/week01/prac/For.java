package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class For {
    public static void main(String[] args) {
//        for (시작조건; 반복을 계속할 조건; 더하기) {
//            반복할 명령어
//        }
        List<String> fruits = new ArrayList<>();
        fruits.add("감");
        fruits.add("배");
        fruits.add("감");
        fruits.add("딸기");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("딸기");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("메론");
        fruits.add("수박");
        fruits.add("감");
        System.out.println(fruits);

        for (int i=0; i<13; i++) {
            System.out.println(fruits.get(i));
        }
        // 위의 for문을 풀어서 작성한 문법
        for (int i=0; i<13; i++) {
            String fruit = fruits.get(i);
            System.out.println(fruit);
        }

        // 퀴즈문제
        List<String> celebs = new ArrayList<>();
        celebs.add("아이유");
        celebs.add("린다G");
        celebs.add("은비");
        celebs.add("금비");
        celebs.add("비");
        celebs.add("차은우");
        celebs.add("남주혁");
        celebs.add("수지");
        celebs.add("정우성");
        celebs.add("제니");
        celebs.add("정국");
        for (int i=0; i < celebs.size(); i++) {
            System.out.println(celebs.get(i));
        }

    }
}
