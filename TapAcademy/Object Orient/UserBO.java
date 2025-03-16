class User {
    private Integer id;
    private String userName;
    private String password;

    public User(Integer id, String userName,String password)
    {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public User()
    {

    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }
    public String getUserName()
    {
        return userName;
    }  
    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    
}

public class UserBO {
    public void getUser()
    {
        User[] user = new User[5];
        user[0] = new User(1,"Lohieth","634q2748e");
        user[1] = new User(2,"Kishore","634q2748e");
        user[2] = new User(3,"Mathesh","634q2748e");
        user[3] = new User(4,"Nithin","6969");
        user[4] = new User(5,"Lohieth Aalu","634q2748e");

    }
    
}




class Encapsulation {
    public static void main(String[] args) {
        
    }
    
}