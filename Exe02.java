/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvd2_pamellaclos;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author ALUNO
 */
public class Exe02 extends Application{
        //metodo abstrato
    public void start(Stage primaryStage) throws Exception {
       //StackPane root = new StackPane();
     
       Pane root = new Pane(); 
       //tamanho
       Scene scene = new Scene(root);
       Button btn1 = new Button("Button");
       Button btn2 = new Button("Button 2");
       btn2.setLayoutX(60);
       
       
        //passa o x e o y pra iniciar
        Rectangle ret1 = new Rectangle(60,30);
        ret1.setLayoutX(60);
        ret1.setLayoutY(27);
        ret1.setFill(Color.GREEN);
       
        
        root.getChildren().addAll(btn1, btn2, ret1);
        primaryStage.setTitle("Exe02-Pamella");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    //vai iniciar o main
    public static void main(String [] args){
        launch(args);
    }
}
