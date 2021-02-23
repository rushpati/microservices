package com.example.pocmicroservices.dao;


import com.example.pocmicroservices.controllers.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserDaoService {
    private static  List<User> userList = new ArrayList<>();
    static {
        userList.add(new User("adam",1, new Date()));
        userList.add(new User("adam",2, new Date()));
        userList.add(new User("adam",3, new Date()));
        userList.add(new User("adam",14, new Date()));
        userList.add(new User("adam",5, new Date()));
    }
    private  static  int userCount =5;
    public  List<User> findAll(){
        return  userList;
    }

    public  User saveuser(User user){
        if(user.getId()==null){
            user.setId(++userCount);
        }

        userList.add(user);
        return user;
    }
    public User findOne(int id){
        for(User user: userList){
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }

}
