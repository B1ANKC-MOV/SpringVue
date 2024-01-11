package company.name.projectname.entity;

/**
 * @author VVulpes
 * @CreateDate 2024/1/4
 * @ProjectDetails [项目简述]
 */
/*@Data
* ↑可以省略Get()和Set()方法，但是好像需要添加Mybatis之后才能用*/
public class User {
    private String username;
    private String password;

//  alt+insert插入下列方法

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

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
