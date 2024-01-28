package org.task1;

public class Task1 {
    public static void main(String[] args) {
        String text = "Owocowo";
        TextFormatter formatter = new TextFormatter(text);

        if(formatter.isContainSigns()) {
            System.out.println(formatter.isPalindromeText());
            System.out.println(formatter.getTextLenght());
        }
    }
}
