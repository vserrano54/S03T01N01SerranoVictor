package Ejercicio1;

import java.util.ArrayList;
import java.util.List;


class Undo {
    private static Undo instance;
    private List<String> ordenes;

    private Undo() {
    	ordenes = new ArrayList<>();
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void agregarOrden(String orden) {
    	ordenes.add(orden);
    }

    public void eliminarUltimaOrden() {
        if (!ordenes.isEmpty()) {
        	ordenes.remove(ordenes.size() - 1);
        }
    }

    public void listarOrdenes() {
        System.out.println("Utimas Ordenes:");
        for (String orden : ordenes) {
            System.out.println(orden);
        }
    }
}
