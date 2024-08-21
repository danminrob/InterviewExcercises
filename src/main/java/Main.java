package main.java;

import main.java.easy.ClimbStairs;
import main.java.easy.MergeTwoSortedLists;
import main.java.easy.NumberOfSteps;
import main.java.easy.OpeningAndClosingBrackets;
import main.java.easy.RomanToInt;
import main.java.easy.SetMatrixZeroes;
import main.java.veryeasy.Fizz3Buzz5;
import main.java.veryeasy.PickFromBothSides;
import main.java.veryeasy.ReverseTheString;
import main.java.veryeasy.SmallerOrEqualElements;
import main.java.veryeasy.TotalMovesForBishop;

public class Main {
    public static void main(String[] args) {
//        veryEasyExcercises();
//        easyExcercises();
    }

    public static void veryEasyExcercises() {
        ReverseTheString.testCases();
        Fizz3Buzz5.testCases();
        SmallerOrEqualElements.testCases();
        TotalMovesForBishop.testCases();
        PickFromBothSides.testCases();
    }

    public static void easyExcercises() {
        ClimbStairs.testCases();
        RomanToInt.testCases();
        NumberOfSteps.testCases();
        OpeningAndClosingBrackets.testCases();
        SetMatrixZeroes.testCases();
        MergeTwoSortedLists.testCases();
    }
}
