package com.example.simpleController.services;

import com.example.simpleController.pojo.PrimeNumberResult;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PrimeNumberService {

    public PrimeNumberResult getPrimeNumbersBetween(Integer initNumber, Integer endNumber) {

        String vrMensagem;
        List<Integer> primeNumberList = new ArrayList();

       if (initNumber > endNumber) {

            vrMensagem = "Início do intervalo maior que o final!";

        } else {

            for (int vrValor = initNumber; vrValor <= endNumber; vrValor++) {

                boolean isPrime = true;

                for (int n = 2; n <= Math.round(Math.sqrt(Math.abs(vrValor))); n++) {
                    if (vrValor % n == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime && !(vrValor == -1 || vrValor == 0 || vrValor == 1)) {
                    primeNumberList.add(vrValor);
                }
            }

            if (primeNumberList.size() == 0) {
                vrMensagem = "Não encontrei primos neste intervalo!";
            } else {
                if (primeNumberList.size() == 1) {
                    vrMensagem = "Encontrado 1 número primo neste intervalor.";
                } else {
                    vrMensagem = "Encontrados " + primeNumberList.size() + " números primos neste intervalor.";
                }
            }

       }

        PrimeNumberResult primeNumberResult = new PrimeNumberResult();

        primeNumberResult.setMessage(vrMensagem);
        primeNumberResult.setPrimeNumberList(primeNumberList);

        return primeNumberResult;
    }

}