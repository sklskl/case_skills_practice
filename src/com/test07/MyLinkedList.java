package com.test07;

/**
 * @program: case_skills_practice
 * @ClassName: MyLinkedList
 * @author: skl
 * @create: 2024-03-06 10:55
 */
public class MyLinkedList {
    Node first;
    Node last;
    int count;

    public MyLinkedList() {
    }

    //添加元素的方法
    public void add(Object obj) {
        if (first == null) {
            Node n = new Node();
            n.setPre(null);
            n.setObj(obj);
            n.setNext(null);
            //设置头尾节点
            first = n;
            last = n;
        } else {
            Node n = new Node();
            n.setPre(last);
            n.setObj(obj);
            n.setNext(null);
            last.setNext(n);
            last = n;
        }
        count++;
    }

    public int getSize() {
        return count;
    }

    public Object get(int index) {
        if (index < 0 || index > count) {
            throw new IllegalArgumentException("index is illegal");
        }
        Node n = first;
        for (int i = 0; i < index; i++) {
            n = n.getNext();
        }

        return n.getObj();
    }
}

class Test {
    public static void main(String[] args) {
        MyLinkedList ml = new MyLinkedList();
        ml.add("aa");
        ml.add("bb");
        ml.add("cc");
        System.out.println(ml.getSize());
        System.out.println(ml.get(2));
    }

}