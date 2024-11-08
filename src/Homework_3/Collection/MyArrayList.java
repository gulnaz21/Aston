package Homework_3.Collection;

public class MyArrayList<T> {
    private T[] array;
    private int length;
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;

    public MyArrayList(){
        capacity = DEFAULT_CAPACITY;
        array = (T[]) new Object[capacity];
    }
    public MyArrayList(int initialCapacity){
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
    }

    public boolean add(T val){
        if (length == capacity){
            increaseArray();
        }
        array[length] = val;
        length++;
        return true;
    }

    public T get(int index){
        if (index < 0 || index >= length)
            throw new IndexOutOfBoundsException();
        return array[index];
    }

    public T remove(int index){
        if (index < 0 || index >= length)
            throw new IndexOutOfBoundsException();

        T remove = array[index];
        for (int i = index; i < length; i++){
            array[i] = array[i + 1];
        }
        length--;
        return remove;
    }

    public boolean addAll(int index, MyArrayList<T> list){
        if (index < 0 || index >= length)
            throw new IndexOutOfBoundsException();
        T[] newArray = (T[]) new Object[length + list.length];
        int k = 0;
        for (int i = 0; i < index; i++, k++){
            newArray[k] = array[i];
        }
        for (int i = 0; i < list.length; i++, k++) {
            newArray[k] = list.array[i];
        }
        for (int i = index; i < length; i++, k++){
            newArray[k] = array[i];
        }
        array = newArray;
        length = length + list.length;
        capacity = length;
        return true;
    }

    public int size(){
        return length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (length > 0) {
            for (int i = 0; i < length - 1; i++) {
                sb.append(array[i]).append(", ");
            }
            sb.append(array[length - 1]);
        }
        sb.append("]");
        return sb.toString();
    }

    private void increaseArray(){
        int newCapacity = capacity * 3 / 2 + 1;
        T[] newArray = (T[]) new Object[newCapacity];
        for (int i = 0; i < capacity; i++){
            newArray[i] = array[i];
        }
        array = newArray;
        capacity = newCapacity;
    }
}
