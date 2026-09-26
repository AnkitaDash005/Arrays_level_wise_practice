import java.util.Scanner;

public class reverse {
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
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        System.out.println("Reversed array is: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
            
        }
        sc.close();
    }
}
