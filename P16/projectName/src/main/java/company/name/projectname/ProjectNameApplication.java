package company.name.projectname;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author VVulpes
 * 项目运行接口
 */
@SpringBootApplication

//  ↓一个扫描器，告知其扫描哪个包

@MapperScan("company.name.projectname.mapper")
public class ProjectNameApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectNameApplication.class, args);
    }

}
