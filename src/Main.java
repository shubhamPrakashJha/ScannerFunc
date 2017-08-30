import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner created below
        Scanner input=new Scanner(System.in);

        int[] array=new int[3];
        // taking input using for loop here
        for(int x=0;x<3;x++){
            array[x]=input.nextInt();
        }


        int sum=0;
        for(int x=0;x<array.length;x++){
            sum+=array[x];
        }

        System.out.println(sum);

    }}