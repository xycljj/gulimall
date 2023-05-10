package com.ljj.gulimall.produce;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
public class Demo {

    @Test
    public void uploadTest() throws FileNotFoundException {
    String endpoint = "oss-cn-heyuan.aliyuncs.com";
    // 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
    String accessKeyId = "LTAI5tHSfjAcjA3nfWr2PKDj";
    String accessKeySecret = "6HdPaSkwJWhSeG51VHac6owdMOscTv";
    // 填写Bucket名称，例如examplebucket。
    String bucketName = "xyc-ljj";
    // 填写Object完整路径，例如exampledir/exampleobject.txt。Object完整路径中不能包含Bucket名称。
    String objectName = "first";

}
}
