//package com.example.simpleController.services;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Service
public class PrimeNumberService {

//    public List<Integer> findPrimeNumbersUntil(int endNumber){

//        List<Integer> primeNumberList = new ArrayList<>();

    public static void main(String[] args){

        int endNumber = 10;
        int arrayPrime [] = new int[endNumber];
        int i = 1; // Índice da Array
        int x = 3; // Primeiro número a ser testado, até o limite endNumbers.
        int n = 2; // Primeiro número da divisão para testar o resto.

        arrayPrime[0] = 2;

        while (x < endNumber){

            n = 2;

            while (n < (x - 1)){

                if ((x % n) != 0){ break; }

                n++;

            }

            if (n == x){ arrayPrime[i] = x; i++; }

            x++;

        }

        System.out.println(Arrays.toString(arrayPrime));



        //return Arrays.asList(1,2,3);

    }
}
