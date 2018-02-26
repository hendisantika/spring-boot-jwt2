package com.hendisantika.springbootjwt2.repository;

import com.hendisantika.springbootjwt2.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jwt2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/02/18
 * Time: 05.55
 * To change this template use File | Settings | File Templates.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User save(User user);

    User findByEmail(String email);
}
