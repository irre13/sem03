package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMin {

    public static int Sum(List<Integer> num) {
        int sum = 0;
        for(int i = 0; i < num.size()+1; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        int sum = Sum(num);
        System.out.println(sum / num.size() );
        System.out.println(Collections.max(num));
        System.out.println(Collections.min(num));
    }
}

