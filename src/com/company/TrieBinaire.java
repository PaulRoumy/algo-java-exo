package com.company;

public class TrieBinaire {
    /**
     *Recherche de l'index du Tableau pour un nombre donné
     * @param Tableau
     */
    public static float LocateIndexNumber(int Tableau[],int nb){
        int index=0;
        int NumCase=0;
        boolean find=false;
        float diviseur=2;
        while (find!=true) {
            index= (int) ((Tableau.length/diviseur));
            if (nb==Tableau[index]){
                find=true;
            
            }

        }
        if (find == false){
            index =-1;
        }
        return index;
    }

    public static void main(String[] args) {
     int[] tableau={1,2,3,4,5,6,7,8,9};
     int numRechercher= 8;
     int index= (int) LocateIndexNumber(tableau,numRechercher);
     System.out.println(index);

    }
}
