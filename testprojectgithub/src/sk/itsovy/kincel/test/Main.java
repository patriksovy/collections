package sk.itsovy.kincel.test;


import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 65);
        items.put("N",78);
        items.put("T", 84);
        items.put("G", 71);
        items.put("W", 87);

        for(Map.Entry<String, Integer> temp:items.entrySet()){
            System.out.println("Key:"+temp.getKey()+"   Value:"+temp.getValue());


        }

       //items.entrySet().stream().filter((temp)-> temp.getValue()>=70 && temp.getValue()<=80 ).forEach( (temp)->{
        //    System.out.println("Key:"+temp.getKey()+"  Value:"+temp.getValue());
        }

    }


