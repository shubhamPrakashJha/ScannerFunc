//Scanner class imported here
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner object  created below
        Scanner input=new Scanner(System.in);

        int[] array=new int[3];
        for(int x=0;x<3;x++){
            //scanner method for getting integer implemented
            array[x]=input.nextInt();
        }


        int sum=0;
        for(int x: array){
            sum+= x;
        }

        System.out.println(sum);

    }}