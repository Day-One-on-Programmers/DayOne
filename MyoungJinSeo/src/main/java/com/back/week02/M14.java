package com.back.week02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M14 {
    public static void main(String[] args) {
        String [] phoneBook = {"119", "97674223", "1195524421"};
//        String [] phoneBook = {"123","456","789"};
        System.out.println(solution(phoneBook));
    }

    public static boolean solution(String[] phoneBook) {
        List<String> list = new ArrayList<>(Arrays.asList(phoneBook));
        Arrays.sort(phoneBook);
        for (int i = 0; i < phoneBook.length - 1; i++) {
            if (phoneBook[i+1].indexOf(phoneBook[i]) == 0)
                return false;
        }
        return true;
    }
}
