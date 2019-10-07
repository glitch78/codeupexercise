import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;

import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something");
        String userInput = sc.nextLine();






        System.out.println(StringUtils.isNumeric(userInput));
        if(StringUtils.isNumeric(userInput)){
            System.out.println("This is a number");
        }else {
            System.out.println(userInput);

        }

        System.out.println(StringUtils.swapCase(userInput));
        System.out.println(StringUtils.reverse(userInput));
    }
}
