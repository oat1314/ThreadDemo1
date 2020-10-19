package Demo.t12;

public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("是否停止1 ?= "+thread.isInterrupted());
            System.out.println("是否停止2 ?= "+thread.isInterrupted());
        } catch (Exception e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
