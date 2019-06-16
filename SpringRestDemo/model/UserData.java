package com.gfg.abhay.SpringRestDemo.model;

import java.util.HashMap;

public class UserData {

   public static HashMap<Long,User> UserDataMap=new HashMap<>();

   static{

       User user0=new User(0L,"Bob","Kob");
       User user1=new User(1L,"Sick","Boy");
       User user2=new User(2L,"Karen","Bay");
       User user3=new User(3L,"LAdy","Poy");


       UserDataMap.put(0L,user0);
       UserDataMap.put(1L,user1);
       UserDataMap.put(2L,user2);
       UserDataMap.put(3L,user3);
   }

}
