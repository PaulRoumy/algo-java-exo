package com.company;


    public class Fonction {
        /**
         *Affiche les valeurs du Tableau
         * @param Tableau
         *
         */
        public static void Affichage(int Tableau[]){
            int i ;

            for (i =0; i< Tableau.length;i++){
                System.out.println(Tableau[i]);
            }
        }
        /**
         * Affiche la plus grande valeur du Tableau
         * @param Tableau
         *
        */
        public static int Scoreplus(int Tableau[]){
            int i;

            int Valeurmax=-1111;
            for (i=0;i<Tableau.length;i++){
                if(Valeurmax<=Tableau[i]){
                    Valeurmax=Tableau[i];

                }
            }
             return Valeurmax;
        }

        /**
         *Indique si il y a une valeur inferieur à 10 dans le Tableau
         * @param Tableau
         *
         */
        public static boolean Sup10(int Tableau[]){
            int i;
            boolean sup10=false;
            for (i=0;i<Tableau.length;i++){
                if (Tableau[i]<10){
                    sup10=true;

                }
            }
            return sup10;
        }

        public static void main(String[] args) {
            int [] score={11,45,53,9,46,30,14};
            int valeurmax=Scoreplus(score);
            boolean sup=Sup10(score);
            Affichage(score);
            System.out.println();
            System.out.println("La valeur max du tableau est " +valeurmax);
            if (sup){
            System.out.println("Un nombre du tableau est inférieur à 10");
            }
        }


}

