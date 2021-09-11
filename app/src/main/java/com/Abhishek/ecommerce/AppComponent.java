package com.Abhishek.ecommerce;

import com.Abhishek.ecommerce.api.ApiModule;
import com.Abhishek.ecommerce.domain.cartdetails.CartComponent;
import com.Abhishek.ecommerce.domain.cartdetails.CartModule;
import com.Abhishek.ecommerce.domain.categorylist.CategoryComponent;
import com.Abhishek.ecommerce.domain.categorylist.CategoryModule;
import com.Abhishek.ecommerce.domain.productdetails.ProductDetailComponent;
import com.Abhishek.ecommerce.domain.productdetails.ProductDetailModule;
import com.Abhishek.ecommerce.domain.productlist.ProductListComponent;
import com.Abhishek.ecommerce.domain.productlist.ProductListModule;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface AppComponent
{
    void inject(BaseApplication baseApplication);

    CategoryComponent newCategoryComponent(CategoryModule categoryModule);

    ProductListComponent newProductListComponent(ProductListModule categoryModule);

    ProductDetailComponent newProductDetailComponent(ProductDetailModule categoryModule);

    CartComponent newCartComponent(CartModule cartModule);
}