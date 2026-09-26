import java.util.*;
public class remove_all_occurence_of_a_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number you want to delete: ");
        int num=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]!=num){
                list.add(arr[i]);
            }
        }
        System.out.println("new array after removing all occurences are : ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        sc.close();
    }
}


