package lat02;

/**
 *
 * @author Ni Kadek Juni Antari 
 * tgl: 25/03/2004
 */

import javax.swing.JOptionPane;
        
public class msgbox {
    public static void mian(String[] args){
        String nama = "";
        nama = JOptionPane.showInputDialog("Tulis Nama");
        
        System.out.println("Isi Variabel nama:"+nama);
        
    }
    
}
