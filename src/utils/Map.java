/*
@Author: Giogex
@Date: 06/02/2024
@Description: Map prototype for the Ecosystem.
 */

package utils;

public class Map {
    private String [][] dataMapping = {
        {"/","‾","‾","‾","‾","‾","‾","‾","‾","‾","‾","‾","‾","\\","\n"}, 
        {"| ","T","T","T","T","T","T","T","T","T","T"," "," |","\n"},
        {"| ","T","T","T","T","T","T","T","T","T","T"," "," |","\n"},
        {"| ","T","T","T","T","T","T","T","T","T","T"," "," |","\n"},
        {"| ","T","T","T","T","T","T","T","T","T","T"," "," |","\n"},
        {"| ","T","T","T","T","T","T","T","T","T","T"," "," |","\n"},
        {"| ","T","T","T","T","T","T","T","T","T","T"," "," |","\n"},
        {"| ","T","T","T","T","T","T","T","T","T","T"," "," |","\n"},
        {"| ","T","T","T","T","T","T","T","T","T","T"," "," |","\n"},
        {"| ","T","T","T","T","T","T","T","T","T","T"," "," |","\n"},
        {"| ","T","T","T","T","T","T","T","T","T","T"," "," |","\n"},
        {"\\","_","_","_","_","_","_","_","_","_","_","_","_","/","\n"},

    };

    public void showMap(){
        for(String[] row : dataMapping){
            for(String space : row){
                System.out.print(space + " ");
            }
            System.out.println();
        }
    }
}
