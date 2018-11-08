package java_professional.homeworks.homework05;



@JsonEntity
public class Jewel {

    @JsonField
    private String type;

    @JsonField
    private String ability;

    public Jewel(String type, String ability) {
        this.type = type;
        this.ability = ability;
    }
}
