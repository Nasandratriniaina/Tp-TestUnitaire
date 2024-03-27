package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
@NoArgsConstructor
@Data

public class Calculatrice {
    private int firstNumber=5;
    private int secondNumber=9;
    private double div;

    public Calculatrice(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Calculatrice that)) return false;
        return firstNumber == that.firstNumber && secondNumber == that.secondNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNumber, secondNumber);
    }
    public void addition(int add){
        add=(firstNumber+secondNumber);
        System.out.println("Le resultat est:"+add);
    }
    public void multiplication(int multipl){
        multipl=(firstNumber*secondNumber);
        System.out.println("Le resultat est:"+multipl);
    }
    public void substraction(int sub){
       sub=(firstNumber-secondNumber);
       System.out.println("Le resultat est:"+sub);
    }
    public  void division(double div){
        this.div = div;
        div= (firstNumber/secondNumber);
        System.out.println("Le resultat est:"+div);
    }
}
