package de.gothaer.userbackend.user;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String s)
    {
        super(s);
    }
}
