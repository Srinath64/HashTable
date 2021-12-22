package com.company;

public class HashTableMain {
    public static void main(String[] args) {

        Hashtable<String , Integer> hash = new Hashtable();

        String message = "To be or not to be";


        String[] messageArray = message.toLowerCase().split(" ");

        for(String word: messageArray) {

            Integer value =  hash.get(word);

            if( value == null)
                value = 1;
            else
                value = value + 1;
            hash.add(word , value);
        }
        System.out.println(hash);
    }
}
