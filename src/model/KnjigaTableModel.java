package model;

import domen.Autor;
import domen.Knjiga;
import domen.Status;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *
/**
 *
 * @author Administrator
 */
public class KnjigaTableModel extends AbstractTableModel{
    private List<Knjiga> knjige;
    String[] kolone=new String[]{"Naziv knjige","ISBN","Datum izdavanja","Cena","Autor","Status"};
    
    public KnjigaTableModel(List<Knjiga> knjige){
        this.knjige=knjige;
    }
    
    @Override
    public int getRowCount() {
        return knjige.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Knjiga knjiga=knjige.get(rowIndex);
        switch (columnIndex) {
            case 0: return knjiga.getNazivKnjige();
            case 1: return knjiga.getISBN();
            case 2: return knjiga.getDatumIzdavanja().toString();
            case 3: return knjiga.getCena();
            case 4: return knjiga.getAutor().getIme();
            case 5: return knjiga.getStatus();
            default: return "Nije poznato";
               
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
    
    public void dodajKnjigu(){
        knjige.add(new Knjiga("", "", new Date(), 0, new Autor("", "", new Date(), 0), Status.U_PRODAJI));
        fireTableDataChanged();
    }
    
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
    Knjiga knjiga = knjige.get(rowIndex);
    switch (columnIndex) {
        case 0:
            knjiga.setNazivKnjige((String) aValue);
            break;
        case 1:
            knjiga.setISBN((String) aValue);
            break;
        case 2:
            {
                try {
                    // Potrebno je obraditi datum, ovo je samo primer.
                    knjiga.setDatumIzdavanja(format.parse((String) aValue));
                } catch (ParseException ex) {
                    Logger.getLogger(KnjigaTableModel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;

        case 3:
            knjiga.setCena(Double.parseDouble((String) aValue));
            break;
        case 4:
            knjiga.getAutor().setIme((String) aValue);
            break;
        case 5:
            knjiga.setStatus(Status.valueOf((String)aValue));
            break;
    }
    fireTableCellUpdated(rowIndex, columnIndex); // Obavestava o promeni u ćeliji
}
    
}
