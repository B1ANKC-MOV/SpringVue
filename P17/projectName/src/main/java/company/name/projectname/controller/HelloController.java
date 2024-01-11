package company.name.projectname.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author VVulpes
 * @CreateDate 2024/1/3
 * @ProjectDetails [P2-P3]
 */
@RestController/*←意味着此类↓已经变成了一个控制器，可以去接收客户端的请求*/
/*@Controller：请求的是页面和数据
* @RestController:只是请求数据（前后端分离常用，会将返回的对象数据转换为JSON格式，方便前端进行处理）*/
public class HelloController {
    /**
     * 接收客户端请求的方法
     * @return String
     */
    @GetMapping("/hello")/*←使用HTTP里面的GET请求访问方法，访问方法时的链接地址定为hello*/
    /*@RequestMapping("/getJson/*.json")→*匹配任意字符，**匹配任意路径，?匹配单个字符
    * @RequestMapping("/getData",method = RequestMethod.GET)→规定前端必须发送GET请求，Method类型还包括POST、PUT、DELETE
    * Method匹配可以使用@GetMapping、@PostMapping等注解代替，在地址栏里面发送的请求为GET请求，前端传递参数会通过QueryString的方式传递，
    * 例：http://localhost:8080/hello?nickname=zhangsan&phone=12306
    * @RequestParam可以将请求参数绑定到控制器的方法参数上，当请求参数名称与Controller的方法参数一致时，可以省略*/
    public String hello(String nickname,String phone){
        System.out.println(phone);
        return "你好，" + nickname;
    }
    /*@PathVaraible：用来处理动态的URL，URL的值可以作为控制器中处理方法的参数
    * @RequestBody：一般用于处理`application/json`、`application/xml`等类型的数据
    * 例：puclic String hello(@RequestBody User user){}*/
}
