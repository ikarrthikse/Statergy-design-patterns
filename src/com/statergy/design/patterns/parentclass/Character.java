package com.statergy.design.patterns.parentclass;

import com.statergy.design.patterns.behaviour.WeaponBehaviour;

public abstract class Character {

  WeaponBehaviour weaponBehaviour;
  public abstract void fight();

  public WeaponBehaviour getWeaponBehaviour() {
    return weaponBehaviour;
  }
}
