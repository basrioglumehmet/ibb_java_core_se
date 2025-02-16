package com.ibb.bootcamp.week_2.java_8_features;

import java.util.function.BiPredicate;
import java.util.List;

public class BiPredicateDemo {
    public static void main(String[] args) {
        // Sistemde kayıtlı e-posta adresleri
        List<String> registeredEmails = List.of("user@example.com", "admin@example.com", "customer@example.com");

        // BiPredicate: Kullanıcının e-posta adresi veritabanında kayıtlı mı?
        BiPredicate<String, List<String>> isEmailInDb = (email, emailList) -> emailList.contains(email);

        // BiPredicate: Kullanıcının rolü "admin" mi?
        BiPredicate<String, String> isRoleAdmin = (role, adminRole) -> role.equalsIgnoreCase(adminRole);

        // Kullanıcının yetkili olup olmadığını belirleyen Predicate
        BiPredicate<String, String> isAuthorized = (email, role) ->
                isEmailInDb.test(email, registeredEmails) || isRoleAdmin.test(role, "admin");

        // Test Kullanıcıları
        testUser("user@example.com", "user", isAuthorized);   // true (e-posta sistemde var)
        testUser("guest@example.com", "user", isAuthorized);  // false (ne admin ne de sistemde kayıtlı)
        testUser("admin@example.com", "admin", isAuthorized); // true (hem admin hem sistemde var)
        testUser("random@example.com", "admin", isAuthorized);// true (sistem dışı ama admin olduğu için yetkili)
    }

    private static void testUser(String email, String role, BiPredicate<String, String> isAuthorized) {
        System.out.println("Kullanıcı: " + email + " | Rol: " + role + " | Yetkili mi? " + isAuthorized.test(email, role));
    }
}
