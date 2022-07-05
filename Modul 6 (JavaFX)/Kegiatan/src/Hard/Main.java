package src.Hard;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.ActionEvent;

import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

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

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import javafx.stage.Stage;

public class Main extends Application{

    final HBox hbox = new HBox();

    final VBox vbox = new VBox();

    private TableColumn <Jadwal, String> col_dosen = new TableColumn<>("Dosen");
    private TableColumn <Jadwal, String> col_matkul = new TableColumn<>("Matkul");
    private TableColumn <Jadwal, String> col_gkb = new TableColumn<>("GKB");
    private TableColumn <Jadwal, String> col_waktu = new TableColumn<>("Waktu");
    private TableColumn <Jadwal, String> col_ruang = new TableColumn<>("Ruang");
    
    private final TextField add_dosen = new TextField();
    private final TextField add_matkul = new TextField();
    private final TextField add_gkb = new TextField();
    private final TextField add_waktu = new TextField();
    private final TextField add_ruang = new TextField();

    private final Button add_button = new Button("Add");
    private final Button update_button = new Button("Update");
    private final Button delete_button = new Button("Delete"); 
    private final Button exit_button = new Button("Exit");

    private final Label label = new Label("Jadwal Kuliah");

    private final TableView <Jadwal> Table = new TableView<>();

    private final ObservableList <Jadwal> Data = FXCollections.observableArrayList();
    
    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage stage){
        Scene scene = new Scene(new Group());
        stage.setTitle("Jadwal Kuliah (CRUD) by Ulumfr");
        stage.setWidth(1050);
        stage.setHeight(600);
        scene.setFill(Color.DARKGRAY);
        
        label.setFont(Font.font("Arial", FontWeight.BOLD, 30));

        Table.setEditable(true);

        kolom(); input();
        
        add(); update(); delete(); exit();

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

        col_ruang.setCellValueFactory(new PropertyValueFactory<>("Ruang"));
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
        Background bg = new Background(bf);
        BorderStroke bs = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT);
        Border b = new Border(bs);

        add_button.setBackground(bg);
        add_button.setTextFill(Color.BLACK);
        add_button.setBorder(b);
        add_button.setOnAction((ActionEvent e) -> {
            String dosen = add_dosen.getText();
            String matkul = add_matkul.getText();
            String gkb = add_gkb.getText();
            String wwaktu = add_waktu.getText();
            String ruang = add_ruang.getText();

            if(dosen.isEmpty() || matkul.isEmpty() || gkb.isEmpty() || wwaktu.isEmpty() || ruang.isEmpty()){
                System.out.println("Inputan Tidak Boleh Ada Yang Kosong");
            }else{
                System.out.println("Data Berhasil di tambahkan");
                Data.add(new Jadwal (
                    add_dosen.getText(), 
                    add_matkul.getText(),
                    add_gkb.getText(), 
                    add_waktu.getText(), 
                    add_ruang.getText()
                    ));
                add_dosen.clear();
                add_matkul.clear();
                add_gkb.clear();
                add_waktu.clear();
                add_ruang.clear();
            }
        });
    }

    public void update(){
        BackgroundFill bf = new BackgroundFill(Color.AQUA, CornerRadii.EMPTY, Insets.EMPTY);
        Background bg = new Background(bf);
        BorderStroke bs = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT);
        Border b = new Border(bs);

        update_button.setBackground(bg);
        update_button.setTextFill(Color.BLACK);
        update_button.setBorder(b);
        update_button.setOnAction((ActionEvent e) -> {
            System.out.println("Data Berhasil diubah");
            Table.getItems().remove(Table.getSelectionModel().getSelectedIndex());
            Data.add(new Jadwal(
                add_dosen.getText(), 
                add_matkul.getText(), 
                add_gkb.getText(), 
                add_waktu.getText(), 
                add_ruang.getText()
                ));
            add_dosen.clear();
            add_matkul.clear();
            add_gkb.clear();
            add_waktu.clear();
            add_ruang.clear();
        });
    }

    public void delete(){
        BackgroundFill bf = new BackgroundFill(Color.CRIMSON, CornerRadii.EMPTY, Insets.EMPTY);
        Background bg = new Background(bf);
        BorderStroke bs = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT);
        Border b = new Border(bs);

        delete_button.setBackground(bg);
        delete_button.setTextFill(Color.BLACK);
        delete_button.setBorder(b);
        delete_button.setOnAction((ActionEvent e) -> {
            System.out.println("Data Berhasil dihapus");
            Table.getItems().removeAll(Table.getSelectionModel().getSelectedItems());
        });
    }

    public void exit(){
        BackgroundFill bf = new BackgroundFill(Color.LIGHTYELLOW, CornerRadii.EMPTY, Insets.EMPTY);
        Background bg = new Background(bf);
        BorderStroke bs = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT);
        Border b = new Border(bs);

        exit_button.setBackground(bg);
        exit_button.setTextFill(Color.BLACK);
        exit_button.setBorder(b);
        exit_button.setOnAction((ActionEvent e) -> {
            System.out.println("Keluar");
            Platform.exit();
            System.exit(0);
        });
    }
}