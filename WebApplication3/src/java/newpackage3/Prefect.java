package newpackage3;

public class Prefect {
    private String username;
    private String password;
    private String img;

    public Prefect(String username, String password, String img) {
        this.username = username;
        this.password = password;
        this.img = img;
    }
   
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
    
        public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
