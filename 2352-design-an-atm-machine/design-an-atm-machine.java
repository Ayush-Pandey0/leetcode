class ATM {
    // Denominations in order
    private long[] notes;
    private final int[] values = {20, 50, 100, 200, 500};

    public ATM() {
        notes = new long[5];
    }

    // Deposit money into the ATM
    public void deposit(int[] banknotesCount) {
        for (int i = 0; i < 5; i++) {
            notes[i] += banknotesCount[i];
        }
    }

    // Withdraw money following rules
    public int[] withdraw(int amount) {
        int[] used = new int[5];
        long[] temp = notes.clone(); // keep copy in case withdraw fails

        // Start from largest denomination
        for (int i = 4; i >= 0; i--) {
            long canUse = Math.min(temp[i], amount / values[i]);
            used[i] = (int) canUse;
            amount -= canUse * values[i];
        }

        // If exact amount cannot be made
        if (amount != 0) {
            return new int[]{-1};
        }

        // Update ATM after successful withdrawal
        for (int i = 0; i < 5; i++) {
            notes[i] -= used[i];
        }

        return used;
    }
}
