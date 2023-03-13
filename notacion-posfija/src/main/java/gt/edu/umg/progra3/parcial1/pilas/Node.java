package gt.edu.umg.progra3.parcial1.pilas;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Node implements Pila{

    private List<String> arriba = new ArrayList<>();

    @Override
    public void push(String item) {
        arriba.add(item);
    }

    @Override
    public String pop() {
        return arriba.remove(arriba.size()-1);
    }

    @Override
    public String peek() {
        return arriba.remove(arriba.size()-1);
    }

    @Override
    public int size() {
        return arriba.size();
    }

    @Override
    public boolean isEmpty() {
        return arriba.isEmpty();
    }
}
