package json.pojo;

abstract class Persona {
    String firstName;
    String lastName;
    boolean controllore;
    boolean passeggero;
    int age;
    
    // Contatori statici condivisi
    private static int contatorePersone = 0;      // Conta i passeggeri
    private static int contatoreControllori = 0;  // Conta i controllori

    // Unico costruttore di Persona: riceve tutti i dati necessari
    public Persona(boolean passeggero, boolean controllore, String firstName, String lastName, int age) {
        this.passeggero = passeggero;
        this.controllore = controllore;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

        // La tua logica di conteggio corretta
        if (this.passeggero) {
            contatorePersone++;
        } else if (this.controllore) {
            contatoreControllori++;
        }
    }

    public static int getContatorePersone() {
        return contatorePersone;
    }

    public static int getContatoreControllori() {
        return contatoreControllori;
    }

    @Override
    public String toString() {
        return "Persona [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
    }
}