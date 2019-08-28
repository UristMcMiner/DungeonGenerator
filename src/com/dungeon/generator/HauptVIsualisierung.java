package com.dungeon.generator;

import java.io.IOException;
import java.util.LinkedList;

public class HauptVIsualisierung {
    public static void main(String[] args) throws IOException {
        Raum test_a = new Raum (5,5, "a");
        Raum test_b= new Raum (7,7, "b");
        test_a.connect(test_b,0);

        Raum test_c = new Raum (9,9, "c");
        Raum test_d = new Raum (8,8, "d");
        test_c.connect(test_a, 3);
        test_c.connect(test_d, 0);
        test_b.connect(test_d,1);

        Raum test_e = new Raum (6,6, "e");
        Raum test_f = new Raum (4,4, "f");
        Raum test_g = new Raum (3,3, "g");
        Raum test_h = new Raum (2,2, "h");
        Raum test_i = new Raum (1,1, "i");
        Raum test_j = new Raum (3,3, "j");
        test_e.connect(test_c,3);
        test_e.connect(test_f,0);
        test_f.connect(test_d,3);
        test_f.connect(test_g,0);
        test_g.connect(test_h,3);
        test_h.connect(test_d,2);
        test_h.connect(test_i,3);
        test_i.connect(test_b,2);
        test_j.connect(test_b,1);

        Raum startraum = test_d;

        LinkedList<Raum> raumliste = new LinkedList<Raum> ();

        int minx = 0;
        int maxx = 0;
        int miny = 0;
        int maxy = 0;

        startraum.besucheNachbarn (0,0,raumliste);
        for (Raum r : raumliste) {
            if (r.x <= minx) {
                minx = r.x;
            }
            if (r.x >= maxx) {
                maxx = r.x;
            }
            if (r.y <= miny) {
                miny = r.y;
            }
            if (r.y >= maxy) {
                maxy = r.y;
            }
        }
        int dimx = maxx - minx +1;
        int dimy = maxy - miny +1;

        Raum[][] grid = new Raum[dimx][dimy];
        int xoffset = 0;
        int yoffset = 0;
        if (minx < 0){
            xoffset = Math.abs(minx);
        }
        if (miny < 0){
            yoffset = Math.abs(miny);
        }
        for (Raum r : raumliste) {
            grid[r.x+xoffset][r.y+yoffset]=r;
        }
        for (int i = 0; i < dimy; i++) {
            for (int j = 0; j < dimx; j++){
                if (grid[j][i] != null){
                    System.out.print (grid[j][i].name + " ");

                }
                else {
                    System.out.print ("N ");

                }
                if (j == (dimx -1)) {
                    System.out.println(" ");
                }
            }
        }
    }


}
