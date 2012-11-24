package com.jfugue.sample;

import org.jFugue.*;

/**
 * Test Program
 *
 */
public class App {
    public static void main( String[] args ) {
    
	Player player = new Player();
	Pattern pattern = new Patern("C D E F G A B");
	player.play(pattern);
	System.exit(0); // If using Java 1.4 or lower
    }
}
