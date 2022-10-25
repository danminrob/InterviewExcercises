package com.dminutti.easy;

import java.util.ArrayList;
import java.util.Arrays;

/*
 Cada valor del arreglo indica cuanto puede avanzar(maximo), retornar si se puede llegar a la ultima posicion del arreglo. 
 */
public class NumberOfSteps {

    public static void testCases(){
        ArrayList<Integer> possibleMoves = new ArrayList<>(Arrays.asList(1,3,0,2,2,2,0,0));
        System.out.println("Expected: true - Result: " + numberOfSteps(possibleMoves));
    }

    private static boolean numberOfSteps(ArrayList<Integer> possibleMoves) {
    	int frsf=0, li=possibleMoves.size()-1;
    	for (int i =0; i<=frsf && frsf<li;i++) {
    		int move = possibleMoves.get(i)+i;
    		System.out.print(possibleMoves.get(i)+i + ",");
    		frsf=Math.max(frsf, move);
    	}
        return frsf>=li;
    }

}
