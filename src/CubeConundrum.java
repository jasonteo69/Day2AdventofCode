public class CubeConundrum {
    private String game;
    public CubeConundrum(String game) {
        this.game = game;
    }
    public String blue() {
        String numOfBlue = "";
        String digit = "";
        String result = "";
        int numbers = 0;
        for (int i = 0; i < game.length(); i++) {
            numOfBlue += game.substring(i, i + 1);
            if (numOfBlue.contains("blue")) {
                for (int j = 0; j < numOfBlue.length(); j++) {
                    if (Character.isDigit(numOfBlue.charAt(j))) {
                        digit += numOfBlue.charAt(j);
                    }
                }
            }
        }
        result = digit.substring(numbers);
        return digit;
    }
}
