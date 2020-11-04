
 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fitbyte_app;

import com.core.views.plateService.PlateService;
import com.core.views.plateIngredientService.plateIngredientService;
import com.core.views.exerciseService.ExerciseService;
import java.sql.Connection;
import java.util.Scanner;
/**
 *
 * @author developer
 * version 1
 */
public class App {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void showMenu(){
            System.out.println("-----------------------------------");
            System.out.println(" 1. crear Plato");
            System.out.println(" 2. crear Ejercicio");
            System.out.println(" 2. crear Plato-Ingrediente");
            System.out.println(" 4. buscar un plato");
            System.out.println(" 5. borrar un plato");
            System.out.println(" 6. actualizar un plato ");
            System.out.println(" 7. buscar un ejercicio");
            System.out.println(" 8. borrar un ejercicio");
            System.out.println(" 9. actualizar un ejercicio ");
            System.out.println(" 10. buscar un Plato-Ingrediente");
            System.out.println(" 11. borrar un Plato-Ingrediente");
            System.out.println(" 12. actualizar un Plato-Ingrediente");
            System.out.println(" 13. salir ");
            System.out.println("-----------------------------------");
            System.out.print("> ");
    }
    public static void processOption(String option){
            switch (option){
                case "1":
                    PlateService.create();
                   
                    break;
                case "2":
                    ExerciseService.create();
                    
                    break;
                case "3":
                    plateIngredientService.create();
                   
                    break;
                case "4":
                    PlateService.find();
                    
                    break;
                case "5":
                    PlateService.delete();
                
                    break;
                case "6":
                    PlateService.update();
                 
                    break;
                case "7":
                    ExerciseService.find();
                    
                    break;
                case "8":
                    ExerciseService.delete();
                    scanner.nextLine();
                    break;
                case "9":
                    ExerciseService.update();
                    
                    break;
                case "10":
                    plateIngredientService.find();
                    scanner.nextLine();
                    break;
                case "11":
                    plateIngredientService.delete();
                    
                    break;
                case "12":
                    plateIngredientService.update();
                    
                    break;
                default:
                    break;
            }
    }
    public static void main(String[] args) {
        System.out.println(" FitByte");
        ConnectionProvider conexion = new ConnectionProvider();
        Scanner sc = new Scanner(System.in);
        String option;
        do{                
            showMenu();
            //leemos la opcion del usuario
            option = scanner.nextLine();
            processOption(option);
          
        }while(!"13".equals(option));
    }
    
}