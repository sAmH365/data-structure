package list;

public interface ArrayListInterface<E> {
    // i 번째 자리에 원소 x를 삽입
    // i 번째 원소를 삭제
    // 원소 x를 삭제
    // i 번째 원소를 알려준다
    // 원소 x가 몇번째 원소인지 알려준다
    // 리스트의 사이즈를 알려준다

    void add(int index, E x) throws Exception;
    void append(E x) throws Exception;
    E remove(int index);
    E get(int index);
    boolean removeItem(E x);
    void set(int index, E x) throws Exception;
    int indexOf(E x);
    int len();
    boolean isEmpty();
    void clear();
}
