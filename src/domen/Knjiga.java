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
public class Knjiga {
    private String nazivKnjige;
    private String ISBN;
    private Date datumIzdavanja;
    private double cena;
    private Autor autor;
    private Status status;

    public Knjiga(String nazivKnjige, String ISBN, Date datumIzdavanja, double cena, Autor autor, Status status) {
        this.nazivKnjige = nazivKnjige;
        this.ISBN = ISBN;
        this.datumIzdavanja = datumIzdavanja;
        this.cena = cena;
        this.autor = autor;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    
    public String getNazivKnjige() {
        return nazivKnjige;
    }

    public void setNazivKnjige(String nazivKnjige) {
        this.nazivKnjige = nazivKnjige;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Date getDatumIzdavanja() {
        return datumIzdavanja;
    }

    public void setDatumIzdavanja(Date datumIzdavanja) {
        this.datumIzdavanja = datumIzdavanja;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nazivKnjige);
        hash = 89 * hash + Objects.hashCode(this.ISBN);
        hash = 89 * hash + Objects.hashCode(this.datumIzdavanja);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.cena) ^ (Double.doubleToLongBits(this.cena) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.autor);
        hash = 89 * hash + Objects.hashCode(this.status);
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
        final Knjiga other = (Knjiga) obj;
        if (Double.doubleToLongBits(this.cena) != Double.doubleToLongBits(other.cena)) {
            return false;
        }
        if (!Objects.equals(this.nazivKnjige, other.nazivKnjige)) {
            return false;
        }
        if (!Objects.equals(this.ISBN, other.ISBN)) {
            return false;
        }
        if (!Objects.equals(this.datumIzdavanja, other.datumIzdavanja)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return this.status == other.status;
    }

    @Override
    public String toString() {
        return "Knjiga{" + "nazivKnjige=" + nazivKnjige + ", ISBN=" + ISBN + ", datumIzdavanja=" + datumIzdavanja + ", cena=" + cena + ", autor=" + autor + ", status=" + status + '}';
    }
    
    
    
}
