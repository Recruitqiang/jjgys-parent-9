package glgc.jjgys.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import glgc.jjgys.model.project.JjgHtd;
import glgc.jjgys.model.projectvo.ljgc.CommonInfoVo;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface JjgHtdService extends IService<JjgHtd> {

    boolean addhtd(JjgHtd jjgHtd);

    JjgHtd selectlx(String proname, String htd);

    JjgHtd selectInfo(String proname, String htd);

    String getAllzh(String proname);

    List<JjgHtd> gethtd(String proname);

    boolean removeData(List<String> idList);

    void exporthtd(HttpServletResponse response, String filepath, String proname, String[] htd);

    void importhtd(MultipartFile file, CommonInfoVo commonInfoVo, String s);
}
