import java.util.LinkedList;

public class Fila {
    private LinkedList<String> elementos;

public Fila() {
this.elementos = new LinkedList<>();
}

public void enfileirar(String elemento) {
this.elementos.add(elemento);
}

public void inverter() {
LinkedList<String> pilha = new LinkedList<>();

while (!this.elementos.isEmpty()) {
pilha.push(this.elementos.poll());
}

this.elementos = pilha;
}

@Override
public String toString() {
return this.elementos.toString();
}
}


