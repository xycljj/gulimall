package com.ljj.gulimall.produce;

import com.ljj.gulimall.product.entity.BrandEntity;
import com.ljj.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest()
public class GulimallProduceApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(11l);
        brandEntity.setDescript("修改一下");
        brandService.updateById(brandEntity);
        System.out.println("修改成功");
    }

}
