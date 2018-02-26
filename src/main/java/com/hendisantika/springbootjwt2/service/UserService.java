package com.hendisantika.springbootjwt2.service;

import com.hendisantika.springbootjwt2.model.User;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jwt2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/02/18
 * Time: 05.56
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    User save(User user);

    User findByEmail(String email);

}
