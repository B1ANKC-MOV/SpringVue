package company.name.projectname.controller;

import company.name.projectname.entity.User;
import company.name.projectname.mapper.UserMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author VVulpes
 * @CreateDate 2024/1/4
 * @ProjectDetails [P5·RESTFUL风格的API·演示代码]
 */
@RestController
public class UserController {

//  如果想要使用Mapper，则需要进行声明，定义一个属性↓，并使用@Autowired注入userMapper使其不为空

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user")
    public List query(){
        List<User> list = userMapper.find();
//      使用Mybatis自带的方法，根据条件查询（此处条件为null，即全查）↓
        List<User> listPlus = userMapper.selectList(null);
        System.out.println(list);
        System.out.println(listPlus);
        return list;
    }

    @PostMapping("/user")
    public String save(User user){
        int i = userMapper.insert(user);
        System.out.println(user);
        if(i>0){
            return "插入成功";
        }else{
            return "插入失败";
        }
    }

    @ApiOperation("获取用户")
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable int id){
        /*由于RESTFUL风格的接口提倡使用/user/10类似的URL传输参数，而非/user?id=10,此种传参为动态显示的，故需要加上注解@PathVariable，否则只能拿到以?形式传输的参数*/
        System.out.println(id);
        return "根据ID获取用户信息";
    }
    @PutMapping("/user")
    public String update(User user){
        return "更新用户";
    }
    @DeleteMapping("/user/{id}")
    public String deleteById(@PathVariable int id){
        System.out.println(id);
        return "根据ID删除用户";
    }
/*    @PostMapping("/user")
    public String save(User user){
        return "添加用户";
    }*/
}
