package com.company.Classes;


import javax.sound.sampled.*;
//import javax.swing.*;
import java.io.*;


public class Sonido {
    private Clip audioClip;
    private AudioInputStream audioStream;

    public Sonido(String path){
            //create an audioinputstream from a given sound file
            File audioFile = new File(path);
            try{
                audioStream = AudioSystem.getAudioInputStream(audioFile);
            }
            catch(UnsupportedAudioFileException | IOException e){
                e.printStackTrace();
            }
            //acquire audio format and create a DataLine.Info object
            AudioFormat format = audioStream.getFormat();
            info = new DataInput.Info(Clip.class, format);

            //obtain Clip
            try{
                audioClip = AudioSystem.getClip();
                audioClip.open(audioStream);
            }catch(LineUnavailableException | IOException e){
                e.printStackTrace();
            }
            public void loop(){
              new Thread( () -> {
                  audioClip.setFramePosition(0);
                  audioClip.loop(Clip.LOOP_CONTINUOUSLY);
                    }).start();
             }

    }
}
//        FileInputStream direccion;
//
//        JFileChooser fileChooser = new JFileChooser();
//        if(fileChooser.showOpenDialog(fileChooser) == JFileChooser.APPROVE_OPTION){
//            File file = fileChooser.getSelectedFile();
//
//            direccion = new FileInputStream(file.getAbsolutePath());
//