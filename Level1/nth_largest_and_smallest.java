import java.util.*;
public class nth_largest_and_smallest {

    public static int largest(int []arr,int k){
        if(arr.length<k || k==0){
            return -1;
        }

        return arr[arr.length-k];
    }
    public static int smallest(int []arr,int k){
        if(arr.length<k || k==0){
            return -1;
        }
        return arr[k-1];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
            
        }
        System.out.println("Sorted array is: ");
        for (int i = 0; i <n; i++) {
            System.out.print(a[i]+" ");
            
        }
        System.out.println();
        System.out.println("enter which position largest array u need: ");
        int k1=sc.nextInt();
         System.out.println("enter which position smallest array u need: ");
        int k2=sc.nextInt();
        System.out.println(k1+" largest element is: "+largest(a, k1));
        System.out.println(k2+" smallest element is: "+smallest(a, k2));
        sc.close();
        
    }
}
