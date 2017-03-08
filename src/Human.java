/**
 * Created by willson on 2017/3/8.
 *
 * @author willson
 *         published under GNU Protocol
 */
public class Human {
    private int age;
    private float weight;

    public Human(){
        age=0;
        weight=5;
    }

    public Human(int ageIn,float weightIn){
        this.age=ageIn;
        this.weight=weightIn;
    }

    public int add(int add1,int add2){
        int a = add1+add2;
        return a;
    }

    public void run(){
        System.out.println("I'm running");
    }
}
