package com.gfg.abhay.SpringRestDemo.controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.gfg.abhay.SpringRestDemo.model.User;
import com.gfg.abhay.SpringRestDemo.model.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<User> getAllUsers(){

    ArrayList<User> arrlist=new ArrayList<User>();

    for(Map.Entry<Long,User> entry: UserData.UserDataMap.entrySet())
    {
        arrlist.add(entry.getValue());
    }
    return arrlist;

    }

    @PostMapping("/user")
    public Boolean createNewUser(@RequestBody User user){

        Long Id=user.getId();
        if(UserData.UserDataMap.containsKey(Id)) return false;
        else {UserData.UserDataMap.put(Id,user);
        return true;}
    }

    @DeleteMapping("/user/{Id}")
    public boolean DeleteUser(@PathVariable Long Id){

        if(UserData.UserDataMap.containsKey(Id)){
            UserData.UserDataMap.remove(Id);
             return true;
        }else return false;

    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user){

        Long Id=user.getId();
        if(UserData.UserDataMap.containsKey(Id)){
            UserData.UserDataMap.put(Id,user);
            return user;

        }
        else return null;
    }

}
