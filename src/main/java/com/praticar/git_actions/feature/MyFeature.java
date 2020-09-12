package com.praticar.git_actions.feature;

import org.springframework.stereotype.Service;

@Service
public class MyFeature {

    public int sumTwoNumbers(int number1, int number2){
        return number1 + number2;
    }
}
