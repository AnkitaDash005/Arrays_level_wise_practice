import java.util.*;
public class frequency_of_element {
    public static int c(int []arr,int n){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the no. whose frequency you want to find");
        int k=sc.nextInt();
        System.out.println("Frequency of "+k+" is "+c(a, k));
        sc.close();
        
    }
}
