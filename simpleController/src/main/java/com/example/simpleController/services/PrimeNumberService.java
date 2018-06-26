package com.example.simpleController.services;

import com.example.simpleController.controllers.PrimeNumberController;
import com.example.simpleController.pojo.PrimeNumberResult;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PrimeNumberService {

    private static  List<Integer> findPrimeNumbersUntil(int initNumber, int endNumber){

        List<Integer> primeNumberList = null;
        String stringTeste = "";

        if (initNumber <= endNumber) {

            primeNumberList = new ArrayList();

            for (int x = initNumber; x <= endNumber; x++) {

                boolean isPrime = true;

                for (int n = 2; n < Math.abs(x); n++) {
                    if (x % n == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime && !(x == -1 || x == 0 || x == 1)) {
                    primeNumberList.add(x);
                    stringTeste = stringTeste + x + ",";
                }
            }
        }

        return primeNumberList;   // return stringTeste;
    }

    public PrimeNumberResult getPrimeNumbersBetween(Integer start, Integer end) {

        PrimeNumberResult primeNumberResult = new PrimeNumberResult();

        List<Integer> primeNumberList = findPrimeNumbersUntil(start, end);

        primeNumberResult.setMessage("Ok. Encontrados " + primeNumberList.size() + " números primos.");

        if(start > end){
            primeNumberResult.setMessage("Início do intervalo maior que o final!");
        }

        if(start == end){
            primeNumberResult.setMessage("O intervalo é nulo!");
        }

        if (primeNumberList.size() == 0){
            primeNumberResult.setMessage("Não encontrei primos neste intervalo!");
        }

        primeNumberResult.setPrimeNumberList(primeNumberList);

        return primeNumberResult;
    }

}

