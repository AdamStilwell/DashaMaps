package com.github.zipcodewilmington;

public class Node<String> {
    Integer value;
    String key;
    Node next;

    public Node(String key, Integer value){
        this.value = value;
        this.key = key;
        next = null;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


}
