package com.calculator.controller;

import com.calculator.domain.Calculator;

import com.calculator.view.InputView;
import com.calculator.view.OutputView;

public class CalculatorController {

    private final InputView inputView;

    private final Calculator calculator;

    private final OutputView outputView;

    public CalculatorController(final InputView inputView, final Calculator calculator, final OutputView outputView) {
        this.inputView = inputView;
        this.calculator = calculator;
        this.outputView = outputView;
    }

    public void run(){
        int firstNumber = inputView.firstNumber();
        int secondNumber = inputView.secondNumber();
        int result = calculator.plusResult(firstNumber,secondNumber);
        outputView.metar(result);
    }
}
