/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import ups.edu.ec.modelo.Novia;
import ups.edu.ec.modelo.Testigo;
import ups.edu.ec.modelo.Usuario;

/**
 *
 * @author user
 */
public class ControladorTestigo extends Controlador<Testigo> {
    private Testigo testigo;
    public ControladorTestigo() {
         try {
            this.setLista(  recibirT());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        if (this.getLista() == null) {
            this.setLista(new ArrayList()) ;
        }
    }
     public void guardar() throws IOException {
        File f = new File("data/testigo.txt");
        if (!f.exists()) {
            f.createNewFile();
        }
        try {
            FileOutputStream file = new FileOutputStream(f);
            ObjectOutputStream esc = new ObjectOutputStream(file);
            esc.writeObject(testigo);
            esc.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Testigo> recibirT() throws IOException {
        File f = new File("data/testigo.txt");
        ArrayList<Testigo> tick = null;
        if (!f.exists()) {
            f.createNewFile();
        }
        FileInputStream file = null;
        ObjectInputStream l = null;
        try {
            file = new FileInputStream(f);
            l = new ObjectInputStream(file);
            tick = (ArrayList<Testigo>) l.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            if (l != null) {
                l.close();
            }
        }
        return tick;
    }
}
