package com.romanf.crud_with_web_interface;

import com.romanf.crud_with_web_interface.model.user.User;
import com.romanf.crud_with_web_interface.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import java.util.List;

@SpringBootTest
class UserRepositoryTest {

    UserRepository userRepository;

    public UserRepositoryTest(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Test
    void test() {
        List<User> users = userRepository.findAll();
        System.out.println(users);
    }

}
