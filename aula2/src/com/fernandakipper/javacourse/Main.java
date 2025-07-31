package com.fernandakipper.javacourse;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello World!");
        //Map => estrutura de chave valor
        //Set => não permite duplicatas [1,2,3,4,5]
        //List => List ordenada com elementos duplicados [1,2,3,5,4,4,4]
        //Queue => Filas,usada normalmente para processamento em ordem
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hugo");
        list.add("Aparecido");
        list.add("Hugo");

        System.out.println("List: " + list);

        Set<String> setString = new HashSet<>();
        setString.add("Hello");
        setString.add("Hugo");
        setString.add("Aparecido");
        setString.add("Hugo");

        System.out.println("Set: " + setString.contains("testeee"));

        System.out.println("setString: " + setString);

        Map<String, String> map = new HashMap<>();
        map.put("name", "Hugo");
        map.put("surname", "Aparecido");

        System.out.println(map.get("teste"));*/

        Queue<String> queue = new LinkedList<>();
        queue.add("Hugo");
        queue.add("Leo");

        System.out.println("Queue: " + queue);
        System.out.println("Queue: " + queue.poll());
        System.out.println("Queue: " + queue.poll());
        System.out.println("Queue: " + queue.poll());
        System.out.println("Queue: " + queue);

        LinkedList<String> linked = new LinkedList<>();
    }
}
