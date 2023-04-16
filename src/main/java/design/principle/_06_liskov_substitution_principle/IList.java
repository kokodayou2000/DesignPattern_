package design.principle._06_liskov_substitution_principle;

public interface IList<E>{
    /**
     * 如果超出了数组返回就抛出异常
     * @param index 下标
     * @return 下标对应的值
     * @throws IndexOutOfBoundsException 如果超出了数组返回就抛出异常
     */
    E get(int index);

    /**
     * 添加元素
     * @param e 添加的元素
     * @return 是否添加成功
     * @throws IllegalArgumentException 参数异常，应该的指定的泛型方法
     */
    boolean add(E e);

    /**
     * 设置元素
     * @param index 设置元素的位置
     * @param element 元素本身
     * @return 老元素
     * @throws IllegalArgumentException 参数异常
     * @throws IndexOutOfBoundsException 越界异常
     */
    E set(int index, E element);

    /**
     * 获取当前的大小，并非底层数组的实际大小
     * @return 当前的位置
     */
    int size();
}
