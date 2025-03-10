package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator {
    @Override
    public int compare(Cone cone1, Cone cone2) {
        if (cone1.getCost() - cone2.getCost() < 0){
            return -1;
        } else if (cone1.getCost() - cone2.getCost() > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
