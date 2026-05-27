package controllers;

import models.Tournament;

public class TournamentController {

  public Tournament binarySearchByTotalStarterPointsFilaB(Tournament[] tournaments, int totalStarterPoints) {
    int menor = 0;
    int mayor = tournaments.length - 1;

    while (menor <= mayor) {
      int medio = (mayor + menor) / 2;
      if (tournaments[medio].getTotalStarterPoints() == totalStarterPoints) {
        return tournaments[medio];
      }
      if (tournaments[medio].getTotalStarterPoints() > totalStarterPoints) {
        menor = medio + 1;
      } else {
        mayor = medio - 1;
      }
    }
    return null;
  }

  public void sortSelectionDesc(Tournament[] tournaments) {

    int n = tournaments.length;

    for (int i = 0; i < n - 1; i++) {
      int indiceMaximo = i;
      for (int j = i + 1; j < n - 1; j++) {
        if (tournaments[j].getTotalStarterPoints() > tournaments[indiceMaximo].getTotalStarterPoints()) {
          indiceMaximo = j;

        }
        Tournament aux = tournaments[indiceMaximo];
        tournaments[indiceMaximo] = tournaments[i];
        tournaments[i] = aux;

      }

    }
  }

}
