package main.Ejercicio_03_listLeves;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import main.Materia.Models.Node;

public class ListLevels {

    public List<List<Node>> listLevels(Node root) {

        List<List<Node>> levels = new ArrayList<>();
        if (root == null) return levels;

        Queue<Node> q = new ArrayDeque<>();

        q.add(root);

        while (!q.isEmpty()) {
            
            int size = q.size();

            List<Node> level = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {

                Node n = q.remove();

                level.add(n);

                if (n.getLeft() != null){ 
                    
                    q.add(n.getLeft());

                }

                if (n.getRight() != null){
                    
                    q.add(n.getRight());

                }
            }


            levels.add(level);
        }

        return levels;
    }
}
