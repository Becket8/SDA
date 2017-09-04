package pl.patterns;

/**
 * Created by RENT on 2017-09-01.
 */
public class SimpleSingleton {
    private static Test1 test = new Test1();
    private SimpleSingleton(){

    }
    public static Test1 getInstance(){
        return  test;
    }

    public void showMessage(){
        System.out.println("Hello world");
    }
}
