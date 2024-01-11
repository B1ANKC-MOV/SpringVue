package company.name.projectname.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author VVulpes
 * @CreateDate 2024/1/4
 * @ProjectDetails [P4·文件上传·PPT代码]
 */
@RestController
public class FileController {
    private static final String UPLOADED_FOLDER = System.getProperty("user.dir")+"/upload";

    @PostMapping("/up")
    public String upload(String nickname, MultipartFile f) throws IOException{
        System.out.println("文件大小："+f.getSize());
        System.out.println(f.getContentType());
        System.out.println(f.getOriginalFilename());
        System.out.println(System.getProperty("user.dir"));
        saveFile(f);
        return "上传成功";
    }
    public void saveFile(MultipartFile f) throws IOException{
        File upDir = new File(UPLOADED_FOLDER);
        if(!upDir.exists()){
            upDir.mkdir();
        }
        File file = new File(UPLOADED_FOLDER+f.getOriginalFilename());
        f.transferTo(file);
    }
}
