import java.util.Arrays;
import java.util.Scanner;
public class prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array element : ");
        int arraysize = sc.nextInt();
        int[] arr = new int[arraysize];
        System.out.print("Enter the array Element : ");
        for(int i=0;i<arraysize;i++){
            arr[i] = sc.nextInt();
        }
        int[] p =new int[arraysize];
        int i=0;
        while(i<arraysize){
            if(i==0){
                p[0] = arr[i];
            }
            else {
                p[i] = p[i-1]+arr[i];
            }
            i++;
        }
        System.out.println(Arrays.toString(p));
    }
}