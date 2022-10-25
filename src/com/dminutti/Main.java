package com.dminutti;

import com.dminutti.easy.NumberOfSteps;
import com.dminutti.veryeasy.Fizz3Buzz5;
import com.dminutti.veryeasy.PickFromBothSides;
import com.dminutti.veryeasy.ReverseTheString;
import com.dminutti.veryeasy.SmallerOrEqualElements;
import com.dminutti.veryeasy.TotalMovesForBishop;

public class Main {
    public static void main(String[] args) {
//        veryEasyExcercises();
        easyExcercises();
    }

    public static void veryEasyExcercises() {
        ReverseTheString.testCases();
        Fizz3Buzz5.testCases();
        SmallerOrEqualElements.testCases();
        TotalMovesForBishop.testCases();
        PickFromBothSides.testCases();
    }

    public static void easyExcercises() {
    	NumberOfSteps.testCases();
//        OpeningAndClosingBrackets.testCases();
//        SetMatrixZeroes.testCases();
    }
}
