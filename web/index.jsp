<%--
  Created by IntelliJ IDEA.
  User: yy
  Date: 2020/7/10
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
             pageEncoding="UTF-8"%>
 <!DOCTYPE html>
 <html>
 <head>
   <meta charset="UTF-8">
   <title>Insert title here</title>
   <script>
       //表单校验
        function check() {
                 flag=0;
                 var rep =  /^[\w\u4e00-\u9fa5]{6,8}$/;  //判断字符串是否为数字和字母组合
                 var myPattern = new RegExp("^[a-zA-Z]"); // 以英文字母开头
                 var username = document.getElementById("username").value;
                 //alert(username.length);
                 if(!(username.length>5&&username.length<13)){
                         alert("用户名长度错误！");return false;
                     }
                 else if(!(rep.test(username))){
                         alert("用户名组成内容错误！");return false;
                     }else if(!(myPattern.exec(username))){
                         alert("用户名开头必须是字母！");return false;
                     }
                 var password = document.getElementById("password").value;
                 if(password.length<8){
                         alert("密码长度错误");
                         return false;
                     }

                 var stuname = document.getElementById("stuname").value;
                 if(stuname.length!=8){
                         alert("学号长度错误！");
                         return false;
                     }
                 if(stuname [0]=='2'&&stuname[1]=='0'&&stuname[2]=='1'&&stuname[3]=='8'){
                         flag++;
                         }
                 else{
                         alert("学号格式错误！");
                         return false;
                     }

                 var email = document.getElementById("email").value;
                 if(/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(.[a-zA-Z0-9_-])+/.test(email)){
                         flag++;
                         }
                 else{
                         alert("邮箱格式错误！");
                         return false;
                     }
                 //标志法判断是否添加成功
                 if(flag>1){
                         alert("添加成功");
                         return true;
                     }
                 else{
                         alert("添加失败");
                         return false;
                     }
         }
     </script>
   </head>

     <body>



         <table border="0px" cellpadding="10px" cellspacing="0px"
                  69                 style="width: 50%;margin:auto;background:rgb(195,195,195)"  bordercolor="red" >
                       <form action="Servlet?method=add" method="post"
                               71             onsubmit="return check()">
               <caption>当前位置：添加学生信息</caption>


                   <tr>
                       <td>登录账号:</td>
                       <td><input type="text" name="username" id="username"></td>
                   </tr>
                   <tr>
                       <td>登录密码:</td>
                       <td><input type="password" name="password" id="password" ></td>
                   </tr>
                   <tr>
                       <td>性别:</td>
                       <td>
                       <select name="sex">
                               <option value="男">男</option>
                               <option value="女">女</option>
                         </select>
                       </td>
                   </tr>
                   <tr>
                       <td>姓名:</td>
                       <td><input type="text" name="name"></td>
                   </tr>
                   <tr>
                        <td>学号:</td>
                       <td><input type="text" name="stuname" id="stuname"></td>
                   </tr>
                     <tr>
                       <td>电子邮箱:</td>
                       <td><input type="text" name="email" id="email"></td>
                   </tr>
                   <tr>
                       <td>所在学院:</td>
                       <td><input type="text" name="xueyuan"></td>
                   </tr>
                    <tr>
                       <td>所在系:</td>
                       <td><input type="text" name="xi"></td>
                   </tr>
                   <tr>
                       <td>所在班级:</td>
                       <td><input type="text" name="banji"></td>
                   </tr>
                   <tr>
                       <td>入学年份(届):</td>
                       <td>
                           <select name="year">
                               <option value="1998">1998</option>
                               <option value="1999">1999</option>
                               <option value="2000">2000</option>
                               <option value="2001">2001</option>
                               <option value="2002">2002</option>
                               <option value="2004">2004</option>
                               <option value="2003">2003</option>
                               <option value="2005">2005</option>
                               <option value="2006">2006</option>
                               <option value="2007">2007</option>
                               <option value="2008">2008</option>
                               <option value="2009">2009</option>
                               <option value="2010">2010</option>
                               <option value="2011">2011</option>
                               <option value="2012">2012</option>
                               <option value="2013">2013</option>
                               <option value="2014">2014</option>
                               <option value="2015">2015</option>
                               <option value="2016">2016</option>
                               <option value="2017">2017</option>
                               <option value="2018">2018</option>
                               <option value="2019">2019</option>
                           </select>
                       </td>
                   </tr>
                    <tr>
                       <td>生源地:</td>
                       <td><input type="text" name="address"></td>
                   </tr>
                    <tr>
                       <td>
                                       备注:
                       </td>
                       <td>
                       <input type="text" name="addtext" >
                       </td>
                   </tr>
                   <tr>
                       <th colspan="2">
                           <input type="submit" value="添加">
                       </th>
                   </tr>
               </form>
           </table>
     </body>
 </html>