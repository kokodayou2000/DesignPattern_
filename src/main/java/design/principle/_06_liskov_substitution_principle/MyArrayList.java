package design.principle._06_liskov_substitution_principle;

public class MyArrayList<E> extends AbstractMyList<E> implements IList<E>{

    private Object[] elements = new Object[100];

    private int size = 0;
    @Override
    public E get(int index) {
        rangeCheck(index);
        E element = (E) elements[index];
        return element;
    }


    @Override
    public boolean add(E element){
        elements[size++] = element;
        return true;
    }

    @Override
    public void add(int index, E element) {
        rangeCheck(index);
        elements[index] = element;

        size++;

    }

    @Override
    public E set(int index, E element) {
        rangeCheck(index);
        E oldValue = (E) elements[index];
        elements[index] = element;
        return oldValue;

    }

    @Override
    public int size() {
        return size;
    }


    private void rangeCheck(int index) {
        if (index >= size())
            throw new IndexOutOfBoundsException();
    }

    public IList<E> subList(int fromIndex,int toIndex){
        return new SubList(this,fromIndex,toIndex);
    }

    //相当于切片，或者称为视图
    private class SubList extends AbstractMyList<E>{

        private final MyArrayList<E> list;
        private final int startIndex ;
        private final int endIndex;
        private final int offset;
        int size;
        public SubList(MyArrayList<E> parent, int fromIndex, int toIndex) {
            this.list = parent;
            this.startIndex  = fromIndex;
            this.endIndex = toIndex;
            this.size = toIndex - fromIndex;
            this.offset = fromIndex;
        }

        @Override
        public E get(int index) {
            rangeCheck(index+offset);
            E value = (E) list.elements[offset + index];
            return value;
        }

        @Override
        public E set(int index, E element) {
            rangeCheck(index+offset);
            E oldValue = (E) elements[index+offset];
            elements[index+offset] = element;
            return oldValue;
        }

        @Override
        public int size() {
            return size;
        }

    }
}
