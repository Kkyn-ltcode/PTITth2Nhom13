package com.nhom8.ptitthchanh2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.nhom8.ptitthchanh2.model.Product;
import com.nhom8.ptitthchanh2.Service.ProductsService;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ProductsController {

	@Autowired
	private ProductsService productsService;
	// constructor lam gi

	@GetMapping("/")
	public String Home() {
		return "home";
	}

	@GetMapping("/displayProducts")
	public String Show(Model model) {
		model.addAttribute("products",productsService.viewProducts() );
		return "display";
	}
	@GetMapping("/addProduct")
	public String addForm(Model model) {
		Product product = new Product();
		model.addAttribute("product",product);
		return "addProduct";
	}
	@PostMapping("/addProduct")
	public String addProductSuccess(@ModelAttribute("product") Product product) {
		productsService.saveProduct(product);
		return "redirect:/displayProducts";
	}

	@GetMapping("/updateProduct/{code}")
	public ModelAndView updateForm(@PathVariable Long code) {
		ModelAndView mv= new ModelAndView("updateProduct");
		Product product = productsService.findById(code);
		mv.addObject("product",product);
		return mv;
	}

	@PostMapping("/updateProduct")
	public ModelAndView updateSuccess(@ModelAttribute Product product) {
		ModelAndView mv= new ModelAndView("redirect:/displayProducts");
		Product updatedProduct = productsService.findById(product.getCode());
		updatedProduct.setDescription(product.getDescription());
		updatedProduct.setPrice(product.getPrice());
		try {
			product = productsService.saveProduct(product);
		}catch (Exception e){
			e.printStackTrace();;
		}
		return mv;
	}

}
