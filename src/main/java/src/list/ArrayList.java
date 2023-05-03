package list;

class ArrayList<E> implements ArrayListInterface<E> {
    private E item[];
    private int numItems;
    private static final int DEFAULT_CAPACITY = 30;
    private final int NOT_FOUND =  -12345;

    ArrayList() {
        this.item = (E[]) new Object[DEFAULT_CAPACITY];
        this.numItems = 0;
    }

    ArrayList(int n) {
        this.item = (E[]) new Object[n];
        this.numItems = 0;
    }

    @Override
    public void add(int index, E x) throws Exception {
        if (numItems >= item.length || index < 0 || index > numItems) {
            throw new Exception("ArrayList add fail~~");
        } else {
            for (int i = numItems - 1; i >= index; i--) {
                item[i + 1] = item[i];
            }

            item[index] = x;
            numItems ++;
        }
    }

    @Override
    public void append(E x) throws Exception {
        if (numItems >= item.length) {
            throw new Exception("append fail!!");
        } else {
            item[numItems++] = x;
        }
    }

    @Override
    public E remove(int index) {
        if (isEmpty() || index < 0 || index > numItems - 1) {
            return null;
        } else {
            E tmp = item[index];
            for (int i = index; i <= numItems - 2; i++) {
                item[i] = item[i + 1];
            }
            item[numItems - 1] = null;
            numItems--;
            return tmp;
        }
    }

    @Override
    public E get(int index) {
        if (index >= 0 && index <= numItems - 1) {
            return item[index];
        }
        return null;
    }

    @Override
    public boolean removeItem(E x) {
        int k = 0;
        while (k < numItems && ((Comparable)item[k]).compareTo(x) != 0) {
            k++;
        }
        if ( k == numItems) return false;
        else {
            for (int i = k; i <= numItems - 2; i++) {
                item[i] = item[i + 1];
            }
            item[numItems - 1] = null;
            numItems--;
            return true;
        }
    }

    @Override
    public void set(int index, E x) throws Exception {
        if (index >= 0 && index <= numItems - 1) {
            item[index] = x;
        } else {
            throw new Exception("set fail in ArrayList");
        }
    }

    @Override
    public int indexOf(E x) {
        for (int i = 0; i < numItems; i ++) {
            if (((Comparable)item[i]).compareTo(x) == 0) return i;
        }
        return NOT_FOUND;
    }

    @Override
    public int len() {
        return item.length;
    }

    @Override
    public boolean isEmpty() {
        return numItems == 0;
    }

    @Override
    public void clear() {
        item = (E[]) new Object[item.length];
        numItems = 0;
    }

    @Override
    public String toString() {
        String result = "";

        for (int i = 0; i < item.length; i++) {
            if (i < item.length - 1) result = result + item[i] + ", ";
            else  result = result + item[i];

        }
        return result;
    }
}