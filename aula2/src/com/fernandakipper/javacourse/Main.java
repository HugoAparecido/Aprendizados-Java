package com.fernandakipper.javacourse;

import com.fernandakipper.javacourse.carro.Carro2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Map => estrutura de chave valor
        //Set => não permite duplicatas [1,2,3,4,5]
        //List => List ordenada com elementos duplicados [1,2,3,5,4,4,4]
        //Queue => Filas,usada normalmente para processamento em ordem
        List<String> list = new ArrayList<>();
        list.add("Ariel Sousa");
        list.add("Hugo Aparecido");
        list.add("Hugo Santos");
        list.add("Hugo Moreira");
        list.add("Eduardo Moreira");

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

        System.out.println(map.get("teste"));

        Carro2 sandero = new Carro2("Sandero", "Preto", 2020, "ABC-1234");
        System.out.println(sandero.ano());
        System.out.println(sandero.modelo());

        // DTOs => data transfer objects
        // POJOs => plain old java objects

        Queue<String> queue = new LinkedList<>();
        queue.add("Hugo");
        queue.add("Leo");

        System.out.println("Queue: " + queue);
        System.out.println("Queue: " + queue.poll());
        System.out.println("Queue: " + queue.poll());
        System.out.println("Queue: " + queue.poll());
        System.out.println("Queue: " + queue);

        LinkedList<String> linked = new LinkedList<>();

        // STREAM API
        // realizar operações funcionaisnas nossas collections (estruturas de dados)
        // filter, map, reduce, agregações
        // filter - filtra os elementos de uma coleção
        // map - transforma os elementos de uma coleção
        // reduce - reduz os elementos de uma coleção a um único elemento
        // agregações - soma, média, contagem, etc.

        Set<String> hugos = list
                .stream()
                .filter(nome -> nome.startsWith("Hugo"))
                .map(String::toUpperCase)
                .map(nome -> nome.replaceAll(" ", ""))
                .collect(Collectors.toSet());
        System.out.println("Hugos: " + hugos);
    }
}
