/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan62livingthing;

/**
 *
 * @author 
 * NAMA      : Andreas Suryadi
 * KELAS     : IF-10K
 * NIM       : 10119918
 * Deskripsi Program : Program ini bertujuan untuk menampilkan data dari 
 * living thing manusia
 * 
 */

public class PBO10K10119918Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human human = new Human();
        human.setNama("Andreas Suryadi");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }
    
}
