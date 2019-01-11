package com.gri.alex;

/**
 * User: Alex
 * Date: 6-Jan-19
 */
public class SimpleInterpreter {

    public int interpret(int value, String[] commands, int[] args) {
        if (commands.length != args.length) {
            System.out.println("Number of Commands and Args different.");
            return -1;
        }

        int result = value;
        for (int i = 0; i < commands.length; i++) {

            switch(commands[i]) {
                case "+":
                    result += args[i];
                    break;
                case "-":
                    result -= args[i];
                    break;
                case "*":
                    result *= args[i];
                    break;
                default:
                    return -1;
            }
        }

        return result;
    }
}
