import java.util.Scanner;

/**
 * Created by user on 2017/2/21.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        if(x.nextLine().equals("y")){
            System.out.println("turn left");
        }
        else{
            System.out.println("turn right");
        }
        int b = Integer. parseInt(x.nextLine());
        if(b>0){
            System.out.println(">0");
        }
        else if(b<0){
            System.out.println("<0");
        }
        else{
            System.out.println("=0");
        }
        int k=1;
        while(k<100){
            System.out.println(k);
            k++;
        }
        }
}