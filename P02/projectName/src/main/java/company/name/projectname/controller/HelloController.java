package company.name.projectname.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author VVulpes
 * @CreateDate 2024/1/3
 * @ProjectDetails [项目简述]
 */
@RestController/*←意味着此类↓已经变成了一个控制器，可以去接收客户端的请求*/
/*@Controller：请求的是页面和数据
* @RestController:只是请求数据（前后端分离常用，会将返回的对象数据转换为JSON格式，方便前端进行处理）*/
public class HelloController {
    /**
     * 接收客户端请求的方法
     * @return String
     */
    @GetMapping("/hello")/*使用HTTP里面的GET请求访问方法，访问方法时的链接地址定为hello*/
    public String hello(){
        return "你好，世界";
    }
}
