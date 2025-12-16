package Secuirity;
import java.security.MessageDigest;
public class UserSecuirity {
    public static String hashpin(String pin){
        StringBuilder hash= new StringBuilder();
        try{
            MessageDigest mb=MessageDigest.getInstance("MD5");
            byte[] bytes=mb.digest(pin.getBytes());
            for(byte i:bytes){
                hash.append(String.format("%02x", i));
            }
        }
        catch(Exception e){
            System.out.println("Hashing Failed");
        }
        return hash.toString();
    }
}
