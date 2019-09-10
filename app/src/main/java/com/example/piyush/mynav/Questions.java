package com.example.piyush.mynav;

/**
 * Created by PIYUSH on 11/10/2017.
 */

public class Questions {

    public String nQuestions[]= {

            "The recurrence relation capturing the optimal time of the Tower of Hanoi problem with n discs is.",
            "Which of the following is not O(n^2)?",
            "Which of the following standard algorithms is not a Greedy algorithm?",
            "What is the time complexity of Huffman Coding?",
            "Which of the following is not a stable sorting algorithm in its typical implementation.",
            "Which of the following sorting algorithms should be preferred so that the number of swap operations are minimized in general?",
            "What is the best time complexity of bubble sort?",
            "You have to sort 1 GB of data with only 100 MB of available main memory. Which sorting technique will be most appropriate?",
            "The tightest lower bound on the number of comparisons, in the worst case, for comparison-based sorting is of the order of",
            "Which of the following sorting algorithms has the lowest worst-case complexity?",
            "Which sorting algorithms is most efficient to sort string consisting of ASCII characters?",
            "In a complete k-ary tree, every internal node has exactly k children. The number of leaves in such a tree with n internal nodes is:",
            "Given 8 identical coins out of which one coin is heavy and a pan balance. How many minimum number of measurements are needed to find the heavy coin?",
            "To implement Dijkstra’s shortest path algorithm on unweighted graphs so that it runs in linear time, the data structure to be used is:",
            "Which of the following algorithm can be used to efficiently calculate single source shortest paths in a Directed Acyclic Graph?",


    };


    private String nChoices[][] = {

            {"T(n) = 2T(n – 1) + 1","T(n) = 2T(n/2) + 1","T(n) = 2T(n – 1) + n","T(n) = 2T(n – 2) + 2"},
            {"n^3 / (sqrt(n))","n^1.98","(2^20) * n","(15^10) * n + 12099"},
            {"Bellmen Ford","Prim's","Kruskal","Dijistra"},
            {"O(NlogN)","O(1)","O(N^2)","O(N)"},
            {"Quick Sort","Insertion Sort","Merge Sort","Bubble Sort"},
            {"Selection Sort","Insertion Sort","Merge Sort","Heap Sort"},
            {"N","Constant","N^2","NlogN"},
            {"Merge Sort","Insertion Sort","Heap Sort","Selection Sort"},
            {"NlogN","N","N^2","1"},
            {"Merge","Quick","Insertion","Heap"},
            {"Counting sort","Merge Sort","Quick Sort","Heap Sort"},
            {"n( k – 1) + 1","(n – 1)k+ 1","nk","n(k-1)"},
            {"3","2","4","7"},
            {"Stack","B-tree","Heap","Queue"},
            {"Dijkstra","Bellman-Ford","Topological Sort","Kruskal"}
    };


    private String nCorrectAnswer[] = {"T(n) = 2T(n – 1) + 1","n^3 / (sqrt(n))","Bellmen Ford","O(NlogN)","Quick Sort","Selection Sort","N","Merge Sort","NlogN","Merge","Counting sort","n( k – 1) + 1","2","Queue","Topological Sort"};


    public String getQuestion(int a){

        String question=nQuestions[a];
        return question;
    }


    public String getChoice1(int a){

        String choice=nChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){

        String choice=nChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){

        String choice=nChoices[a][2];
        return choice;
    }

    public String getChoice4(int a){

        String choice=nChoices[a][3];
        return choice;
    }


    public String getCorrectAnswer(int a){

        String answer=nCorrectAnswer[a];
        return answer;
    }



}
