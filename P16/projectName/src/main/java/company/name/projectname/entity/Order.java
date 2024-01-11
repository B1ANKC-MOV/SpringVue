package company.name.projectname.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.List;

/**
 * @author VVulpes
 * @CreateDate 2024/1/5
 * @ProjectDetails [P7·多表查询]
 */
@TableName("t_order")
public class Order {

    private int id;
    @TableField("order_time")
    private String ordertime;
    private String total;
    private int uid;

    @TableField(exist = false)
    private User user;
}
