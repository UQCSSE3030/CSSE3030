package uq.csse3030;

public final class FeeCalculator {
    private FeeCalculator() {}

    public static int calculateFee(int items, boolean member) {
        if (items < 0 || items > 3) {
            return -1;
        }

        int fee = 5;
        int i = 0;

        while (i < items) {
            fee += 2;
            i++;
        }

        if (member) {
            fee -= 3;
        } else {
            fee += 1;
        }

        return fee;
    }
}
