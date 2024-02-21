package org.example;

public class Calculatrice {
    public Calculatrice() {
    }

    public Integer add(Integer numberOne, Integer numberTwo){
        return numberOne + numberTwo;
    }

    public Integer substract (Integer numberOne,Integer numberTwo){
        return numberOne - numberTwo;
    }
    public Integer divise (Integer numberOne,Integer numberTwo){
        if (numberTwo == 0){
            System.out.println("Erreur, impossible de divisier par 0");
        }
        return numberOne / numberTwo;
    }
    public Integer multiply (Integer numberOne,Integer numberTwo){
        return numberOne * numberTwo;
    }
}
