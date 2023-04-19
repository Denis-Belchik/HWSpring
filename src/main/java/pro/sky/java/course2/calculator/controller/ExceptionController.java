package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.exception.WrongLoginException;
import pro.sky.java.course2.calculator.exception.WrongPasswordException;

@RestController
public class ExceptionController {

    @GetMapping("/exception")
    public boolean checkLogPass(@RequestParam String login, @RequestParam String password, @RequestParam String conformPassword) {
        try {
            return check(login, password, conformPassword);
        }catch (WrongLoginException | WrongPasswordException e){
            return false;
        }
    }

    private static boolean check(String login, String password, String conformPassword) {
        if (!(isCorrectLengthLogin(login) && isValid(login)))
            throw new WrongLoginException("Некорректный логин");

        if (!(isCorrectLengthPassword(password) && isEqualPassword(password, conformPassword) && isValid(password))) {
            throw new WrongPasswordException("Некорректный пароль");
        }

        return true;
    }

    private static boolean isValid(String value) {
        String correct = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890_";
        int val = 0;
        for (int i = 0; i < value.length(); i++) {
            if (correct.contains(Character.toString(value.charAt(i)))){
                val++;
            }
        }
        return val == value.length();
    }

    private static boolean isCorrectLengthLogin(String login) {
        return isNotEmpty(login) && login.length() <= 20;
    }

    private static boolean isCorrectLengthPassword(String password) {
        return isNotEmpty(password) && password.length() < 20;
    }

    private static boolean isEqualPassword(String password, String conformPassword) {
        return isNotEmpty(password) && isNotEmpty(conformPassword) && password.equals(conformPassword);
    }

    private static boolean isNotEmpty(String value) {
        return value != null && !value.isEmpty();
    }

}
