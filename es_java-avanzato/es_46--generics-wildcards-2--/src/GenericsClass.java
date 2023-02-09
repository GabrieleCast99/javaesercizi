public class GenericsClass<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T valueToSet) {
        this.t = valueToSet;
    }

    public static <T> boolean isEqual(GenericsClass<T> gc1, GenericsClass<T> gc2){
        T t1= gc1.getT();
        T t2= gc2.getT();
        return t1.equals(t2);
    }
}


