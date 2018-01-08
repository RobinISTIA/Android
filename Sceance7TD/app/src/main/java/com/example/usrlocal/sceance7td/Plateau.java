package com.example.usrlocal.sceance7td;

/**
 * Created by usrlocal on 08/01/2018.
 */
public class Plateau {
  private int x, y;
  private int nbBombes;

  public Plateau(int _x, int _y, int _nbBombes) {
    this.x = _x;
    this.y = _y;
    this.nbBombes = _nbBombes;
  }

  public Plateau() {}

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getNbBombes() {
    return nbBombes;
  }

  public void setNbBombes(int nbBombes) {
    this.nbBombes = nbBombes;
  }
}
