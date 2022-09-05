/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvd2_pamellaclos;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author ALUNO
 */
public class Exe03 extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
      ArrayList<Button> bts = new ArrayList<>();
     //espacameto de 20
       VBox root = new VBox(20); 
       
       
       Scene scene = new Scene(root);
       Button btn1 = new Button("Button 1");
       bts.add(btn1);
       Button btn2 = new Button("Button 2");
       bts.add(btn2);
       Button btn3 = new Button("Button 3");
       bts.add(btn3);
       
       //ou
       Button bt1 = new Button();
       bt1.setText("Button 4 é grande de mais para esta linha");
       bt1.setWrapText(true);
       bts.add(bt1);

       //adiciona imagem
       Image image = new Image(getClass().getResourceAsStream("logo.jpg"));
       ImageView imgView = new ImageView(image);
       //define tamanho
       imgView.setFitHeight(80);
       //preserve mantem a razão da altura/largura, se um diminui o outro também diminui
       imgView.setPreserveRatio(true);
       //add a imagem à um botão
       Button btn4 = new Button("Button 4", imgView);
       //adiciona o botão na lista
       bts.add(btn4);
       
     
       //estilizado botao
       Button btn5 = new Button("Button 5");
       bts.add(btn5);
       //cor - tamanho da borda - curvatura da borda
       btn5.setStyle("-fx-border-color:salmon; -fx-border-width:4px; -fx-border-radius:20px; -fx-backgound-radius:20px; -fx-background-color: pink");
       btn5.setFont(Font.font("Courier new", FontWeight.BLACK, FontPosture.ITALIC, 20));
       btn5.setPrefHeight(50);//largura preferencial
       btn5.setPrefHeight(200);//altura preferencial
  
       btn5.minHeight(40);//não pode ser menor que
       btn5.minWidth(20);
       
       btn5.setMaxWidth(Double.MAX_VALUE); //ocupa a tela toda
       
       //adiciona a lista na tela
        root.getChildren().addAll(bts);  
        primaryStage.setTitle("Exe03-Pamella");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
        public static void main(String [] args){
        launch(args);
    }
    
}
