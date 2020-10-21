package Demo.t12;

/**
 * @program: ThreadDemo1
 * @author: ouguoxin
 * @create: 2020-10-20 17:10
 **/

public class Run2 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1?="+Thread.interrupted());
        System.out.println("是否停止2?="+Thread.interrupted());
        System.out.println("end!");
    }

}

