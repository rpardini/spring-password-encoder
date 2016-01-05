import org.junit.Test;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

import java.util.Scanner;

/**
 * Created by pardini on 1/5/2016.
 */
public class EncoderTest {

    @Test
    public void testPasswordEncodingFromStdin() {
        //Scanner scanner = new Scanner(System.in);

        StandardPasswordEncoder encoder = new StandardPasswordEncoder();

        System.out.println("Enter password: ");

        String rawPassword = String.valueOf(System.console().readPassword());
        System.out.println("Raw password is: " + rawPassword);

        String encode = encoder.encode(rawPassword);
        System.out.println("Encoded password is: " + encode);


        boolean matches = encoder.matches(rawPassword, encode);
        System.out.println("Does it match? " + matches);
    }

}
