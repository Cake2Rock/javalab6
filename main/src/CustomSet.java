import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * Custom implementation of a Set with an array-based structure.
 * Supports initial capacity of 15 and expands by 30% when full.
 */
public class CustomSet<T> implements Set<T> {
    private T[] elements; // Generic array to store elements
    private int size;     // Current number of elements

    private static final int INITIAL_CAPACITY = 15;
    private static final double EXPANSION_FACTOR = 1.3;

    /**
     * Default constructor for creating an empty CustomSet.
     */
    @SuppressWarnings("unchecked")
    public CustomSet() {
        elements = (T[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    /**
     * Constructor with a single element.
     * @param element the initial element to add to the set.
     */
    public CustomSet(T element) {
        this();
        add(element);
    }

    /**
     * Constructor with a collection of elements.
     * @param collection the collection to initialize the set with.
     */
    public CustomSet(Collection<? extends T> collection) {
        this();
        addAll(collection);
    }

    /**
     * Ensure the array has enough capacity.
     * Expands by 30% if full.
     */
    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        if (size >= elements.length) {
            int newCapacity = (int) (elements.length * EXPANSION_FACTOR);
            T[] newArray = (T[]) new Object[newCapacity];
            System.arraycopy(elements, 0, newArray, 0, elements.length);
            elements = newArray;
        }
    }

    @Override
    public boolean add(T element) {
        if (element == null || contains(element)) {
            return false; // Nulls and duplicates are not allowed
        }
        ensureCapacity();
        elements[size++] = element;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                // Shift elements to fill the gap
                System.arraycopy(elements, i + 1, elements, i, size - i - 1);
                elements[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public T next() {
                return elements[currentIndex++];
            }
        };
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object item : c) {
            if (!contains(item)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean modified = false;
        for (T item : c) {
            if (add(item)) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        boolean modified = false;
        for (int i = 0; i < size; i++) {
            if (!c.contains(elements[i])) {
                remove(elements[i]);
                i--; // Recheck current index after removal
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        for (Object item : c) {
            if (remove(item)) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        System.arraycopy(elements, 0, result, 0, size);
        return result;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <U> U[] toArray(U[] a) {
        if (a.length < size) {
            return (U[]) java.util.Arrays.copyOf(elements, size, a.getClass());
        }
        System.arraycopy(elements, 0, a, 0, size);
        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }
}
