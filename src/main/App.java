package main;

import java.util.List;

import main.Ejercicio_01_insert.InsertBST;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;
import utils.StudentValidator;

import main.Materia.Models.Node;
public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        System.out.println("==== EJERCICIO 01: Insertar en BST ====");

        InsertBST insertBST = new InsertBST();
        Node root = null;
        int[] valores = {5, 3, 7, 2, 4, 6, 8};

        for (int v : valores) {
            root = insertBST.insert(root, v);
        }

        System.out.println("Árbol Binario de Búsqueda creado con éxito.");
        System.out.println("Nodos insertados: 5, 3, 7, 2, 4, 6, 8");
        System.out.println();

    }

}
