package atvd2_pamellaclos;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author ALUNO
 */
public class Exe04 extends Application{
    
     
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        GridPane root = new GridPane();
        
        //add botão
        Button btn1 = new Button("Botão 1");
        Button btn2 = new Button("Botão 2");
        Button btn3 = new Button("Botão 3");
        Button btn4 = new Button("Botão 4");
        Button btn5 = new Button("Botão 5");
        Button btn6 = new Button("Botão 6");
        
        //passa o loca, e o espaçamento dos objetos (por padrão, sempre vai ser 1 (expansão de coluna))
        root.add(btn1, 0, 0);
        root.add(btn2, 1, 0, 1, 1);
        root.add(btn3, 2, 0, 1, 1);
        
        root.add(btn4, 0, 1, 1, 1);
        root.add(btn5, 1, 1, 1, 1);
        root.add(btn6, 2, 1, 1, 1);
       
        //mostrar grid
        root.setGridLinesVisible(true);
        
        //espaçamento
        root.setVgap(10);
        root.setHgap(20);
        
        //alinhamento
        root.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    public static void main(String[] args){
        launch(args);
    }
    
}
