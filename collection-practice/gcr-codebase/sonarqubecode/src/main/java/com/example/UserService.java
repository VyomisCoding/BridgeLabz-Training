package com.example;

public interface UserService {
    boolean isUserBlocked(String userId);
    boolean isUserVerified(String userId);
    String getUserCountry(String userId);
}
