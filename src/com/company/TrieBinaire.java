package com.company;

public class TrieBinaire {
    /**
     *Recherche de l'index du Tableau pour un nombre donné
     * @param Tableau
     */
    public static float LocateIndexNumber(int Tableau[],int nb){
        int index=0;
        int Min=0;
        int Max=Tableau.length;
        boolean find=false;
        boolean out=false;

        while (find!=true&& out!= true) {
            index=  (Max-Min)/2;
            if (nb==Tableau[index]){
                find=true;

            }else if(nb<Tableau[index]){
                Max = index -1;
                if (Min>Max){
                    out =true;
                    index=-1;
                }
            }else if(nb>Tableau[index]){
                Min = index +1;
                if (Max<Min){
                    out = true;
                    index=-1;

                }


                }
            }



        if (find == false){
            index =-1;
        }
        return index;
    }

    public static void main(String[] args) {
     int[] tableau={1,2,3,4,5,6,7,8,9};
     int numRechercher= 22;
     int index= (int) LocateIndexNumber(tableau,numRechercher);
     System.out.println(index);

    }
}
