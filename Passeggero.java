package json.pojo;

public class Passeggero extends Persona {

    public Passeggero(boolean passeggero, String firstName, String lastName, int age) {
        // Passa: passeggero=il tuo boolean, controllore=false, e i dati anagrafici
        super(passeggero, false, firstName, lastName, age);
    }
}
