public class App {
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila();
        fila.enfileirar("A");
        fila.enfileirar("B");
        fila.enfileirar("C");
        
        fila.inverter();
        System.out.println(fila); 
        }
    }

