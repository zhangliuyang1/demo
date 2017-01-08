package com.zly.controller;

import com.alibaba.fastjson.JSON;
import com.zly.model.Element;
import com.zly.model.PostVideoDetail;
import com.zly.model.SeedProductDetail;
import com.zly.model.Student;
import org.im4java.core.IMOperation;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.math.BigDecimal;
import java.util.*;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/5/24  14:18
 */
@Controller
public class TestController {



    @RequestMapping(value = "/admin/getStudentInfo",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getStudentInfo(){
        Map<String,Object> result = new HashMap<String,Object>();
        Student student = new Student(1,"zly",18,new BigDecimal(60),new BigDecimal(170));
        result.put("code",0);
        result.put("data",student);
        return result;
    }

    /**
     *
     * @param
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> uploadPic(HttpServletRequest request)throws Exception{
        Map<String,Object> result = new HashMap<String,Object>();
        MultipartHttpServletRequest request1  = (MultipartHttpServletRequest)request;
        MultipartFile img = request1.getFile("file");
        String fileName = img.getOriginalFilename();
        String root = request.getSession().getServletContext().getRealPath("/");
        long timestamp = new Date().getTime();
        String fname = timestamp + fileName;
        File  tempFile = new File(root+"tmp/",fname);

        if (!tempFile.getParentFile().exists()){
            tempFile.getParentFile().mkdirs();
        }
        img.transferTo(tempFile);

        result.put("url","localhost:8080/demo/tmp/"+fname);
        return result;
    }

    /**
     * 测试返回json字符串
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/getJsonString",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getJsonString()throws Exception{
        Map<String,Object> result = new HashMap<String,Object>();
        SeedProductDetail seed = new SeedProductDetail(1L,"精美春装","http://photosd.nggirl.com.cn/work/5a9e15e564f94d688370c8ee1af4913d.jpg",
                new BigDecimal(20),90,0);
        Element element = new Element();
        element.setType(5);
        element.setContent(JSON.toJSON(seed).toString());
        element.setDescrip("");
        element.setExtend("");
        List<Element> elements = new ArrayList<>();
        elements.add(element);

        PostVideoDetail detail = new PostVideoDetail();
        detail.setPostId(1L);
        detail.setTitle("夏日不晕妆黄发");
        detail.setElements(elements);

        result.put("code",0);
        result.put("data",detail);
        return result;

    }

}
