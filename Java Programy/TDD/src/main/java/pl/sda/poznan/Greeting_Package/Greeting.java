package pl.sda.poznan.Greeting_Package;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Greeting {

    public String greet(String... names) {
        String hey;
        if (names == null) {
            hey = "Hello, my friend";
            return hey;
        }
        String name = names[0];
        if (names.length == 1) {
            if (name.equals(name.toUpperCase())) {
                hey = "HELLO, " + name;
                return hey;
            } else {

                hey = "Hello, " + name;
                return hey;
            }
        }
        String result = "Hello";
        for(int i =0; i<names.length;i++){
            if(i == names.length-1){
                result+= " and " + names[i];
            }else{
                result +=  ", " + names[i];

            }

        }return result;


    }

    public Greeting() {
    }

}
