package azeroth.tbc.yxspring.controller;

import azeroth.tbc.yxspring.entity.StudentInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Home {

    @RequestMapping("/getall")
    public List<StudentInfo> getAll(){
        var lst=new ArrayList<StudentInfo>();
        var st=new StudentInfo();
        st.setName("张三");
        st.setId("11111111");
        st.setAge(11);
        lst.add(st);
        return  lst;
    }
}
