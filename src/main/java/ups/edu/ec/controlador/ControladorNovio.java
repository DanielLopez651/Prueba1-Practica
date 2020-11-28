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
import ups.edu.ec.modelo.Novio;
import ups.edu.ec.modelo.Usuario;

/**
 *
 * @author user
 */
public class ControladorNovio extends Controlador<Usuario> {
    private Novio novio;
    public ControladorNovio() {
     // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #1                  // Method ups/edu/ec/controlador/Controlador."<init>":()V
         * 4: aload_0
         * 5: aload_0
         * 6: invokevirtual #2                  // Method recibirT:()Ljava/util/ArrayList;
         * 9: invokevirtual #3                  // Method setLista:(Ljava/util/List;)V
         * 12: goto          20
         * 15: astore_1
         * 16: aload_1
         * 17: invokevirtual #5                  // Method java/io/IOException.printStackTrace:()V
         * 20: aload_0
         * 21: invokevirtual #6                  // Method getLista:()Ljava/util/List;
         * 24: ifnonnull     38
         * 27: aload_0
         * 28: new           #7                  // class java/util/ArrayList
         * 31: dup
         * 32: invokespecial #8                  // Method java/util/ArrayList."<init>":()V
         * 35: invokevirtual #3                  // Method setLista:(Ljava/util/List;)V
         * 38: return
         * Exception table:
         * from    to  target type
         * 4    12    15   Class java/io/IOException
         *  */
        // </editor-fold>
       
    }
    public void guardar() throws IOException {
         File f = new File("data/novio.obj");
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
        File f = new File("data/novio.obj");
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
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_0
         * 1: istore_2
         * 2: iload_2
         * 3: aload_0
         * 4: invokevirtual #6                  // Method getLista:()Ljava/util/List;
         * 7: invokeinterface #30,  1           // InterfaceMethod java/util/List.size:()I
         * 12: if_icmpge     59
         * 15: aload_0
         * 16: invokevirtual #6                  // Method getLista:()Ljava/util/List;
         * 19: iload_2
         * 20: invokeinterface #31,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
         * 25: checkcast     #32                 // class ups/edu/ec/modelo/Novio
         * 28: invokevirtual #33                 // Method ups/edu/ec/modelo/Novio.getCodigoHom:()I
         * 31: iload_1
         * 32: if_icmpne     53
         * 35: aload_0
         * 36: invokevirtual #6                  // Method getLista:()Ljava/util/List;
         * 39: iload_2
         * 40: invokeinterface #31,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
         * 45: checkcast     #32                 // class ups/edu/ec/modelo/Novio
         * 48: ldc           #34                 // String casado
         * 50: invokevirtual #35                 // Method ups/edu/ec/modelo/Novio.setEstado:(Ljava/lang/String;)V
         * 53: iinc          2, 1
         * 56: goto          2
         * 59: aload_0
         * 60: invokevirtual #36                 // Method guardar:()V
         * 63: goto          83
         * 66: astore_2
         * 67: ldc           #37                 // class ups/edu/ec/controlador/ControladorNovia
         * 69: invokevirtual #38                 // Method java/lang/Class.getName:()Ljava/lang/String;
         * 72: invokestatic  #39                 // Method java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
         * 75: getstatic     #40                 // Field java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
         * 78: aconst_null
         * 79: aload_2
         * 80: invokevirtual #41                 // Method java/util/logging/Logger.log:(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
         * 83: return
         * Exception table:
         * from    to  target type
         * 59    63    66   Class java/io/IOException
         *  */
        // </editor-fold>
    }
    public int devolve() {
        return 0;

    
    }

    public Novio buscarNovio(String cedula) {
        return null;
  

    }

}
