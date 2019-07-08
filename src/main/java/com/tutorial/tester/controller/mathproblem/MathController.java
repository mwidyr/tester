package com.tutorial.tester.controller.mathproblem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/math")
public class MathController {
    @GetMapping("/calculate")
    public String calculate(@RequestParam("number1") Double number1,
                            @RequestParam("operator") String operator,
                            @RequestParam("number2") Double number2) {
        Double result = 0.0;
        if (operator.equals("*") || operator.equals("x")) {
            result = number1 * number2;
        } else if (operator.equals("/")) {
            result = number1 / number2;
        } else if (operator.equals("-")) {
            result = number1 - number2;
        } else if (operator.equals("+")) {
            result = number1 + number2;
        }
        return number1 + " " + operator + " " + number2 + " = " + result;
    }
}
