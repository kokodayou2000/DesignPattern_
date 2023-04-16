package design.principle._06_liskov_substitution_principle;

import java.util.Iterator;

public abstract class AbstractMyList<E> implements IList<E>{

    /**
     *
     * @param index 下标
     * @return 下标对应的值
     * @throws IndexOutOfBoundsException 数组越界异常
     */
    abstract public E get(int index);

    abstract public int size();

    //在末尾添加
    public boolean add(E e) {
        add(size(), e);
        return true;
    }

    /**
     * 添加元素，要比父类的参数范围更大
     * @param index 指定位置
     * @param element 元素
     * @throws UnsupportedOperationException 未实现的方法
     */
    public void add(int index, E element) {
        throw new UnsupportedOperationException();
    }

    abstract public E set(int index, E element);

    //这个在Abstract实现了，但是在MyArrayList中又重写了
    //为了代码复用性，对于LinkedList和ArrayList或者其他的，有些是不用重写该方法的
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
            E value = list.get(index);
            return value;
        }

        @Override
        public E set(int index, E element) {
            E oldValue = list.set(index,element);
            return oldValue;
        }

        @Override
        public int size() {
            return size;
        }

    }
}
