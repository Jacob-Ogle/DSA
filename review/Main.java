package org.bitsmith;

public class Main {
    public static void main(String[] args) {
        var s = new Stack<Integer>(1);
        System.out.println(s.toString());
        s.push(2);
        System.out.println(s.toString());
        s.push(3);
        System.out.println(s.toString());
        s.push(4);
        System.out.println(s.toString());



        var p = s.pop();
        System.out.println("Pop Val :: "+ p);
        System.out.println(s.toString());
    }
}