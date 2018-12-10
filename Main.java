package com.company;

import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        shortWay();
    }

    private static void shortWay() {
        Graph graph = new Graph(10);
        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Рязань");
        graph.addVertex("Калуга");
        graph.addVertex("Липецк");
        graph.addVertex("Тамбов");
        graph.addVertex("Орёл");
        graph.addVertex("Воронеж");
        graph.addVertex("Саратов");
        graph.addVertex("Курск");

        graph.addEdge("Москва", "Тула");
        graph.addEdge("Москва", "Рязань");
        graph.addEdge("Москва", "Калуга");
        graph.addEdge("Тула", "Липецк");
        graph.addEdge("Рязань", "Тамбов");
        graph.addEdge("Калуга", "Орёл");
        graph.addEdge("Липецк", "Воронеж");
        graph.addEdge("Тамбов", "Саратов");
        graph.addEdge("Орёл", "Курск");
        graph.addEdge("Саратов", "Воронеж");
        graph.addEdge("Курск", "Воронеж");

        // graph.display();

        Queue<String> way = graph.findShortestWayBfs("Москва", "Воронеж");
        System.out.println("\n Кратчайший путь:");
        System.out.println(way);

    }
}

