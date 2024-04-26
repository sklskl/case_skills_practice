package com.test07;

/**
 * @program: case_skills_practice
 * @ClassName: Node
 * @author: skl
 * @create: 2024-03-06 10:48
 */
public class Node {
    //三个属性
    //上一个元素的地址
    private Node pre;

    //当前存入的元素
    private Object obj;

    //下一个元素的地址值
    private Node next;

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "pre=" + pre +
                ", obj=" + obj +
                ", next=" + next +
                '}';
    }
}
