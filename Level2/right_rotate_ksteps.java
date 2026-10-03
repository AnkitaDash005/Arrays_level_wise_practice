import java.util.*;
public class right_rotate_ksteps {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter how many steps for rotation");
        int k=sc.nextInt();
        while(k-->0){
        int temp=arr[n-1];
        for(int j=n-1;j>0;j--){
            arr[j]=arr[j-1];
        }
        arr[0]=temp;
    }
        System.out.println("new array is: ");
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}




