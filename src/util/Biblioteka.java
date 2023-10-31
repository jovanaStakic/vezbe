/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import domen.Autor;
import domen.Knjiga;
import domen.Status;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Biblioteka {
    public static List<Knjiga> vratiKnjige(){
        try {
            SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
            List<Knjiga> knjige=new ArrayList<>();
            Collections.addAll(knjige,
                    new Knjiga("Hari Potter", "213142445", format.parse("12/02/2002") , 0, new Autor("J.K", "Rowling", format.parse("11/11/1967"), 6), Status.U_PRODAJI),
                    new Knjiga("Gospodjica", "411451551", format.parse("11/03/2012") ,454.55, new Autor("J.K", "Rowling", format.parse("11/11/1967"), 6), Status.U_PRODAJI));
            return knjige;
        } catch (ParseException ex) {
            return null;
        }
    }
}
