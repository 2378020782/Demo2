package Entity;

public class User {

    private String username;
    private String password;
    private String sex;
    private String name;
    private String stuname;
    private String email;
    private String xueyuan;
    private String xi;
    private String banji;
    private String year;
    private String address;
    private String addtext;

              public String getUsername() {
                 return username;
             }

              public void setUsername(String username) {
                 this.username = username;
             }

              public String getPassword() {
                 return password;
             }

              public void setPassword(String password) {
                 this.password = password;
             }

              public String getSex() {
                 return sex;
             }

              public void setSex(String sex) {
                 this.sex = sex;
             }

              public String getName() {
                 return name;
             }

              public void setName(String name) {
                 this.name = name;
             }

              public String getStuname() {
                 return stuname;
             }

              public void setStuname(String stuname) {
                 this.stuname = stuname;
             }

              public String getEmail() {
                 return email;
             }

              public void setEmail(String email) {
                 this.email = email;
             }

              public String getXueyuan() {
                 return xueyuan;
             }

              public void setXueyuan(String xueyuan) {
                 this.xueyuan = xueyuan;
             }

              public String getXi() {
                 return xi;
             }

              public void setXi(String xi) {
                 this.xi = xi;
             }

              public String getBanji() {
                 return banji;
             }

              public void setBanji(String banji) {
                 this.banji = banji;
             }

              public String getYear() {
                 return year;
             }

              public void setYear(String year) {
         this.year = year;
    }
              public String getAddress() {
                 return address;
             }

             public void setAddress(String address) {
                 this.address = address;
             }

             public String getAddtext() {
                 return addtext;
             }

             public void setAddtext(String addtext) {
                 this.addtext = addtext;
             }

             public User() {}

         public User(String username,String password,String sex,String name,String stuname,String email,String xueyuan, String xi,String banji,String year,String address,String addtext) {


                 this.username=username;
                 this.password=password;
                 this.sex=sex;
                 this.name=name;
                 this.stuname=stuname;
                 this.email=email;
                 this.xueyuan=xueyuan;
                 this.xi=xi;
                 this.banji=banji;
                 this.year=year;
                 this.address=address;
                 this.addtext=addtext;

             }


         }
