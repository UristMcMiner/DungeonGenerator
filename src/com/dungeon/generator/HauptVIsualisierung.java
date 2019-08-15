package com.dungeon.generator;

import java.io.IOException;

public class HauptVIsualisierung {
    public static void main(String[] args) throws IOException {
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
        Raum test_j = new Raum (3,3);
        test_e.connect(test_c,3);
        test_e.connect(test_f,0);
        test_f.connect(test_d,3);
        test_f.connect(test_g,0);
        test_g.connect(test_h,3);
        test_h.connect(test_d,2);
        test_h.connect(test_i,3);
        test_i.connect(test_b,2);
        test_j.connect(test_h,3);

        Raum startraum = test_d;


    }


}
