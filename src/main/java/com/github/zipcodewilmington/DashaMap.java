package com.github.zipcodewilmington;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMap implements HashMapX {

    Node[] nodeArr = new Node[26];

    private int HashFunctionOne(String input) {
        if (input.length() > 0) {
            return input.toLowerCase().charAt(0) -97;
        }
        return -1;
    }

    @Override
    public void set(String key, Integer value) {
        int keyLetter = HashFunctionOne(key);
        Node current = nodeArr[keyLetter];
        if(current == null){
            current = new Node(key, value);
        }
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(new Node(key, value));
    }

    @Override
    public String delete(String key) {
        return null;
    }

    @Override
    public Integer get(String key) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public long size() {
        long counter = 0;
        for(int i = 0; i < nodeArr.length; i++){
            Node current = nodeArr[i];
            while(current != null){
                counter ++;
                current = current.getNext();
            }
        }
        return counter;
    }

    @Override
    public long bucketSize(String key) {
        Node current = nodeArr[HashFunctionOne(key)];
        long counter = 0;
        while (current != null){
            current = current.getNext();
            counter++;
        }
        return counter;
    }
}
