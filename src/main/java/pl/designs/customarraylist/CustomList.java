package pl.designs.customarraylist;


public class CustomList<E> {

    private static final int INITIAL_CAPACITY = 16;

    private static int SIZE = 0;
    private Object [] array;

    public CustomList() {
        this(INITIAL_CAPACITY);
    }

    public CustomList(int capacity) {
        this.array = new Object[capacity];
    }


    public int size() {
        return SIZE;
    }

    public void add(E element) {
        if(element == null) {
            throw new NullPointerException();
        }

        if(SIZE == INITIAL_CAPACITY) {
            resize(SIZE + 1);
        }

        this.array[SIZE] = element;
        SIZE++;
    }

    public void remove(int index) {
        E el = get(index);

        if(el == null) {
            throw new NullPointerException("No element at such index");
        }

        for(int i = index; i < array.length - 1; i++) {
            array[i] = null;
            array[i] = array[i + 1];
        }

        SIZE--;
    }


    public E get(int index) {
        if(index >= SIZE) {
            return null;
        }

        Object element = this.array[index];
        @SuppressWarnings("unchecked") E el = (E) element;

        return el;
    }


    private void resize(int growSize) {
        Object [] newArray = new Object[growSize];
        System.arraycopy(array, 0, newArray, 0, array.length);

        this.array = newArray;
    }

}
