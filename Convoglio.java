package json.pojo;

import java.util.ArrayList;
import java.util.List;

public class Convoglio {
	
    public Treno train;
    //
    public List<Persona> passeggeri = new ArrayList<Persona>();
    public Conducente conducenteconvoglio;
    public List<Controllore> controlloriconvoglio=new ArrayList<Controllore>();
    //
    public Convoglio(Treno train, Conducente conducenteconvoglio) {
        this.train = train;
        this.conducenteconvoglio = conducenteconvoglio; 
    }

    @Override
    public String toString() {
       return "Convoglio [treno=" + train + ", conducente=" + conducenteconvoglio + ", passeggeri=" + passeggeri + "]";
    }

    public void aggiungiControllore(Controllore controllore) {
        // Questa riga deve inserire il controllore nella lista
        this.controlloriconvoglio.add(controllore); 
    }
}