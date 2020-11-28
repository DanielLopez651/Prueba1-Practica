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
import java.util.logging.Level;
import java.util.logging.Logger;
import ups.edu.ec.modelo.Novia;
import ups.edu.ec.modelo.Novio;
import ups.edu.ec.modelo.Usuario;

/**
 *
 * @author user
 */
public class ControladorNovio extends Controlador<Novio> {
    private Novio novio;
    public ControladorNovio() {
        
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
        File f = new File("data/novio.txt");
        if (!f.exists()) {
            f.createNewFile();
        }
        try {
            FileOutputStream file = new FileOutputStream(f);
            ObjectOutputStream esc = new ObjectOutputStream(file);
            esc.writeObject(novio);
            esc.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
    }
     public ArrayList<Novio> recibirT() throws IOException {
        File f = new File("data/novio.txt");
        ArrayList<Novio> tick = null;
        if (!f.exists()) {
            f.createNewFile();
        }
        FileInputStream file = null;
        ObjectInputStream l = null;
        try {
            file = new FileInputStream(f);
            l = new ObjectInputStream(file);
            tick = (ArrayList<Novio>) l.readObject();
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


    public void matricidio(int codigo) {
        for (int i = 0; i < this.getLista().size(); i++) {
            if(this.getLista().get(i).getCodigoHombre()==codigo){
                this.getLista().get(i).setEstado("casado");
            }
        }
        try {
            guardar();
        } catch (IOException ex) {
            Logger.getLogger(ControladorNovio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int devolve() {
        return this.getLista().get(this.getLista().size()-1).getCodigoHombre()+1;
        

    
    }

    public Novio buscarNovio(String cedula) {
        int i;
         for ( i = 0; i < this.getLista().size(); i++) {
           if(this.getLista().get(i).getCedula().equals(cedula)){
               break;
           }
         }
        return this.getLista().get(i);
      
  

    }

}
