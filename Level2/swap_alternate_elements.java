import java.util.Scanner;

public class swap_alternate_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();   
        }
        
        for(int j=0;j<arr.length-1;j=j+2){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
        System.out.println("After swapping of alternate elements, they are: ");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        sc.close();
    }
}
