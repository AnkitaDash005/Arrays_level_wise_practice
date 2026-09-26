import java.util.*;
public class copy_arr {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Original array is :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
            
        }
        System.out.println();
        int []t=new int[a.length];
        for(int i=0;i<n;i++){
            t[i]=a[i];
        }
        System.out.println("new array is :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(t[i]+" ");
            
        }
        
        sc.close();
    }
}


