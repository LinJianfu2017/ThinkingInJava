package com.linjianfu.chapter13;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Thirteen14 {
    public static void main(String[] args) {
        String input = "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(Pattern.compile("!!").split(input, 3)));
        System.out.println(Arrays.toString(input.split("!!")));
        System.out.println(Arrays.toString(input.split("!!", 3)));
    }
}
