package Credentials;

import java.util.HashMap;

public final class UserCredentials {
    private static final HashMap<String ,String> userdata=new HashMap<>();
    static{
        userdata.put("123456789","81dc9bdb52d04dc20036dbd8313ed055");
    }

    public static String getHashpin(String cardnumber){
        return userdata.get(cardnumber);
    }
}
