package com.company.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Battle {



    public List<Player> fightRandom (ArrayList<Player> teamA, ArrayList<Player> teamB) throws InterruptedException {

        System.out.println((char)27 + "[34m" + "YOUR TEAM IS:");
        for(Player p : teamA){
            System.out.println(p);
        }
        TimeUnit.MILLISECONDS.sleep(3000);
        System.out.println("<-----------------------------VS-------------------------->");
        System.out.println((char)27 + "[31m" + "THE ENEMY'S TEAM IS:");
        for(Player p : teamB){
            System.out.println(p);
        }
        System.out.println((char)27 + "[0m" + "Press Intro to continue:");
        Scanner scannerPause = new Scanner((System.in));
        scannerPause.nextLine();


        System.out.println("\n");

        List<Player> graveyard = new ArrayList<>();
        String winner = "";

        System.out.println("THE BATTLE STARTS!\n" +
                "GOOD LUCK!\n");

        while (teamA.size() > 0 && teamB.size() > 0){

            Player player1 = teamA.get(0);
            Player player2 = teamB.get(0);

            while (player1.isAlive() && player2.isAlive()) {
                player1.attack(player2);
                player2.attack(player1);
            }

            if (!player1.isAlive()) {  //MOLARIA QUE HUBIERA GRAVEYARD A Y GRAVEYARD B PARA IMPRIMIRLOS SEPARADOS
                // NO SE APELOTONARIAN TANTO; PODRIAN SER DE DIFERENTE COLOR, Y CREO QUE ES FACIL. PERO NECESITO AYUDA
                graveyard.add(player1);
                teamA.remove(player1);
                TimeUnit.MILLISECONDS.sleep(2000);
                System.out.println("      ,-=-.       ______     _\n" +
                        "     /  +  \\     />----->  _|1|_\n" +
                        "     | ~~~ |    // -/- /  |_ H _|\n" +
                        "     |R.I.P|   //  /  /     |S|\n" +
                        (char)27 + "[32m" + "\\vV,,|_____|V,//_____/VvV,v,|_|/,,vv/," + (char)27 + "[0m");
                for(Player p : graveyard){
                    // Comentado el codigo de colores porque tal como esta hecho se acumula
                    System.out.println(/*(char)27 + "[34m" + */p.getName()/* + (char)27  + "[0m"*/ + "- DEAD");
                }
                System.out.println("Press Intro to continue:");
                Scanner scannerPause1 = new Scanner((System.in));
                scannerPause.nextLine();
            };
            if (!player2.isAlive()) {
                graveyard.add(player2);
                teamB.remove(player2);
                TimeUnit.MILLISECONDS.sleep(2000);
                System.out.println("      ,-=-.       ______     _\n" +
                        "     /  +  \\     />----->  _|1|_\n" +
                        "     | ~~~ |    // -/- /  |_ H _|\n" +
                        "     |R.I.P|   //  /  /     |S|\n" +
                        (char)27 + "[32m" + "\\vV,,|_____|V,//_____/VvV,v,|_|/,,vv/," + (char)27 + "[0m");
                for(Player p : graveyard){
                    // Comentado el codigo de colores porque tal como esta hecho se acumula
                    System.out.println(/*(char)27 + "[31m" +*/ p.getName()/* + (char)27 + "[0m"*/ + "- DEAD");
                }
                System.out.println("Press Intro to continue:");
                Scanner scannerPause2 = new Scanner((System.in));
                scannerPause.nextLine();
            }
        }

        if(teamA.size() == 0){
            winner = (char)27 + "[31m" + "        YOUR TEAM LOSE.\n" +
                    (char)27 + "[0m" + "I knew that you couldn't handle it.\n" +
                    "You have to practice more in the field.\n";
        } else{
            winner = (char)27 + "[34m" + "               YOU WIN!!\n" +
                    (char)27 + "[0m" + "I BELIEVED IN YOUR SKILLS FROM THE BEGGINING!\n" +
                    "YOU DESERVE THE BEST OF THE PARTIES!\n";
        }
        System.out.println("\n" + winner);
        return graveyard;

    }
}