import java.util.Scanner;

public class find_element_with_one_occurence_whileOtherHave2Occurence {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();   
        }
        int res=0;
        for (int j = 0; j< arr.length; j++) {
            res^=arr[j];   
        }
        System.out.println("Unique element is: "+res);
        sc.close();
    }
}
