package pl.patterns.chor.bank;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class Account {
    private static final int PIN_LENGTH = 4;
    private static final int TOKEN_LENGTH = 6;
    @Getter
    @Setter
    private String name;
    @Getter
    private Double balance = 5000.0;
    @Getter
    @Setter
    private String ownerName;
    private final static int pin = 4567;
    private final static int token = 456991;

    public boolean pay(Double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public boolean pay(Double amount, int pin) {
        if (validate(pin)) {
            return pay(amount);
        }
        return false;
    }

    private boolean validate(int pin) {
        if (Integer.toString(pin).length() == PIN_LENGTH) {
            return this.pin == pin;
        }
        return false;
    }

    private boolean validateToken(int token) {
        if (Integer.toString(token).length() == TOKEN_LENGTH) {
            return this.token == token;
        }

        return false;
    }

    public boolean pay(Double amount, int pinFromUser, int token) {
        if (validate(pinFromUser)) {
            System.out.println("Poprawne haslo");
            if (validateToken(token))
                System.out.println("Poprawny token");
            return pay(amount);
        }
        return false;
    }

}
