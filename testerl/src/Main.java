package testerl;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class Main extends Application
{
    private Controller Ebase;


    public static void main(String[] args)
    {
        launch(args);
    }


    @Override
    public void start(Stage shell) throws Exception{
        //TODO: initialise here
        Ebase = new Controller();
        Ebase.loadBEAM();

        //INTERFACE STUFF
        Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
        shell.setTitle("TestErl");
        shell.setScene(new Scene(root, 300, 275));
        shell.show();
    }


    //TODO: Event-Handlers go here

}