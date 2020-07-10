package Dao;

import java.sql.Connection;
  import java.sql.Statement;

          import DBUtil.DBUtil;

          import Entity.User;

          public class Dao {

              public boolean add(User user) {
                 String sql = "insert into uses1 (username,password,sex,name,stuname,email,xueyuan,xi,banji,year,address,addtext) values('"+ user.getUsername() + "','"+ user.getPassword() +"','"+ user.getSex() +"','"+user.getName() +"','"+ user.getStuname() +"','"+user.getEmail()+"','"+ user.getXueyuan() +"','"+user.getXi()+"','"+user.getBanji()+"','"+user.getYear()+"','"+user.getAddress()+"','"+user.getAddtext()+"')";
                 // 创建数据库链接
                 Connection conn = DBUtil.getConn();
                 Statement state = null;
                 boolean f = false;
                 int a = 0;

                 try {
                         state = conn.createStatement();
                         a=state.executeUpdate(sql);
                     } catch (Exception e) {
                         e.printStackTrace();
                     } finally {
                         // 关闭z 连接
                         DBUtil.close(state, conn);
                     }

                 if (a > 0) {
                         f = true;
                     }
                 return f;

         }


         }