import java.util.Scanner;

public class Divisibility {
    public static int Divisibility(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0&&arr[i]%3==0){
                count=count+1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : " );
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int val=Divisibility(arr);
        System.out.println("The value is : "+val);
    }
}