/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Lisseth
 */

public class jPanel2{
    
        private Image fondo=null;
        
       public void setImage(String image){
        if (image!=null) {
            fondo=new ImageIcon(getClass().getResource(image)).getImage();
        }
    } 
}