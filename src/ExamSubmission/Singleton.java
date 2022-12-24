package ExamSubmission;

public class Singleton {
    int x = 70;
    static Singleton obj = new Singleton();
    private Singleton(){

    }
    public static Singleton getInstance(int x){
        return obj;
    }

}


