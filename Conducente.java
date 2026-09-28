package json.pojo;

public class Conducente extends Persona {
    
    // Il costruttore chiede solo i dati anagrafici del Conducente
    public Conducente(String firstName, String lastName, int age) {
        // Passiamo 5 parametri a Persona: passeggero=false, controllore=false + i dati
        super(false, false, firstName, lastName, age);
    }
}
