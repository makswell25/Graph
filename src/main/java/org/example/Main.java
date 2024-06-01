package org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        logger.warn("Queries: ");

        Graph graph = new Graph();
        graph.addVertex('1');
        graph.addVertex('2');
        graph.addVertex('3');
        graph.addVertex('4');
        graph.addVertex('5');
        graph.addVertex('6');

        graph.addEdge(0, 1, 1);
        graph.addEdge(1, 5, 1);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 1);
        graph.addEdge(2, 1, 1);
        graph.addEdge(2, 3, 1);
        graph.addEdge(2, 4, 1);
        graph.addEdge(3, 1, 1);
        graph.addEdge(3, 2, 1);
        graph.addEdge(3, 4, 1);
        graph.addEdge(3, 5, 1);
        graph.addEdge(4, 2, 1);
        graph.addEdge(4, 3, 1);
        graph.addEdge(4, 5, 1);
        graph.addEdge(5, 1, 1);
        graph.addEdge(5, 3, 1);
        graph.addEdge(5, 4, 1);
        System.out.print("Кратчайший путь из вершины 1 до вершины ");
        graph.path();
        graph.clean();

    }
}