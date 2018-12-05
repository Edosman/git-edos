package com.company;

public class HomeWork_6 {

    void twentyTrees() {
        int count = 0;
        int numberOfTrees = 20;
        int maxLevel = 4;
        int numOfElmts = (int) (Math.pow(2, maxLevel) - 1);

        for (int i = 0; i < numberOfTrees; i++) {
            Tree tree = new TreeImpl(maxLevel);
            for (int j = 1; j <= numOfElmts; j++) {
                tree.add(new Person(searchRandNumOfElmnts(-20, 20), "Element"));
            }
//            tree.displayTree();
//            System.out.println(tree.isBalanced());
            if (tree.isBalanced()) count++;
        }
        System.out.println("Процент сбалансированных деревьев: " + (count * 100) / numberOfTrees + "%");
    }

    private int searchRandNumOfElmnts(int minNumberOfElements, int maxNumberOfElements) {
        maxNumberOfElements -= minNumberOfElements;
        return (int) (Math.random() * ++maxNumberOfElements) + minNumberOfElements;
    }
}
