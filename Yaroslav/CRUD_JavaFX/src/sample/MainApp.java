package sample;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    /**
     * Данные, в виде наблюдаемого списка адресатов.
     */
    private ObservableList<Character> personData = FXCollections.observableArrayList();

    /**
     * Конструктор
     */
    public MainApp() {
        // В качестве образца добавляем некоторые данные
        personData.add(new Character("Эллайна", "Элрис"));
        personData.add(new Character("Эрей", "Элрис"));
        personData.add(new Character("Вулрик", "Бронзскин"));
        personData.add(new Character("Кахат", "Валкхар"));
        personData.add(new Character("Баал", "Страйгер"));
        personData.add(new Character("Дариус", "Сколт"));
    }


    /**
     * Возвращает данные в виде наблюдаемого списка адресатов.
     *
     * @return
     */
    public ObservableList<Character> getPersonData() {
        return personData;
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");

        initRootLayout();

        showCharacterOverview();
    }

    /**
     * Инициализирует корневой макет.
     */
    public void initRootLayout() {
        try {
            // Загружаем корневой макет из fxml файла.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Отображаем сцену, содержащую корневой макет.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Показывает в корневом макете сведения об адресатах.
     */
    public void showCharacterOverview() {
        try {
            // Загружаем сведения об адресатах.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("CharacterOverview.fxml"));
            AnchorPane characterOverview = (AnchorPane) loader.load();

            // Помещаем сведения об адресатах в центр корневого макета.
            rootLayout.setCenter(characterOverview);

            // Даём контроллеру доступ к главному приложению.
            CharacterOverviewController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Возвращает главную сцену.
     *
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
