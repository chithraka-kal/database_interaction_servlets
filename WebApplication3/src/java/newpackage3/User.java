package newpackage3;

public class User {
    private String uname;
    private String passwd;
    private String img;

    public User(String uname, String passwd, String img) {
        this.uname = uname;
        this.passwd = passwd;
        this.img = img;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
