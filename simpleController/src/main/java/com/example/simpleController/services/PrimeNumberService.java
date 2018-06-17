package com.example.simpleController.services;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

//@Service
public class PrimeNumberService {

    private static List<Integer> findPrimeNumbersUntil(int initNumber, int endNumber){

        List primeNumberList = new ArrayList();

        for (int x = initNumber; x < endNumber; x++){

            boolean isPrime = true;

            for (int n = 2; n < x; n++){
                if (x % n == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime && !(x == 0 || x == 1)) {
                primeNumberList.add(x);
            }

        }

        // Tirar o teste de zero e um que se repete várias vezes e colocar o teste aqui, antes de passar o resultado.

        return primeNumberList;

    }

    public static void main(String[] args) {
        System.out.println(findPrimeNumbersUntil(0, 100));
    }

}

