package com.example.task01;

public class Task01Main {
    public static void main(String[] args) {
        codeWithNPE();
    }

    static void codeWithNPE() {
        Object obj = null;
        System.out.println(obj.hashCode());
    }
}
