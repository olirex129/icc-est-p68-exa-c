package models;

import java.util.Arrays;

public class Tournament {

  private String name;
  private Club[] clubs;

  public Tournament(String name, Club[] clubs) {
    this.name = name;
    this.clubs = clubs;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Club[] getClubs() {
    return clubs;
  }

  public void setClubs(Club[] clubs) {
    this.clubs = clubs;
  }

  @Override
  public String toString() {
    return "Tournament [name=" + name + ", clubs=" + Arrays.toString(clubs) + "]";
  }

  public int getTotalStarterPoints() {

    int totalPuntos = 0;

    for (Club club : clubs) {
      for (Athlete athlete : club.getAthletes()) {
        if (athlete.isStarter()) {
          totalPuntos += athlete.getPoints();
        }
      }

    }

    return totalPuntos;
  }

}
