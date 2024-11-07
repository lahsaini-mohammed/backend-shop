package com.lahsaini.backendshop.service.product;

import com.lahsaini.backendshop.dto.ProductDto;
import com.lahsaini.backendshop.model.Product;
import com.lahsaini.backendshop.request.AddProductRequest;
import com.lahsaini.backendshop.request.ProductUpdateRequest;

import java.util.List;
public interface IProductService {

    Product addProduct(AddProductRequest request);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    Product updateProduct(ProductUpdateRequest product, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    Long countProductsByBrandAndName(String brand, String name);

    List<ProductDto> getConvertedProducts(List<Product> products);

    ProductDto convertToDto(Product product);
    List<Product> findDistinctProductsByName();

    List<String> getAllDistinctBrands();
}
