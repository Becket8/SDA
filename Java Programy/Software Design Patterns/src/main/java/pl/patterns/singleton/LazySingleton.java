package pl.patterns.singleton;

/**
 * Created by RENT on 2017-09-04.
 */
public class LazySingleton {
    private static Test1 test;
    private LazySingleton(){

    }
    public static Test1 getInstance(){
        if(test == null){
            test = new Test1();
        }
        return  test;
    }

    public void showMessage(){
        System.out.println("Hello world");
    }
}

