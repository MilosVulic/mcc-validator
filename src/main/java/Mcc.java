public class Mcc{

    private final String code;
    private final String description;

    public Mcc(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Mcc{" +
             "code='" + code + '\'' +
             ", description='" + description + '\'' +
             '}';
    }
}
