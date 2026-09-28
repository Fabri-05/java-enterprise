package json.pojo;

public class Controllore extends Persona {
    
    // Il costruttore di Controllore deve stare nella SUA classe
    public Controllore(boolean controllore, String firstName, String lastName, int age) {
        // Passa: passeggero=false, controllore=il tuo boolean, e i dati anagrafici
        super(false, controllore, firstName, lastName, age);
    }
}
