package com.linjianfu.chapter16;

import java.util.Arrays;

//Exercise 19,24.
class Ex19 implements Comparable<Ex19> {
    int i;

    Ex19(int i) {
        this.i = i;
    }

    @Override
    public int compareTo(Ex19 o) {
        return this.i < o.i ? -1 : (this.i == o.i ? 0 : 1);
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass().getSimpleName() != "Ex19" || this.i != ((Ex19) obj).i;
    }
}

public class Sixteen19 {


    public static void main(String[] args) {
        Ex19[] a = {new Ex19(1), new Ex19(2), new Ex19(3)};
        Ex19[] b = {new Ex19(1), new Ex19(2), new Ex19(3)};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.equals(a, b));
        System.out.println(a[0].getClass().getSimpleName());
        int index = Arrays.binarySearch(a, new Ex19(3));
        System.out.println("index " + index + ", " + a[index]);
    }

}
