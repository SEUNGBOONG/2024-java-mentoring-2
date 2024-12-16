package com.calculator.view;

import java.util.Scanner;

public class InputView {

    public int firstNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번쨰 정수를 입력하세요: ");
        return scanner.nextInt();
    }

    public int secondNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두번쨰 정수를 입력하세요: ");
        return scanner.nextInt();
    }

}
