
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
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
public class Exe05 extends Application{
    
     
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        GridPane root = new GridPane();
        HBox botoes = new HBox(11);

        
        //add botão
        Text cad = new Text("CADASTRO");
        TextField input = new TextField();
        
        Text nome = new Text("Email: ");
        Text senha = new Text("Senha: ");
        TextField txtNome = new TextField();
        txtNome.setPromptText("Digite seu email");
        TextField txtSenha = new TextField();
        txtSenha.setPromptText("Digite sua senha");
        
        
        Button btn1 = new Button("Cancelar");
        Button btn2 = new Button("Enviar");
        
        cad.setStyle("-fx-border-color:salmon; -fx-border-width:4px; -fx-border-radius:20px; -fx-backgound-radius:20px; -fx-background-color: pink");
        btn2.setStyle(" -fx-background-color: green");
        btn1.setStyle(" -fx-background-color: red");
        cad.setFont(Font.font("Courier new", FontWeight.BLACK, 20));
        
        
        
        botoes.getChildren().addAll(btn1,btn2);
       
        
        
        //passa o loca, e o espaçamento dos objetos (por padrão, sempre vai ser 1 (expansão de coluna))
        root.add(cad, 0, 0, 3, 1);
        root.add(nome, 0, 1);
        root.add(txtNome, 1, 1);
        root.add(senha, 0, 2, 1, 1);
        root.add(txtSenha, 1,2);
        root.add(botoes,1, 3, 1, 1 );
       
      
        //espaçamento
        root.setVgap(10);
        root.setHgap(20);

        //ele printa oq foi escrito
        txtNome.setOnKeyReleased((KeyEvent eventE) ->{
//            System.out.println(txtNome.getText());
            String strNome = txtNome.getText();
            if(strNome.contains("@") && strNome.contains(".com") && strNome.contains(".br")){
                txtNome.setStyle("-fx-control-inner-background: red");
                
            }else{
                txtNome.setStyle("-fx-control-inner-background: green");
            }
        });
        
        txtSenha.setOnKeyReleased((KeyEvent eventE) ->{
            //System.out.println(txtSenha.getText());
            String str = txtSenha.getText();
            if(!str.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$")){
                txtSenha.setStyle("-fx-control-inner-background: red");
                
            }else{
                txtSenha.setStyle("-fx-control-inner-background: green");
            }
        });
        
        //alerta botão cancelar
        Label label = new Label("Email:" + txtNome.getText() + "Senha:" + txtSenha.getText() );
        Popup popup = new Popup();
        label.setStyle(" -fx-background-color: LightPink;");
        popup.getContent().add(label);
        label.setMinWidth(40);
        label.setMinHeight(40);
   
        //printar no terminal
        EventHandler<ActionEvent> event = 
        new EventHandler<ActionEvent>() {
   
            public void handle(ActionEvent e)
            {
                System.out.println(txtNome.getText());
                System.out.println(txtSenha.getText());
                txtNome.clear();
                txtSenha.clear();
                txtNome.setStyle("-fx-control-inner-background: white");
                txtSenha.setStyle("-fx-control-inner-background: white");
            }
        };
   
        btn2.setOnAction(event);
        
        
        //limpa campo, e background white
        EventHandler<ActionEvent> eventCancelar = 
        new EventHandler<ActionEvent>() {
   
            public void handle(ActionEvent e)
            {
                txtNome.clear();
                txtSenha.clear();
                txtNome.setStyle("-fx-control-inner-background: white");
                txtSenha.setStyle("-fx-control-inner-background: white");
            }
        };
   
        btn1.setOnAction(eventCancelar);
                
        //alinhamento
        root.setAlignment(Pos.CENTER);
        root.setStyle(" -fx-background-color: SlateBlue;");
        Scene scene = new Scene(root, 320,320);
        primaryStage.setScene(scene);
        primaryStage.show();
       
        
    }
    public static void main(String[] args){
        launch(args);
    }
    
}
