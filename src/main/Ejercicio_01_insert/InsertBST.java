package main.Ejercicio_01_insert;

import main.Materia.Models.Node;

public class InsertBST {

    /**
     * Aquí inserto un nuevo valor en el árbol binario de búsqueda.
     * Si el árbol está vacío, creo el primer nodo y lo devuelvo.
     * Si el valor es menor, lo pongo a la izquierda; si es mayor, a la derecha.
     * Devuelvo la nueva raíz actualizada del árbol.
     */
    public Node insert(Node root, int value) {
        if (root == null) {
            
            return new Node(value);

        }

        if (value < root.getValue()) {
            root.setLeft(insert(root.getLeft(), value));
        } else if (value > root.getValue()) {

            root.setRight(insert(root.getRight(), value));

        } else {
        }

        return root;
    }
}
