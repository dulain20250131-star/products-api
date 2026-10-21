package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //means this class answers web requests
@RequestMapping("/products") //my URLS start with /products
public class ProductController {

    @GetMapping("/{id}") //when someone visits /products/5 or any number run this method
    public Product getById(@PathVariable Long id) { //by PathVariable we assign the value user gives to the id variable
        return new Product(id, "Laptop", 999.99); //returns a product and spring boot turns it into JSON automatically.
    }
}
