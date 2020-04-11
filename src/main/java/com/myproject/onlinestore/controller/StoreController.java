package com.myproject.onlinestore.controller;

import com.myproject.onlinestore.DTO.BasketDTO;
import com.myproject.onlinestore.DTO.ProductDTO;
import com.myproject.onlinestore.DTO.ProductSelectDTO;
import com.myproject.onlinestore.DTO.SearchDTO;
import com.myproject.onlinestore.model.Basket;
import com.myproject.onlinestore.model.Product;
import com.myproject.onlinestore.service.BasketService;
import com.myproject.onlinestore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StoreController {

    @Autowired
    ProductService productService;
    @Autowired
    BasketService basketService;

    @GetMapping("/store")
    public String storeForm(Model model) {
        model.addAttribute("search", new SearchDTO());
        model.addAttribute("products", new ProductDTO().getProducts());
        return "store";
    }

    @PostMapping("/store")
    public String storeSubmit(Model model, @ModelAttribute SearchDTO searchDTO,@ModelAttribute ProductSelectDTO productSelectDTO) {
        System.out.println( "The search string is :" + searchDTO.getSearchString() + " with type :" + searchDTO.getSearchType());
        model.addAttribute("search", new SearchDTO());
        model.addAttribute("products", productService.findByNameLikeAndType(searchDTO.getSearchString(),searchDTO.getSearchType()));
        model.addAttribute("selectProducts", new ProductSelectDTO());

        //The selected products are added to the basket with this logic
        BasketDTO basketDTO = new BasketDTO();
        List<Basket> basket = new ArrayList<>();
        for (String s: productSelectDTO.getSelectedProducts()) {
            System.out.println(s);
            basket.add(new Basket(Integer.valueOf(s), 1));
        }
        basketDTO.setBasket(basket);

        // if the user tries to add the already existing products to the cart, this error message would be shown
        String errorMsg = "";
        if(null == basketService.saveAll(basketDTO)){
            errorMsg = "You already have the item you selected in your basket";
        }
        model.addAttribute("errorMsg", errorMsg);

        System.out.println(errorMsg);

        // so that the shopping basket could be displayed
        model.addAttribute("productsBasket", productService.findByUserIdInBasket(1));

        return "store";
    }

}
