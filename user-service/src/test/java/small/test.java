package small;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class test {

    public static void main(String[] args) {

        String encodedPassword = new BCryptPasswordEncoder().encode("1");
        // 保存加密后的密码到数据库
        System.out.println("Encoded Password: " + encodedPassword);
    }
}