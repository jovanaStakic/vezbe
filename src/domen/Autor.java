/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Administrator
 */
public class Autor {

    private String ime;
    private String prezime;
    private Date datumRodjenja;
    private int brojNapisanihKnjiga;

    public Autor(String ime, String prezime, Date datumRodjenja, int brojNapisanihKnjiga) {
        this.ime = ime;
        this.prezime = prezime;
        this.datumRodjenja = datumRodjenja;
        this.brojNapisanihKnjiga = brojNapisanihKnjiga;
    }

    public int getBrojNapisanihKnjiga() {
        return brojNapisanihKnjiga;
    }

    public void setBrojNapisanihKnjiga(int brojNapisanihKnjiga) {
        this.brojNapisanihKnjiga = brojNapisanihKnjiga;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Date getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(Date datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.ime);
        hash = 97 * hash + Objects.hashCode(this.prezime);
        hash = 97 * hash + Objects.hashCode(this.datumRodjenja);
        hash = 97 * hash + this.brojNapisanihKnjiga;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Autor other = (Autor) obj;
        if (this.brojNapisanihKnjiga != other.brojNapisanihKnjiga) {
            return false;
        }
        if (!Objects.equals(this.ime, other.ime)) {
            return false;
        }
        if (!Objects.equals(this.prezime, other.prezime)) {
            return false;
        }
        return Objects.equals(this.datumRodjenja, other.datumRodjenja);
    }

    @Override
    public String toString() {
        return "Autor{" + "ime=" + ime + ", prezime=" + prezime + ", datumRodjenja=" + datumRodjenja + ", brojNapisanihKnjiga=" + brojNapisanihKnjiga + '}';
    }
    
}
