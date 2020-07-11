package Servlet;

import java.io.IOException;

  import javax.servlet.ServletException;
  import javax.servlet.annotation.WebServlet;
  import javax.servlet.http.HttpServlet;
  import javax.servlet.http.HttpServletRequest;
  import javax.servlet.http.HttpServletResponse;
  import Dao.Dao;
  import Entity.User;

         @WebServlet("/Servlet")
 public class Servlet extends HttpServlet {
     private static final long serialVersionUID = 1L;


             public Servlet() {
                 super();

             }
     protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                 req.setCharacterEncoding("utf-8");
                 String method = req.getParameter("method");
                 if ("add".equals(method)) {
                         add(req, resp);
                     }
             }

             public void add(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
                 req.setCharacterEncoding("utf-8");
                 String username = req.getParameter("username");
                 String password = req.getParameter("password");
                 String sex = req.getParameter("sex");
                 String name = req.getParameter("name");
                 String stuname = req.getParameter("stuname");
                 String email = req.getParameter("email");
                 String xueyuan = req.getParameter("xueyuan");
                 String xi= req.getParameter("xi");
                 String banji= req.getParameter("banji");
                 String year= req.getParameter("year");
                 String address= req.getParameter("address");
                 String addtext= req.getParameter("addtext");
                 User user = new User(username,password,sex,name,stuname,email,xueyuan,xi,banji,year,address,addtext);
                 Dao dao =new Dao();
                 boolean f=dao.add(user);
                 if(f) {
                         req.setAttribute("message", "注册成功！");
                         req.getRequestDispatcher("users.jsp").forward(req,resp);
                     }
                 else {
                         req.setAttribute("message", "已有账号，重复登录！");
                         req.getRequestDispatcher("users.jsp").forward(req,resp);
                     }
             }
 }