/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package space.needle;

/**
 *
 * @author areeyatipyasothi
 */
public class SpaceNeedle {

    /**
     * @param args the command line arguments
     */
    private static final int SIZE = 7;
    private static final int WIDTH = SIZE * 6;
    public static void main(String[] args) {
        // TODO code application logic here
        stem();
        top();
        mid();
        bottomHead();
        stem();
        body();
        top();
        mid();
       
    }
    public static void stem(){
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < WIDTH; j++){
                if(j == (WIDTH / 2) || j == (WIDTH / 2) + 1){
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void top(){
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < (SIZE * 3) - (i + 1) * 3; j++){
                System.out.print(" ");
            }
            System.out.print("__/");
            for (int a = 0; a < 2; a++) {
                if (a == 1) {
                    System.out.print("||");
                }
                for (int k = 0; k < i * 3; k++) {
                    System.out.print(":");
                }
            }
            System.out.print("\\__");
            System.out.println();
        }
    }
    public static void mid(){
        System.out.print("|");
        for(int i = 0; i < WIDTH; i++){
            System.out.print("\"");
        }
        System.out.print("|");
        System.out.println();
    }
    public static void bottomHead(){
        for(int i = SIZE; i > 0; i--){
            for(int j = 0; j < (SIZE * 2) - i * 2; j++){
                System.out.print(" ");
            }
            System.out.print("\\_");
            for(int k = 0; k < 2+ 2 * SIZE + 4 * (i - 1); k+=2){
                System.out.print("/\\");
            }
            System.out.print("_/");
            System.out.println();
        }
    }
    public static void body(){
        for(int i = 0; i < SIZE * SIZE; i++){
            for(int j = 0; j < (WIDTH / 2); j++){
                if(j == (WIDTH / 2) - SIZE + 1) {
                    for(int k = 0; k < 2; k++){
                        System.out.print("|");
                        for(int a = 0; a < SIZE - 2; a++){
                            System.out.print("%");
                        }
                        System.out.print("|");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    
}
