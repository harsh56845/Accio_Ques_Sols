// Ques Link :- https://course.acciojob.com/idle?question=ddd4b934-70d9-4555-ab6d-fcb8263cddb4

import java.util.*;

class Solutions {
    public static int calculateSavings(int income, int expensePercent) {
		return (int)(income - (expensePercent*income*0.01));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int expensePercent = sc.nextInt();
        Solutions obj= new Solutions();
        int savings = obj.calculateSavings(income, expensePercent);
        System.out.println(savings);
    }
}
