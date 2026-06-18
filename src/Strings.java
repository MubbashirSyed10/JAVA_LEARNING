public class Strings {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder s = new StringBuilder("hello world 1 hello java world");
        StringBuffer sb = new StringBuffer("hello world 2 hello java world");
        s.append(" hello world 3 hello java world");
        System.out.println(s);
        System.out.println(sb);


        // StringBuilder s2 = new StringBuilder(); // To fix this we need StringBuffer
        StringBuffer s2 = new StringBuffer();
        Task t1 = new Task(s2);
        Task t2 = new Task(s2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("length of s2 - " + s2.length()); // Random output and sometimes out of bound error.
        System.out.println(s2);
    }
}

class Task extends Thread {
//    private StringBuilder s;
    private StringBuffer s;
    public Task(StringBuffer s){
        this.s = s;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            s.append("a");
        }
    }
}
