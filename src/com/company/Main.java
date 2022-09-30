package com.company;

import com.company.Classes.Menu;
import com.company.Classes.PlayMidiAudio;

import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) throws Exception, FileNotFoundException, InterruptedException {

        PlayMidiAudio.playAudio();

        Menu.inicio();

    }

}