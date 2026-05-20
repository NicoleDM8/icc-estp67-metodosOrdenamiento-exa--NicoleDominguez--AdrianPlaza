package controllers;

import models.Brand;

public class BrandController {
  public Brand[] sortSelectionDesc(Brand[] brands) {
    if (brands == null) {
        return null;
    }
    int n = brands.length;
    for (int i = 0; i < n - 1; i++) {
        int maxIdx = i;
        for (int j = i + 1; j < n; j++) {
            if (brands[j].getTotalValidYears() > brands[maxIdx].getTotalValidYears()) {
                maxIdx = j;
            }
        }
        Brand temp = brands[maxIdx];
        brands[maxIdx] = brands[i];
        brands[i] = temp;
    }
    return brands; 
  }

  public Brand binarySearchByValidYears(Brand[] brands, int validYears, boolean isAscending) {
    if (brands == null) {
        return null;
    }
    int inicio = 0;
    int fin = brands.length - 1;
    
    while (inicio <= fin) {
        int medio = inicio + (fin - inicio) / 2;
        int valorMedio = brands[medio].getTotalValidYears();
        
        if (valorMedio == validYears) {
            if (!isAscending) {
                while (medio > 0 && brands[medio - 1].getTotalValidYears() == validYears) {
                    medio--;
                }
            } else {
                while (medio < brands.length - 1 && brands[medio + 1].getTotalValidYears() == validYears) {
                    medio++;
                }
            }
            return brands[medio];
        }
        
        if (isAscending) {
            if (validYears < valorMedio) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        } else {
            if (validYears < valorMedio) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
    }
    return null;
  }
}