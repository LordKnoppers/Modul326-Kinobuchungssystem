/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul326.kinobuchungssystem;

/**
 *
 * @author Timothe
 */
public class Reservierung {

    public String telefonNummer;

    public Reservierung(String telefonNummer, Platz p) {
        this.telefonNummer = telefonNummer;
        p.setPlatzToReserviert();
    }

}
