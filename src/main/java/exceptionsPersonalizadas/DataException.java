package exceptionsPersonalizadas;

public class DataException extends Exception {
    @Override
    public String getMessage() {
        return "Radio no puede ser negativo";
    }
}
