package company.name.projectname.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.List;

/**
 * @author VVulpes
 * @CreateDate 2024/1/4
 * @ProjectDetails [项目简述]
 */
/*@Data
* ↑可以省略Get()和Set()方法，但是好像需要添加Mybatis之后才能用*/
/*如果表名和类名不一致，可以使用@TableName("")进行注解*/

@TableName("t_user")
public class User {

//  不需要的字段可以不写↓

//  ↓该语句会使用户对象自动带上主键，即，在该代码块中可以拿到主键的值，type = IdType.AUTO使主键自增，@TableId告知项目id为主键（PS：UUID是字符串类型的主键）

    @TableId(type = IdType.AUTO)
    private int id;
    private String username;
    private String password;
    private String birthday;

/*如果表内字段与类里面的属性名称不对应，或者类里面的属性干脆没有在表里面对应的字段，则可以通过@TableField进行注解*/
//  描述用户的所有订单

    @TableField(exist = false)
    private List<Order> orders;

//  alt+insert插入下列方法

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
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

}
