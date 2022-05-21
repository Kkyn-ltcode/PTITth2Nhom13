package com.nhom8.ptitthchanh2.controller;

import com.nhom8.ptitthchanh2.service.IProduct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nhom8.ptitthchanh2.model.Product;
import com.nhom8.ptitthchanh2.repository.ProductRepository;

@Controller
@RequestMapping(value = "deleteProduct")
@AllArgsConstructor
public class DeleteController {

	private final ProductRepository productRepo;
	private final IProduct productService;

	@GetMapping("/{code}")
	public String deleteForm(Model model,@PathVariable("code") Long code) {
		Product p = productService.findProductById(code);
		model.addAttribute("product",p);
		return "deleteForm";
	}
	
	@PostMapping("/{code}")
	public String Confirm(@RequestParam String confirm,@RequestParam Long code) {
		if (confirm.equals("Yes")) {
			productService.deleteProductById(code);
			System.out.println(confirm);
			System.out.println("Xoa thanh cong: "+ code);
		}
		return "redirect:/";
	}
	
}