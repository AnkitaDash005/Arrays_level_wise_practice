import java.util.*;
public class Basics{
    public static int l(int []arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        return max;
    }
    public static int s(int []arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        return min;
    }
    public static int sum(int []arr){
        int s=0;
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
        }
        return s;
    }
     public static int avg(int []arr){
        int a=sum(arr)/arr.length;
        return a;
    }
     public static int count_even(int []arr){
        int s=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                s++;
            }
        }
        return s;
    }
    public static int count_odd(int []arr){
        
        return arr.length-count_even(arr);
    }
    public static int[] c(int []arr){
        int z=0;
        int p=0;
        int n=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                z++;
            }
            else if(arr[i]>0){
                p++;
            }
            else{
                n++;
            }
        }
        int []a={z,p,n};

        return a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Max in array is: "+l(arr));
        System.out.println("Min in array is: "+s(arr));
        System.out.println("sum: "+sum(arr));
        System.out.println("avg: "+avg(arr));
        System.out.println("count of even: "+count_even(arr));
        System.out.println("count of odd: "+count_odd(arr));
        int [] k=c(arr);
        System.out.println("Zero: "+k[0]);
        System.out.println("Positive: "+k[1]);
        System.out.println("Negative: "+k[2]);
        sc.close();
    }
}