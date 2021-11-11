package Lambda;
import java.util.ArrayList;
import java.util.List; 
import java.util.function.Consumer;

public class ques8th {

     public static void main(String[] args){

        Print t=new Print();

        t.start();
        }

}

class Print extends Thread{

         @Override
          public void run() {
               List<Integer> li=new ArrayList<>();

                 li.add(38);

                li.add(24);

                li.add(46);

                li.add(65);

             Consumer<Integer> c=(n)->  System.out.println(n);
                                         
                 

    li.forEach(c);
 }
}