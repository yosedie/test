import java.util.Arrays;
import java.util.Scanner;

public class pr_1 {
    public static void main(String[] args) {
        System.out.println("made by v");
        System.out.print("made by v");
        System.out.print("made by v");
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, max, min;

        System.out.print("Bilangan 1: ");
        n1 = input.nextInt();

        System.out.print("Bilangan 2: ");
        n2 = input.nextInt();

        System.out.print("Bilangan 3: ");
        n3 = input.nextInt();

        System.out.print("Bilangan 4: ");
        n4 = input.nextInt();

        System.out.print("Bilangan 5: ");
        n5 = input.nextInt();

        System.out.print("Bilangan 6: ");
        n6 = input.nextInt();

        System.out.print("Bilangan 7: ");
        n7 = input.nextInt();

        System.out.print("Bilangan 8: ");
        n8 = input.nextInt();

        System.out.print("Bilangan 9: ");
        n9 = input.nextInt();

        System.out.print("Bilangan 10: ");
        n10 = input.nextInt();

        max = n1; //asumsi n1 terbesar
        if(max < n2)
            max = n2;
        if(max < n3)
            max = n3;
        if(max < n4)
            max = n4;
        if(max < n5)
            max = n5;
        if(max < n6)
            max = n6;
        if(max < n7)
            max = n7;
        if(max < n8)
            max = n8;
        if(max < n9)
            max = n9;
        if(max < n10)
            max = n10;

        min = n1; //asumsi n1 terkecil
        if(min > n2)
            min = n2;
        if(min > n3)
            min = n3;
        if(min > n4)
            min = n4;
        if(min > n5)
            min = n5;
        if(min > n6)
            min = n6;
        if(min > n7)
            min = n7;
        if(min > n8)
            min = n8;
        if(min > n9)
            min = n9;
        if(min > n10)
            min = n10;

        System.out.println();
        System.out.printf("Max: %d\n", max);
        System.out.printf("Min: %d\n", min);
    }
}
