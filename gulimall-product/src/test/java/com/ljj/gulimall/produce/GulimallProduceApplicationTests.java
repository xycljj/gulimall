package com.ljj.gulimall.produce;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.ljj.gulimall.product.entity.BrandEntity;
import com.ljj.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


@SpringBootTest
public class GulimallProduceApplicationTests {

    @Autowired
    private OSS oss;
    @Test
    public void uploadTest() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("F:\\images\\image-20220301152038894.png");
        oss.putObject("xyc-ljj","1",inputStream);
        System.out.println("成功");

    }

}
