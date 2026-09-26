import java.util.*;
public class palindrome{

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int start=0;
        int end=n-1;
        int k=0;
        while(start<end){
           if(a[start]!=a[end]){
            k=1;
            break;
           }
            start++;
            end--;
        }
        if(k==0){
        System.out.println("Array is a palindrome. ");
        }
        else{
            System.out.println("Array is not a Palindrome. ");
        }
        sc.close();
    }
}


