package com.coforge.pms.controller;


import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coforge.pms.model.Product;
import com.coforge.pms.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired //To create dependency injection using annotation
	private ProductService service;
	
	@RequestMapping("product")
	public ModelAndView loadHome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProductHome");
		return mv;
	}
	
		//using ModelAttribute automactically
		@RequestMapping(method = RequestMethod.POST, value = "product", params = "Add")
		public ModelAndView addProduct(@ModelAttribute Product product) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("ProductHome");
			
			String result = "";
			boolean status = service.addProduct(product); 
			
			if(status) {
				result = "SUCCESS : Product Object Saved";
			} 
			else {
				result = "FAILED : Product Object isn't saved";
			}
			
			mv.addObject("result", result);
			return mv;
		}
		
		
		@RequestMapping(method = RequestMethod.POST, value = "product", params = "Update")
		public ModelAndView updateProduct(@ModelAttribute Product product) {

		    ModelAndView mv = new ModelAndView();
		    mv.setViewName("ProductHome");
		    
		    String result = "";
		    boolean status = service.updateProduct(product);

		    if (status) {
		       result = "SUCCESS : Product Updated";
		    } else {
		        result = "FAILED : Product Not Found";
		    }
		    
		    mv.addObject("result",result);
		    return mv;
		}
		
		@RequestMapping(method = RequestMethod.POST, value = "product", params = "Remove")
		public ModelAndView removeProduct(@RequestParam int pid) {

		    ModelAndView mv = new ModelAndView();
		    mv.setViewName("ProductHome");
		    
		    String result = "";
		    boolean status = service.removeProduct(pid);

		    if (status) {
		       result = "SUCCESS : Product Removed";
		    } else {
		        result = "FAILED : Product Not Found";
		    }
		    
		    mv.addObject("result",result);
		    return mv;
		}
		
		@RequestMapping(method = RequestMethod.POST, value = "product", params = "Find")
		public ModelAndView findProduct(@RequestParam int pid) {

		    ModelAndView mv = new ModelAndView();
		    mv.setViewName("ProductHome");
		    
		    String result = "";
		    Product product = service.findProduct(pid);

		    if (product != null) {
		       result = product.toString();
		    } else {
		        result = "FAILED : Product Object Not Found";
		    }
		    
		    mv.addObject("result",result);
		    return mv;
		}
		
		@RequestMapping(method = RequestMethod.POST, value = "product", params = "FindAll")
		public ModelAndView findAllProduct() {

		    ModelAndView mv = new ModelAndView();
		    mv.setViewName("ProductHome");

		    String result = "";

		    HashMap<Integer, Product> product = service.findAllProduct();

		    if (!product.isEmpty()) {
		        result = product.toString();
		    } else {
		        result = "No Products Found";
		    }

		    mv.addObject("result", result);

		    return mv;
		}

	}

