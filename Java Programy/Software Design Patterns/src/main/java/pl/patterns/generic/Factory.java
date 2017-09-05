package pl.patterns.generic;

public interface Factory<K,V> {

    V create(K key);

}
