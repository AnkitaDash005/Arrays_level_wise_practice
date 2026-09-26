import java.util.*;

public class insert_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number you want to insert: ");
        int num=sc.nextInt();
        System.out.println("Enter the position you want to insert it in: ");
        int pos=sc.nextInt();
        int []t=new int[n+1];
        for(int i=0;i<pos-1;i++){
            t[i]=arr[i];
        }
        t[pos-1]=num;
        for(int i=pos;i<t.length;i++){
            t[i]=arr[i-1];

        }
        System.out.println("New array is: ");
        for(int i=0;i<t.length;i++){
            System.out.print(t[i]+" ");
        }

        sc.close();
    }
}
