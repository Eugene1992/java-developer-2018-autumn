package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class CharacterOverviewController {
    @FXML
    private TableView<Character> characterTable;
    @FXML
    private TableColumn<Character, String> firstNameColumn;
    @FXML
    private TableColumn<Character, String> lastNameColumn;

    @FXML
    private Label firstNameLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Label raceLabel;
    @FXML
    private Label specializationLabel;
    @FXML
    private Label rankLabel;
    @FXML
    private Label powerLabel;

    // Ссылка на главное приложение.
    private MainApp mainApp;

    /**
     * Конструктор.
     * Конструктор вызывается раньше метода initialize().
     */
    public CharacterOverviewController() {
    }

    /**
     * Инициализация класса-контроллера. Этот метод вызывается автоматически
     * после того, как fxml-файл будет загружен.
     */
    @FXML
    private void initialize() {
        // Инициализация таблицы адресатов с двумя столбцами.
        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
    }

    /**
     * Вызывается главным приложением, которое даёт на себя ссылку.
     *
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

        // Добавление в таблицу данных из наблюдаемого списка
        characterTable.setItems(mainApp.getPersonData());
    }


    /**
     * Заполняет все текстовые поля, отображая подробности об адресате.
     * Если указанный адресат = null, то все текстовые поля очищаются.
     *
     * @param character — адресат типа Character или null
     */
    private void showharacterDetails(Character character) {
        if (character != null) {
            // Заполняем метки информацией из объекта person.
            firstNameLabel.setText(character.getFirstName());
            lastNameLabel.setText(character.getLastName());
            raceLabel.setText(character.getRace());
            specializationLabel.setText(character.getSpecialization());
            rankLabel.setText(character.getRank());
            powerLabel.setText(String.valueOf(character.getPower()));

            // TODO: Нам нужен способ для перевода дня рождения в тип String!
            // birthdayLabel.setText(...);
        } else {
            // Если Person = null, то убираем весь текст.
            firstNameLabel.setText("");
            lastNameLabel.setText("");
            raceLabel.setText("");
            specializationLabel.setText("");
            rankLabel.setText("");
            powerLabel.setText("");
        }
    }
}