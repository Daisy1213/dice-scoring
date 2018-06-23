package learning;

public class Scoring {
    public static int score(Integer ...dices) {
        if (dices.length == 0) {
            return 0;
        }
        if (dices[0] == 1) {
            return one(dices.length);
        }
        if (dices[0] == 5) {
            return five(dices.length);
        }
        if (dices[0] == 2 || dices[0] == 3 || dices[0] == 4 || dices[0] == 6) {
            return other(dices[0], dices.length);
        }
        return 0;
    }

    private static int other(Integer number, int length) {
        if (length < 3) {
            return 0;
        }
        return number * 100 + other(number, length -3);
    }

    private static int five(int length) {
        if (length < 3) {
            return 50 * length;
        }
        return 500 + five(length - 3);
    }

    private static int one(int length) {
        if (length < 3) {
            return 100 * length;
        }
        return 1000 + one(length - 3);
    }
}
