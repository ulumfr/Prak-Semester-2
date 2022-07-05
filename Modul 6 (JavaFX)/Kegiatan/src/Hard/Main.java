package src.Hard;

import javafx.application.Application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.Group;
import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import javafx.scene.control.cell.PropertyValueFactory;

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.scene.paint.Color;

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import javafx.stage.Stage;

public class Main extends Application{

    //Hbox
    private final HBox hbox = new HBox();

    //Vbox
    private final VBox vbox = new VBox();

    //TableColomn
    private TableColumn <Jadwal, String> col_dosen = new TableColumn<>("Dosen");
    private TableColumn <Jadwal, String> col_matkul = new TableColumn<>("Matkul");
    private TableColumn <Jadwal, String> col_gkb = new TableColumn<>("GKB");
    private TableColumn <Jadwal, String> col_waktu = new TableColumn<>("Waktu");
    private TableColumn <Jadwal, String> col_ruang = new TableColumn<>("Ruangan");
    
    //TextField
    private final TextField add_dosen = new TextField();
    private final TextField add_matkul = new TextField();
    private final TextField add_gkb = new TextField();
    private final TextField add_waktu = new TextField();
    private final TextField add_ruang = new TextField();

    //Button
    private final Button add_button = new Button("Add");
    private final Button update_button = new Button("Update");
    private final Button delete_button = new Button("Delete"); 
    private final Button exit_button = new Button("Exit");

    private final TableView <Jadwal> Table = new TableView<>();
    public static ObservableList <Jadwal> Data = FXCollections.observableArrayList();
    
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage stage){
        Scene scene = new Scene(new Group());
        stage.setTitle("Jadwal Kuliah (CRUD) by Ulumfr");
        stage.setWidth(1050);
        stage.setHeight(600);
        scene.setFill(Color.DARKGRAY);
        
        final Label label = new Label("Jadwal Kuliah");
        label.setFont(Font.font("Arial", FontWeight.BOLD, 30));

        Table.setEditable(true);

        kolom();
        input();
        
        add();
        update();
        delete();
        exit();

        hbox.getChildren().addAll(add_dosen, add_matkul, add_gkb, add_waktu, add_ruang, add_button, update_button, delete_button, exit_button);
        hbox.setSpacing(10);
        
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(18);
        vbox.setPadding(new Insets(15, 15, 15, 15));
        vbox.getChildren().addAll(label, Table, hbox);

        ((Group) scene.getRoot()).getChildren().addAll(vbox);

        stage.setScene(scene);
        stage.show();
    }
    
    public void kolom(){
        col_dosen.setCellValueFactory(new PropertyValueFactory<>("Dosen"));
        col_dosen.setMinWidth(200);

        col_matkul.setCellValueFactory(new PropertyValueFactory<>("Matkul"));
        col_matkul.setMinWidth(200);

        col_gkb.setCellValueFactory(new PropertyValueFactory<>("GKB"));
        col_gkb.setMinWidth(200);

        col_waktu.setCellValueFactory(new PropertyValueFactory<>("Waktu"));
        col_waktu.setMinWidth(200);

        col_ruang.setCellValueFactory(new PropertyValueFactory<>("Ruangan"));
        col_ruang.setMinWidth(200);

        Table.getColumns().addAll(col_dosen, col_matkul, col_gkb, col_waktu, col_ruang);
        Table.setItems(Data);
    }

    public void input(){
        add_dosen.setPromptText("Dosen");
        add_dosen.setMaxWidth(col_dosen.getPrefWidth());

        add_matkul.setPromptText("Matkul");
        add_matkul.setMaxWidth(col_matkul.getPrefWidth());
        
        add_gkb.setPromptText("GKB");
        add_gkb.setMaxWidth(col_gkb.getPrefWidth());

        add_waktu.setPromptText("Waktu");
        add_waktu.setMaxWidth(col_waktu.getPrefWidth());

        add_ruang.setPromptText("Ruang");
        add_ruang.setMaxWidth(col_ruang.getPrefWidth());
    }

    public void add(){
        BackgroundFill bf = new BackgroundFill(Color.AQUAMARINE, CornerRadii.EMPTY, Insets.EMPTY);
        BorderStroke bs = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT);
        Background bg = new Background(bf);
        Border b = new Border(bs);

        add_button.setBackground(bg);
        add_button.setTextFill(Color.BLACK);

        add_button.setBorder(b);
    }

    public void update(){
        BackgroundFill bf = new BackgroundFill(Color.AQUA, CornerRadii.EMPTY, Insets.EMPTY);
        BorderStroke bs = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT);
        Background bg = new Background(bf);
        Border b = new Border(bs);

        update_button.setBackground(bg);
        update_button.setTextFill(Color.BLACK);
        update_button.setBorder(b);
    }

    public void delete(){
        BackgroundFill bf = new BackgroundFill(Color.CRIMSON, CornerRadii.EMPTY, Insets.EMPTY);
        BorderStroke bs = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT);
        Background bg = new Background(bf);
        Border b = new Border(bs);

        delete_button.setBackground(bg);
        delete_button.setTextFill(Color.BLACK);
        delete_button.setBorder(b);
    }

    public void exit(){
        BackgroundFill bf = new BackgroundFill(Color.LIGHTYELLOW, CornerRadii.EMPTY, Insets.EMPTY);
        BorderStroke bs = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT);
        Background bg = new Background(bf);
        Border b = new Border(bs);

        exit_button.setBackground(bg);
        exit_button.setTextFill(Color.BLACK);
        exit_button.setBorder(b);
    }
}