package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    int [] score={1,4,5,9,4,3,1};
    float Moyenne;
    int Valeur=0;
    int i;
    for( i = 0; i< score.length ;i++) {
            Valeur=Valeur+score[i];


    }
    Moyenne=Valeur/i+1;
    System.out.println(Moyenne);
}
}
