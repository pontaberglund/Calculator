import java.util.Arrays;
import java.util.LinkedList;

public class MathWithString {
    public static String mathWithString(String s) {
        double result = 0;
        LinkedList<Double> numbers = new LinkedList<>();
        LinkedList<Character> operations = new LinkedList<>();
        StringBuilder sb = new StringBuilder(s);
        int startIndex = 0;
        int endIndex = 0;
        for(int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if(ch != '+' && ch != '-')
                endIndex = i+1;
            else {
                char[] number = new char[endIndex-startIndex+1];
                sb.getChars(startIndex, endIndex, number, 0);
                numbers.add(mulAndDivWithString(String.valueOf(number)));
                operations.add(ch);
                startIndex=i+1;
            }
        }

        //Add last number
        char[] number = new char[endIndex-startIndex+1];
        if(endIndex-startIndex != 0) {
            sb.getChars(startIndex, endIndex, number, 0);
            numbers.add(mulAndDivWithString(String.valueOf(number)));
        } else
            numbers.add(mulAndDivWithString(String.valueOf(number)));

        //Length of numbers
        int numbersLength = 0;
        int index = 0;
        try {
            while(true) {
                numbers.get(index);
                numbersLength++;
                index++;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Length calculated: " + numbersLength);
        }

        //Only a number
        if(operations.isEmpty())
            return String.valueOf(numbers.get(0));
        else if(operations.get(0) == '+')
            result =numbers.get(0) + numbers.get(1);
        else
            result = numbers.get(0) - numbers.get(1);
        for(int i = 2; i < numbersLength; i++) {
            if(operations.get(i-1) == '*')
                result *= numbers.get(i);
            else
                result /= numbers.get(i);
        }

        return String.valueOf(result);
    }
    public static double mulAndDivWithString(String s) {
        double result = 0;
        LinkedList<Double> numbers = new LinkedList<>();
        LinkedList<Character> operations = new LinkedList<>();
        StringBuilder sb = new StringBuilder(s);
        int startIndex = 0;
        int endIndex = 0;
        for(int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if(ch != '*' && ch != '/')
                endIndex = i+1;
            else {
                char[] number = new char[endIndex-startIndex+1];
                if(endIndex-startIndex != 0) {
                    sb.getChars(startIndex, endIndex, number, 0);
                    numbers.add(Double.parseDouble(String.valueOf(number)));
                } else
                    numbers.add(Double.parseDouble(String.valueOf(sb.charAt(startIndex))));
                operations.add(ch);
                startIndex=i+1;
            }
        }

        //Add last number
        char[] number = new char[endIndex-startIndex+1];
        if(endIndex-startIndex != 0) {
            sb.getChars(startIndex, endIndex, number, 0);
            numbers.add(Double.parseDouble(String.valueOf(number)));
        } else
            numbers.add(Double.parseDouble(String.valueOf(sb.charAt(startIndex))));

        //Length of numbers
        int numbersLength = 0;
        int index = 0;
        try {
            while(true) {
                numbers.get(index);
                numbersLength++;
                index++;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Length calculated: " + numbersLength);
        }

        //Only a number
        if(operations.isEmpty())
            return numbers.get(0);
        else if(operations.get(0) == '*')
            result = numbers.get(0) * numbers.get(1);
        else
            result = numbers.get(0) / numbers.get(1);
        for(int i = 2; i < numbersLength; i++) {
            if(operations.get(i-1) == '*')
                result *= numbers.get(i);
            else
                result /= numbers.get(i);
        }
        return result;
    }
}

//TODO: Parenthesis can be solved by recursively solving the string inside the parenthesis
