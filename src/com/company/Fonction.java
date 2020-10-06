package com.company;


    public class Fonction {
        /**
         *
         * @param Tableau
         * Affiche les valeurs du Tableau
         */
        static void Affichage(int Tableau[]){
            int i ;

            for (i =0; i< Tableau.length;i++){
                System.out.println(Tableau[i]);
            }
        }
        /**
         * @param Tableau
         * Affiche la plus grande valeur du Tableau
        */
        static void Scoreplus(int Tableau[]){
            int i;

            int Valeurmax=-1111;
            for (i=0;i<Tableau.length;i++){
                if(Valeurmax<=Tableau[i]){
                    Valeurmax=Tableau[i];

                }
            }
             System.out.println(Valeurmax);
        }

        /**
         *
         * @param Tableau
         * Indique si il y a une valeur inferieur à 10 dans le Tableau
         */
        static void Sup10(int Tableau[]){
            int i;
            boolean sup10=false;
            for (i=0;i<Tableau.length;i++){
                if (Tableau[i]<10){
                    sup10=true;

                }
            }
            System.out.println(sup10);
        }

        public static void main(String[] args) {
            int [] score={11,45,53,9,46,30,14};
            Affichage(score);
            System.out.println();
            Scoreplus(score);
            Sup10(score);
        }


}

