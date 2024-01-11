package company.name.projectname.controller;

import company.name.projectname.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author VVulpes
 * @CreateDate 2024/1/4
 * @ProjectDetails [P3·演示代码]
 */
@RestController
public class ParamsController {

    @RequestMapping(value = "/getTest1",method = RequestMethod.GET)
    public String getTest1(){
        return "GET请求";
    }

    @RequestMapping(value = "/getTest2",method = RequestMethod.GET)
//  http://localhost:8080/getTest2?nickname=xxx&phone=xxx
    public String getTest2(String nickname,String phone){
        System.out.println("nickname"+nickname);
        System.out.println("phone"+phone);
        return "GET请求";
    }

    @RequestMapping(value = "/getTest3",method = RequestMethod.GET)
//  http://localhost:8080/getTest2?nickname=xxx
    public String getTest3(@RequestParam(value = "nickname",required = false)String name){
        /*@RequestParam可以进行参数映射，当请求参数名称与Controller的方法参数不一致时，可以如上所示进行注解，但会使得该参数是必须的，可以加上required = false使得该参数可选（传递与否都可以）*/
        System.out.println("nickname:"+name);
        return "GET请求";
    }

    @RequestMapping(value = "/postTest1",method = RequestMethod.POST)
    public String postTest1(){
        return "POST请求";
    }

    @RequestMapping(value = "/postTest2",method = RequestMethod.POST)
    public String postTest2(String username,String password){
        System.out.println("username:"+username);
        System.out.println("password:"+password);
        return "POST请求";
    }

    @RequestMapping(value = "/postTest3",method = RequestMethod.POST)
    public String postTest3(User user){
        System.out.println(user);
        return "POST请求";
    }

    @RequestMapping(value = "/postTest4",method = RequestMethod.POST)
    /*接收JSON类型的数据时需要加@RequestBody注解，同时，User类里面属性的名称，需要与JSON内传递对象的名称保持一致，且类型也一致
    * 例如：
    * {
    *   "username":"zhangsan",
    *   "password":"12306"
    * }
    * 如果把password的引号去掉，就变成数字类型而非字符串类型，没有一致*/
    public String postTest4(@RequestBody User user){
        System.out.println(user);
        return "POST请求";
    }

    @GetMapping("/test/**")
//  http://localhost:8080/test/xxx/xxxx
//如果是/test/*的话：http://localhost:8080/test/a
    public String test(){
        return "通配符请求";
    }
}
