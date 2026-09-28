package json.pojo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ComposizioneTreno {
    public static void main(String[] args) {
        
        // Creiamo il treno e il conducente
        Treno treno = new Treno(1, "USA", "jeffrey epstein island");
        Conducente conducente = new Conducente("jeffrey", "Epstein", 66);
        
        // Istanziamo il convoglio passando treno e conducente al costruttore
        Convoglio mioConvoglio = new Convoglio(treno, conducente);
        
        // Creiamo e aggiungiamo i controllori passando true per il boolean 'controllore'
        mioConvoglio.aggiungiControllore(new Controllore(true, "Benjamin", "Netanyahu", 76));
        mioConvoglio.aggiungiControllore(new Controllore(true, "Donald", "Trump", 80));
        
        // Creiamo e aggiungiamo i passeggeri passando true per il boolean 'passeggero'
        mioConvoglio.passeggeri.add(new Passeggero(true, "hannah", "Black", 5));
        mioConvoglio.passeggeri.add(new Passeggero(true, "Mark", "Grayson", 3));
        mioConvoglio.passeggeri.add(new Passeggero(true, "Sofie", "Jackson", 10));

        // 2. GENERAZIONE DEL JSON AUTOMATICO CON GSON
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonGenerato = gson.toJson(mioConvoglio);
        
        System.out.println("--- JSON GENERATO DAGLI OGGETTI ---");
        System.out.println(jsonGenerato);
        System.out.println("-----------------------------------\n");

        // 3. CALCOLI E REPORT RICHIESTI
        String nomeConducente = mioConvoglio.conducenteconvoglio.firstName + " " + mioConvoglio.conducenteconvoglio.lastName;
        int numeroControllori = Persona.getContatoreControllori();
        int numeroPasseggeri = Persona.getContatorePersone();
        
        // Stampa del report sul terminale di Eclipse
        System.out.println("========= REPORT CONVOGLIO =========");
        System.out.println("Chi è il conducente? " + nomeConducente);
        System.out.println("Quanti controllori ci sono? " + numeroControllori);
        
        // --- NUOVA SEZIONE: STAMPA DEI CONTROLLORI ---
        System.out.println("Chi sono i controllori?");
        for (Controllore c : mioConvoglio.controlloriconvoglio) {
            System.out.println("- " + c.firstName + " " + c.lastName + " (Età: " + c.age + ")");
        }
        // ----------------------------------------------
        
        System.out.println("Quante \"persona\" passeggeri ci sono sul treno? " + numeroPasseggeri);
        System.out.println("====================================");
    }
}
