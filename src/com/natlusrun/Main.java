package com.natlusrun;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// banknotes <- [1, 3, 5, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000]
        //quantities <- [10, 5, 5, 3, 2, 1, 2, 3, 3, 2, 0, 2]
        //
        //OTPUT ‘Введите сумму для снятия:’
        //withdraw <- USERINPUT
        //totalAvailable <-0
        //result <- ‘ ‘
        //remainToGive <- withdraw
        //
        //FOR i <- 0 TO LEN(banknotes) - 1
        //	totalAvailable <- totalAvailable + banknotes[i] * quantities[i]
        //ENDFOR
        //
        //IF (remainToGive > totalAvailable)
        //	OUTPUT ‘недостаточно средств для снятия!’
        //ELSE
        //	FOR i <- LEN(banknotes) - 1 TO 0
        //		IF (remainToGive >= banknotes[i])
        //			remainToGive DIV banknotes[i]
        //			IF quantity <= quantities[i] THEN
        //				result <- result + ‘ ’ + quantity + ‘ x ‘ + banknotes[i]
        //				quantities <- quantities[i] - quantity
        //				remainToGive <- remainToGive - quantity * banknotes[i]
        //				IF remainToGive = 0 THEN
        //					EXITFOR
        //				ENDIF
        //			ELSE
        //				esult <- result + ‘ ’ + quantities[i] + ‘ x ‘ + banknotes[i]
        //				remainToGive <- remainToGive - quantities[i] * banknotes[i]
        //quantities <- 0
        //ENDIF
        //		ENDIF
        //	ENDFOR
        //
        //IF remainToGive <- 0 THEN
        //	OUTPUT ‘Вы получили ’ + result + ‘Всего ‘ + withdraw
        //ELSEIF ()

//        int[] banknotes = {1,3,5,10,20,50,100,200,500,1000,2000,5000};
//        int[] quantities = {10,5,5,3,2,1,2,3,3,2,0,2};
//        int withdraw = 0;
//        int totalAvailable = 0;
//        String result = "";
//        int remainToGive = withdraw;
//
//        System.out.println("Введите сумму для снятия: ");
//        Scanner scanner = new Scanner(System.in);
//        int userInput = scanner.nextInt();
//        //System.out.println("Вы хотите снять " + userInput + " сом");
//        withdraw = userInput;
//
//        for (int i = 0; i < banknotes.length; i++) {
//            totalAvailable = totalAvailable + banknotes[i] * quantities[i];
//        }
//        System.out.println("Всего для снятия доступно " + totalAvailable + " сом");
//
//        if (remainToGive > totalAvailable){
//            System.out.println("Недостаточно средств для снятия!");
//        }
//

        int [] array = {54, -5, 67, 111, 23, 9, -1};
        for (int i = array.length-1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (j == i){
                    break;
                }
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array [j+1];
                    array[j+1]= temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
