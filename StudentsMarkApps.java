Package Arrays;

import java.util.Scanner;

public class StudentMarkApps {
    
    public static void main(String[] args) {
        
        //Implementing thhe scanner function to take numbrt of subjects from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("| Student Result Application |");
        System.out.println("--------------------------------");

        System.out.println("Enter the Number of subjects: ");
        int len = sc.nextInt();

        int marks[] = new int[len];

        //This for-loop is a read the makrs based on the array size(subjects)
        for(int pos = 0;pos < len;pos++);


    }
}
