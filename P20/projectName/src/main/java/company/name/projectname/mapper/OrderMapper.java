package company.name.projectname.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import company.name.projectname.entity.Order;
import company.name.projectname.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author VVulpes
 * @CreateDate 2024/1/5
 * @ProjectDetails [P7·多表查询]
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

    @Select("select * from t_order where uid = #{uid}")
    List<Order> selectByUid(int uid);

//  查询所有的订单，同时查询订单的的用户
    @Select("select * from t_order")
    @Results(
            {
                    @Result(column = "id",property = "id"),
                    @Result(column = "ordertime",property = "ordertime"),
                    @Result(column = "total",property = "total"),
                    @Result(column = "uid",property = "uid"),
                    @Result(column = "uid",property = "user",javaType = User.class,
                            one = @One(select = "company.name.projectname.mapper.UserMapper.selectById"))
            }
    )
    List<Order> selectAllOrdersAndUser();
}
