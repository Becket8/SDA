import java.lang.reflect.Array;

public class CustomStack<T> {
    private int index = 0;
    private int size = 0;
    T[] stack;

    public CustomStack(Class<T> t, int size) {
        stack = (T[]) Array.newInstance(t, size);
        this.size = size;
    }

    public void add(T t) {
        if (index < size) {
            stack[index] = t;
            index++;
        } else {
            System.out.println("Stos pelny");
        }


    }

    public T pop() {
        T Object = stack[--index];
        if (Object != null) {
            stack[index] = null;
            return Object;
        } else {
            System.out.println("Nie ma czego zdjac");
        }

        return null;
    }
}
