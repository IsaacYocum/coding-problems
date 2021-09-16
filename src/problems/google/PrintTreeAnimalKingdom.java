package problems.google;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
source: https://www.youtube.com/watch?v=V0xjK_6ZoEY&t=629s

Expected output:
1: lifeform
2:   animal
3:     mammal
4:       cat
5:         lion
6:     bird
7:     fish
 */

public class PrintTreeAnimalKingdom {
    public static void main(String[] args) {
        List<Relation> input = new ArrayList<>();

        input.add(new Relation("animal", "mammal"));
        input.add(new Relation("animal", "bird"));
        input.add(new Relation("lifeform", "animal"));
        input.add(new Relation("cat", "lion"));
        input.add(new Relation("mammal", "cat"));
        input.add(new Relation("animal", "fish"));

        printTree(input);
    }

    public static void printTree(List<Relation> relations) {
        List<String> parents = new ArrayList<>();

        for (Relation relation : relations) {
            if (!parents.contains(relation.parent)) {
                parents.add(relation.parent);
            }
        }

        System.out.println("Parents = " + parents);

        // Map children to parents
        Map<String, List<String>> relationMap = new HashMap<>();

        for (String parent : parents) {
            List<String> children = new ArrayList<>();

            for (Relation relation : relations) {
                if (relation.parent.equals(parent)) {
                    children.add(relation.child);
                }
            }

            relationMap.put(parent, children);
        }

        System.out.println("Relationships = " + relationMap);

        // Find root node
        String root = "";
        for (String parent : relationMap.keySet()) {
            if (!relationMap.get(parent).contains(parent)) {
                root = parent;
            }
        }

        System.out.println("Root = " + root);

        // Send relationship map to dfs with the Map, Depth, and Root node
        dfs(relationMap, 0, root);
    }

    public static void dfs(Map<String, List<String>> relations, int depth, String root) {
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }

        System.out.println(root);

        List<String> children;
        if (relations.containsKey(root)) {
            children = relations.get(root);
        } else {
            return;
        }

        for (String child : children) {
            dfs(relations, depth + 1, child);
        }


    }
}

class Relation {
    String parent;
    String child;
    public Relation(String parent, String child) {
        this.parent = parent;
        this.child = child;
    }
}
