/**
 * Mit dem Kinobuchungssystem sollen Tickets gebucht/reserviert werden
 * 
 * @version 0.0.1
 */
package modul326.kinobuchungssystem;

/**
 *
 * @author Basil
 */
public class Main {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
         Kinosaal saal1 = new Kinosaal(1);
         Kinosaal saal2 = new Kinosaal(2);
         
         Reihe reihe1 = new Reihe(1);
         Reihe reihe2 = new Reihe(2);
         Reihe reihe3 = new Reihe(3);
         Reihe reihe4 = new Reihe(4);
         
         Platz platz1 = new Platz(1);
         Platz platz2 = new Platz(2);
         Platz platz3 = new Platz(3);
         Platz platz4 = new Platz(4);
         Platz platz5 = new Platz(5);
         Platz platz6 = new Platz(6);
         Platz platz7 = new Platz(7);
         Platz platz8 = new Platz(8);
         
         Kinobuchungssystem system = new Kinobuchungssystem();
         
         system.filmMachen("derp","derp","derp", saal2);
         system.filmMachen("derp","derp","derp", saal1);
         
         system.machReservierung(1, "078 790 23 77");
         system.machReservierung(2, "078 790 23 74");
  
        
    }
    
}  
