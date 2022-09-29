package com.company.Classes;


import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class Sonido {
    public static void main(String[] args) throws FileNotFoundException {


        FileInputStream direccion;

        JFileChooser fileChooser = new JFileChooser();
        if(fileChooser.showOpenDialog(fileChooser) == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();

            direccion = new FileInputStream(file.getAbsolutePath());



        }


    }
}
