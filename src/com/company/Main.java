package com.company;

import com.company.Classes.Menu;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;
import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception, FileNotFoundException, InterruptedException {

        // Obtains the default Sequencer connected to a default device.
        Sequencer sequencer = MidiSystem.getSequencer();

        // Opens the device, indicating that it should now acquire any
        // system resources it requires and become operational.
        sequencer.open();

        // create a stream from a file
        InputStream is = new BufferedInputStream(new FileInputStream(new File("src/IoGcstle.mid")));

        // Sets the current sequence on which the sequencer operates.
        // The stream must point to MIDI file data.
        sequencer.setSequence(is);

        // Starts playback of the MIDI data in the currently loaded sequence.
        sequencer.start();

        Menu.inicio();

    }

}