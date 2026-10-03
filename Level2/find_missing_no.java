import java.util.*;

public class find_missing_no {
    public static List<Integer> missing(int n,int []arr){
        List<Integer>list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            int c=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    c++;
                    break;
                }
            }
            if(c==0){
                list.add(i);
            }
        }

        return list;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> l=missing(n, arr);
        if(l.isEmpty()){
            System.out.println("No elements are missing");
        }
        else{
            System.out.println("Missing elements are:");
            for(int k:l){
                System.out.print(k+" ");
            }
        }

        sc.close();
    }
}
