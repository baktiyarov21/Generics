public class Box <K,V,F>{
    private K key;
    private V value;
    private F fl;

    public Box(K key, V value, F fl) {
        this.key = key;
        this.value = value;
        this.fl = fl;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public F getFl() {
        return fl;
    }

    public void setFl(F fl) {
        this.fl = fl;
    }
}
