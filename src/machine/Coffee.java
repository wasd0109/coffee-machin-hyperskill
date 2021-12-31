package machine;

public enum Coffee {
    ESPRESSO("1"), LATTE("2"), CAPPUCCINO("3");

    String inputString;

    Coffee(String inputString) {
        this.inputString = inputString;
    }

    public static Coffee findByInputString(String input) {
        for (Coffee value : values()) {
            if (value.inputString.equals(input))
                return value;
        }
        return null;
    }
}
