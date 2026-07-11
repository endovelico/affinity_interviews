package com.afffinty.interview.Strings;

public class MyStringComparator {

    public static void main(String[] args) {
        String x = "hello";
        String y = "hel";
        String z = "lo";
        final String a = "hel";
        final String b = "lo";


        String primeiro = "hello";
        String segundo = "hell" + "o";
        String terceiro = new String("hello");
        String quatro = x;
        String cinco = y + z;
        final String seis = y + z;
        String sete = new String("hello").intern();
        String oito = a + b;

        System.out.println("primeiro == segundo  : " + (primeiro == segundo));
        System.out.println("primeiro == terceiro : " + (primeiro == terceiro));
        System.out.println("primeiro == quatro   : " + (primeiro == quatro));
        System.out.println("primeiro == cinco    : " + (primeiro == cinco));
        System.out.println("primeiro == seis     : " + (primeiro == seis));
        System.out.println("primeiro == sete     : " + (primeiro == sete));
        System.out.println("primeiro == sete     : " + (primeiro == oito));

    }
}
