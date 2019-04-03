package com.som;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller {
	@RequestMapping("/api/serachxx1111xzzzzxx")
     public String     saveObj() {
         String msg= "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root><msg>交易成功</msg><code>000</code><amt>22.24</amt><details><detail><fee>12.2</fee>    n    <date>2019-01</date></detail><detail><fee>12.3</fee><date>2019-02</date></detail></details></root>";
         System.out.println("返回数据"+msg);
         return   msg;
     }
	 
	 @RequestMapping("/api/serach1")
     public String saveObj1() {
		 
		 String msg= "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root><msg>交易失败</msg><code>022</code></root>";
		 
		// String msg= "<?xml version=\"1.0\" encoding=\"UTF-8\"?><root><msg>交易成功</msg><code>000</code><amt>22.24</amt><details><detail><fee>12.2</fee><date>2019-01</date></detail><detail><fee>12.3</fee><date>2019-02</date></detail></details></root>";
         System.out.println("返回数据"+msg);
         return   msg;
		 
		 
		 
          
     }

}
