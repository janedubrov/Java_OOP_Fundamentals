package generics;

public class Pair<T> {
    private T firstItem;
    private T secondItem;

    public Pair(T firstName,T secondItem) {
        this.firstItem = firstName;
        this.secondItem = secondItem;
    }

    public T getFirstItem() {
        return firstItem;
    }

    public void setFirstItem(T firstItem) {
        this.firstItem = firstItem;
    }

    public T getSecondItem() {
        return secondItem;
    }

    public void setSecondName(T secondItem) {
        this.secondItem = secondItem;
    }
}
