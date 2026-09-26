import java.util.Scanner;

public class move_zeroes_to_end {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int n_z=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[n_z]=arr[i];
                n_z++;
            }

        }
        while(n_z<n){
            arr[n_z]=0;
            n_z++;
        }
        System.out.println("new array is: ");
         for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
