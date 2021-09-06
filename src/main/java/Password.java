public class Password {
    enum Level {
        WEAK,
        STRONG,
        NOT_STRONG_ENOUGH
    }
    public static Level checkPassword(String inputStr) {
        if(inputStr.length() < 10){
            return Level.WEAK;
        }
        if(checkSpecialChar(inputStr) == true){
            return Level.STRONG;
        }
            return Level.NOT_STRONG_ENOUGH;
    }

    private static boolean checkSpecialChar(String inputStr) {
        for (int i = 0; i < inputStr.length(); i++) {
            if(inputStr.charAt(i) == '.' || inputStr.charAt(i) == '|'|| inputStr.charAt(i) == '-'){
                return true;
            }
        }
        return false;
    }
}
