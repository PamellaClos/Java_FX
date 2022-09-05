
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Popup;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Movimentacao extends Application{
    
     
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        Pane root = new Pane();
        
        int xCirculo = 160;
        int yCirculo = 160;
        
        int largura = 80;
        int altura = 80;

        //cria o retangulo
        Rectangle ret1 = new Rectangle(80,80);
        ret1.setLayoutX(160);
        ret1.setLayoutY(160);
        ret1.setFill(Color.BLACK);
        
        Circle cir1 = new Circle(20);
        cir1.setLayoutX(xCirculo);
        cir1.setLayoutY(yCirculo);
        cir1.setFill(Color.BLACK);

        root.setStyle(" -fx-background-color: White;");
        Scene scene = new Scene(root, 320,320);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        //se for R clicado
           scene.setOnKeyPressed((evt) -> {
            if (evt.getCode() == KeyCode.R) {
                System.out.println(evt.getCode());
                root.getChildren().addAll(ret1);
            }
        });
           
           
        //se for C clicado
           scene.setOnKeyPressed((evt) -> {
            if (evt.getCode() == KeyCode.C) {
                System.out.println(evt.getCode());
                root.getChildren().addAll(cir1);
                int nvPosiCirculo = xCirculo;
            }
            //se a tecla esquerda for pressionada, diminui a posição
               if (evt.getCode() == KeyCode.LEFT) { 
                   double posicaoCirAnterior = cir1.getLayoutX();
                   cir1.setLayoutX(posicaoCirAnterior - 1);
                  
               }
               
               //se a tecla esquerda for pressionada, aumenta a posição
               if (evt.getCode() == KeyCode.RIGHT) { 
                   double posicaoCirAnterior = cir1.getLayoutX();
                   cir1.setLayoutX(posicaoCirAnterior + 1);
                  
               }
               
               //se a tecla esquerda for pressionada, aumenta a posição  de y
               if (evt.getCode() == KeyCode.UP) { 
                   double posicaoCirAnterior = cir1.getLayoutY();
                   cir1.setLayoutY(posicaoCirAnterior - 1);
                  
               }
               
                //se a tecla esquerda for pressionada, diminui a posição  de y
               if (evt.getCode() == KeyCode.DOWN) { 
                   double posicaoCirAnterior = cir1.getLayoutY();
                   cir1.setLayoutY(posicaoCirAnterior + 1);
                  
               }
        });   
       
        
    }
    public static void main(String[] args){
        launch(args);
    }
    
}
