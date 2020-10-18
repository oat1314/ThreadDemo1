package Demo;

public class MyThread {
    public static void main(String[] args) {
        MyThreadA a = new MyThreadA("A");
        MyThreadA b = new MyThreadA("B");
        MyThreadA c = new MyThreadA("C");
        a.start();
        b.start();
        c.start();
    }

}

class MyThreadA extends Thread {
    private int count = 5;
    public MyThreadA(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count --;
            System.out.println("由" + currentThread().getName() + "计算,count="+count);
        }
    }
}