package _16_collection;

import java.util.Iterator;

public class Demo3Iterable {
    public static void main(String[] args) {
        class A implements  Iterable{
            @Override
            public Iterator iterator() {
                Iterator itr = new Iterator() {
                    @Override
                    public boolean hasNext() {
                        return false;
                    }

                    @Override
                    public Object next() {
                        return null;
                    }
                };
                return itr;
            }
        }

        A a = new A();
        Iterator iterator = a.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
    }
}
