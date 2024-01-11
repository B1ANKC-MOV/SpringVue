package company.name.projectname.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import company.name.projectname.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author VVulpes
 * @CreateDate 2024/1/4
 * @ProjectDetails [P6·MybatisPlus]
 */

/*接口的名称通常以表名+Mapper命名*/

@Mapper
public interface UserMapper extends BaseMapper<User> {
/*↓这些语句也可以都不写，只需要继承一个BaseMapper<实体类>↑，告知其需要操作哪个实体，MybatisPlus会自动根据该实体类找到对应的表，写好增删改查，但前提是类名要与表名保持一致*/
//  查询所有用户

    @Select("Select * from user")
    public List<User> find();

/*
* 可以单独指定要插入的字段，例：
* @Insert("insert into user (id,username) values(#{id},#{username})")
* 也可以不指定字段，把后面的值一一传入，但是如果values前面没有指定字段的话，后面就必须把所有字段写全
* #{}内的名称必须与实体类里面的属性一致，这样就会把外面传入的参数写进对应的属性值中*/

    @Insert("insert into user values(#{id},#{username},#{password},#{birthday})")
    public int insertUser(User user);
}
