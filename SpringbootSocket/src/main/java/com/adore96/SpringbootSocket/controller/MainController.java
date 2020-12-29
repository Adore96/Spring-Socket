package com.adore96.SpringbootSocket.controller;

import com.adore96.SpringbootSocket.bean.ProductDataBean;
import com.adore96.SpringbootSocket.model.Product;
import com.adore96.SpringbootSocket.repository.ProductRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kalharaperera ON 12/28/20
 * @project SpringbootSocket
 */

@RestController
@CrossOrigin(value = "http://localhost:4200")
public class MainController {
//    private static final Logger logger = LoggerFactory.getLogger(MainController.class);
//
//    @Autowired
//    ProductRepo productRepo;
//
//    @RequestMapping("/")
//    public String main(Model model) {
//
//        List<Product> products = productRepo.findAll();
//        List<ProductDataBean> productDataBean = new ArrayList<>();
//
//        for (int i = 0; i < products.size(); i++) {
//            ProductDataBean productDataBean1 = new ProductDataBean();
//
//            productDataBean1.setName(products.get(i).getName().trim());
//            productDataBean1.setDescription(products.get(i).getDescription().trim());
//            productDataBean1.setPrice(String.valueOf(products.get(i).getPid()).trim());
//            productDataBean.add(productDataBean1);
//
//        }
//        model.addAttribute("products", productDataBean);
//        return "Index";
//    }
}
