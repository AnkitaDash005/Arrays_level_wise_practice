import java.util.Scanner;

public class even_odd_index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("Digits in even indices are: ");
        for(int i=0;i<n;i=i+2){
            System.out.print(a[i]+" ");
        }
        System.out.println("Digits in odd indices are: ");
        for(int i=1;i<n;i=i+2){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
