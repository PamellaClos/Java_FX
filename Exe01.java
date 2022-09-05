/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvd2_pamellaclos;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author ALUNO
 */
public class Exe01 extends Application{

    //metodo abstrato
    @Override
    public void start(Stage primaryStage) throws Exception {
       //StackPane root = new StackPane();
     
       Group root = new Group(); 
       //tamanho
       Scene scene = new Scene(root);
       Button btn1 = new Button("Button");
        System.out.println("Botão apertado");
       
        Button btn2 = new Button("BOTAO MAIORZAO");
        //passa o x e o y pra iniciar
        Rectangle ret1 = new Rectangle(100,100,100,100);
        ret1.setLayoutX(100);
        ret1.setLayoutY(500);
        ret1.setFill(Color.CRIMSON);
       
        
        root.getChildren().addAll(btn1, btn2, ret1);
        primaryStage.setTitle("Exe01-Pamella");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    //vai iniciar o main
    public static void main(String [] args){
        launch(args);
    }
    
    
}
