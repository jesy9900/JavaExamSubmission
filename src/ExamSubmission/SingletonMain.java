package ExamSubmission;

public class SingletonMain {
    public static void main(String[] args) {

        Singleton o = Singleton.getInstance(10);
        Singleton o2 = Singleton.getInstance(20);
        Singleton o3 = Singleton.getInstance(30);

        System.out.println(o.x);
        System.out.println(o2.x);
        System.out.println(o3.x);


    }
}
