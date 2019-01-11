package com.gri.alex;

/**
 * User: Alex
 * Date: 6-Jan-19
 */
public class SimpleIinterpreter {

    public int interpret(int value, String[] commands, int[] args) {
        if (commands.length != args.length) {
            System.out.println("Number of Commands and Args different.");
        }

        int result;
        switch(commands[0]) {
            case "+":
                result = value + args[0];
                break;
            case "-":
                result = value - args[0];
                break;
            case "*":
                result = value * args[0];
                break;
            default:
                return -1;
        }

        return result;
    }
}
