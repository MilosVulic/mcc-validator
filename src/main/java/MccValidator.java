public class MccValidator {

    public static boolean isCodeValid(String code) {
        return MccFactory.getMccList()
             .stream()
             .anyMatch(mcc -> mcc.getCode().equals(code));
    }

    public static boolean isCodeLengthValid(String code) {
        return code.length() == 4;
    }

    public static boolean isCodeFormatContainsOnlyDigits(String code) {
        return code.matches("[0-9]+");
    }

    public static boolean isCodeFormatValid(String code) {
        return code.matches("[0-9]+") && code.length() == 4;
    }


    public static String getDescription(String code) {
        return MccFactory.getMccList()
             .stream()
             .filter(mcc -> mcc.getCode().equals(code))
             .map(Mcc::getDescription)
             .findFirst().orElse("Description not found");
    }

    public static int getNumberOfMccs() {
        return MccFactory.getMccList().size();
    }
}
