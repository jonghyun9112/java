package com.ruby.java.ch09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    // 비밀번호 정규 표현식
    // 1. (?=.*[A-Z])     : 최소 한 개의 대문자를 포함해야 함
    // 2. (?=.*[!@#$%^&*()-_+=[]{}|;:',.<>/?]) : 최소 한 개의 특수문자를 포함해야 함
    // 3. .{8,}          : 최소 8자리 이상이어야 함
    // 4. ^...$          : 문자열 전체에 적용
    private static final String PASSWORD_REGEX =
            "^(?=.*[A-Z])(?=.*[!@#$%^&*()-_+=[]{}|;:',.<>/?]).{8,}$";
            // 참고: 많이 쓰이는 특수문자 집합. 필요에 따라 더 추가하거나 제거할 수 있습니다.
            // 정규식 내의 대괄호 []는 이스케이프 필요 없습니다.

    public static boolean isValidPassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static void main(String[] args) {
        // 유효한 비밀번호 테스트
        System.out.println("Valid passwords:");
        System.out.println("Test@123 : " + isValidPassword("Test@123"));     // true (대문자, 특수문자, 8자리 이상)
        System.out.println("Password!1 : " + isValidPassword("Password!1")); // true
        System.out.println("ABCdefg! : " + isValidPassword("ABCdefg!"));    // true
        System.out.println("Test@1234567890 : " + isValidPassword("Test@1234567890")); // true (더 긴 경우)

        System.out.println("\nInvalid passwords:");
        System.out.println("test@123 : " + isValidPassword("test@123"));     // false (대문자 없음)
        System.out.println("Test1234 : " + isValidPassword("Test1234"));     // false (특수문자 없음)
        System.out.println("T@123 : " + isValidPassword("T@123"));         // false (8자리 미만)
        System.out.println("test1234 : " + isValidPassword("test1234"));     // false (대문자, 특수문자 없음)
        System.out.println("Abcdefgh : " + isValidPassword("Abcdefgh"));     // false (특수문자 없음)
        System.out.println("@#$%^&* : " + isValidPassword("@#$%^&*"));     // false (대문자 없음, 8자리 미만)
    }
}