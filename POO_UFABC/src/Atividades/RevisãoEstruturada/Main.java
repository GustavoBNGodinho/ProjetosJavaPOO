package Atividades.RevisãoEstruturada;

public class Main {
    public static double sqrt(double n, double epsilon) {
        double x1 = n / 2;
        double x2 = 0.0;
        double sub = 0.0;
        while (true) {
            x2 = (x1 + n / x1) / 2;
            if ((x2 - x1) >= 0) {
                sub = x2 - x1;
            } else {
                sub = (x2 - x1) * (-1);
            }
            if ((sub) < epsilon) {
                break;
            }
            x1 = x2;
        }
        return x2;
    }

    public static boolean isPerfectNumber(long number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            return true;
        } else {
            return false;
        }
    }

    public static String encrypt(String message, int key) {
        char[] alfabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] letters = null;
        int keyNumber = 0;
        String encryptedMessage = "";
        letters = message.toCharArray();
        for (int j = 0; j < letters.length; j++) {
            for (int i = 0; i < alfabet.length; i++) {
                if (letters[j] == alfabet[i]) {
                    if (i + key >= alfabet.length) {
                        keyNumber = (i + key) % 26;
                    } else {
                        keyNumber = i + key;
                    }
                    letters[j] = alfabet[keyNumber];
                    break;
                }
            }
        }
        for (int k = 0; k < letters.length; k++) {
            encryptedMessage = encryptedMessage.concat(String.valueOf(letters[k]));
        }

        return encryptedMessage;
    }

    public static String decrypt(String encryptedMessage, int key) {
        char[] alfabet = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] letters = null;
        int keyNumber = 0;
        String decryptedMessage = "";
        letters = encryptedMessage.toCharArray();
        for (int j = 0; j < letters.length; j++) {
            for (int i = 0; i < alfabet.length; i++) {
                if (letters[j] == alfabet[i]) {
                    if (i - key >= alfabet.length) {
                        keyNumber = i - key - 26;
                    } else if (i - key < 0) {
                        keyNumber = i - key + 26;
                    } else {
                        keyNumber = i - key;
                    }
                    letters[j] = alfabet[keyNumber];
                    break;
                }
            }
        }
        for (int k = 0; k < letters.length; k++) {
            decryptedMessage = decryptedMessage.concat(String.valueOf(letters[k]));
        }
        return decryptedMessage;
    }

    public static void main(String[] args) throws Exception {
        // use this method to manually test your code
        System.out.println(sqrt(16, 0.001));
        System.out.println(isPerfectNumber(6));
        System.out.println(encrypt("zico", 1));
        System.out.println(decrypt("ettpi", 4));
    }
}
