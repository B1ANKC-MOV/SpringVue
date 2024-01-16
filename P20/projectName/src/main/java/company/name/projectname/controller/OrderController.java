package company.name.projectname.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import company.name.projectname.entity.Order;
import company.name.projectname.entity.User;
import company.name.projectname.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author VVulpes
 * @CreateDate 2024/1/5
 * @ProjectDetails [P7·多表查询]
 */
@RestController
public class OrderController {

    @Autowired
    private OrderMapper orderMapper;

    @GetMapping("/order/findAll")
    public List findAll(){

        List orders = orderMapper.selectAllOrdersAndUser();
        return orders;
    }

    //  条件查询
    @GetMapping("/order/find")
    public List<Order> findByCond(){
        QueryWrapper<Order> queryWrapper = new QueryWrapper();
        queryWrapper.eq("uid","4");
        return orderMapper.selectList(queryWrapper);
    }

    //  分页查询←应该是有点问题，没办法做到分页
    @GetMapping("/order/findByPage")
    public IPage findByPage(){
        //  设置起始值及每页条数
        Page<Order> page = new Page<>(0,2);
        QueryWrapper<Order> queryWrapper = new QueryWrapper();
        queryWrapper.eq("uid","3");
        IPage iPage = orderMapper.selectPage(page,queryWrapper);
        return iPage;
    }
}
