package pl.patterns;

/**
 * Created by RENT on 2017-09-01.
 */
public class SimpleSingletonTest {
    private static Test test = new Test();
    private SimpleSingletonTest(){

    }
    public static Test getInstance(){
        return  test;
    }
}
