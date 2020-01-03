package com.statergy.design.patterns;

import com.statergy.design.patterns.subclasses.King;
import com.statergy.design.patterns.subclasses.Queen;


public class main {

  public static void main(String args[]) {

    Queen queen = new Queen();

    queen.getWeaponBehaviour();
    queen.fight();


    King king = new King();

    king.getWeaponBehaviour();
    king.fight();

  }

}
