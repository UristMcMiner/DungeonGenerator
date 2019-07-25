package com.dungeon.generator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        int eingabe = 5;
        boolean loop = true;
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));


        Raum test_a = new Raum (5,5);
        Raum test_b= new Raum (7,7);
        test_a.connect(test_b,0);

        Raum test_c = new Raum (9,9);
        Raum test_d = new Raum (8,8);
        test_c.connect(test_a, 3);
        test_c.connect(test_d, 0);
        test_b.connect(test_d,1);

        Raum test_e = new Raum (6,6);
        Raum test_f = new Raum (4,4);
        Raum test_g = new Raum (3,3);
        Raum test_h = new Raum (2,2);
        Raum test_i = new Raum (1,1);
        test_e.connect(test_c,3);
        test_e.connect(test_f,0);
        test_f.connect(test_d,3);
        test_f.connect(test_g,0);
        test_g.connect(test_h,3);
        test_h.connect(test_d,2);
        test_h.connect(test_i,3);
        test_i.connect(test_b,2);

        Raum startraum = test_d;
        Raum aktuellerraum = startraum;

        String befehl = "Welcome to Room Runner. The most anticipated text based game in the world! \nWhile you are in a room you can enter '0/1/2/3' to move around, if there is a room connection, ofc. \n0 = north \n1 = east \n2 = south \n3 = west";
        System.out.println(befehl);
       while(loop) {
           System.out.println("You are in room " + aktuellerraum);
           if (aktuellerraum.verbindungen[0] != null){
               System.out.println("You see a pathway in the north. Beware of cold!");}
           if (aktuellerraum.verbindungen[1] != null){
               System.out.println("You see a pathway in the east. Beware of communism!");}
           if (aktuellerraum.verbindungen[2] != null){
               System.out.println("You see a pathway in the south. Beware of refugees!");}
           if (aktuellerraum.verbindungen[3] != null){
               System.out.println("You see a pathway in the west. Hail Obama!");}

           String line = stdin.readLine();
           try {
               eingabe = Integer.parseInt(line);
           }
           catch (NumberFormatException e) {
               ;
           }

           if (eingabe < 4) {
               if (aktuellerraum.verbindungen[eingabe] == null){
                   befehl = "No connection. \nTry again!";
                   System.out.println(befehl);
               }
               else {
                   aktuellerraum = aktuellerraum.verbindungen[eingabe];
                   eingabe = 5;


               }
           } else {
               if (line == "exit"){
                   break;
               }
               befehl = "Are you retarded?\n0 = north \n1 = east \n2 = south \n3 = west";
               System.out.println(befehl);
           }
       }


        System.out.println ("");
    }
}
//Comment <--- Read This stuff

