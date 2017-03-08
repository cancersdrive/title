/**
 * Created by willson on 2017/3/8.
 *
 * @author willson
 *         published under GNU Protocol
 */
public class Student extends Human {
    public int grade;

    public Student(int grade){
        this.grade=grade;
    }

    public void study(String content){
        System.out.println("I got "+grade+" last time,I love studying "+content+"!");
    }
}
