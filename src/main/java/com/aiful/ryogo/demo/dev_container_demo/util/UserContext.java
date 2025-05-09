package com.aiful.ryogo.demo.dev_container_demo.util;

public class UserContext {
    private static final ThreadLocal<String> currentUsername = new ThreadLocal<>();

    public static void setUsername(String username) {
        currentUsername.set(username);
    }

    public static String getUsername() {
        return currentUsername.get();
    }

    public static void clear() {
        currentUsername.remove();
    }
}
