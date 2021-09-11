package com.Abhishek.ecommerce.domain.productdetails;

import dagger.Subcomponent;



@ProductDetailScope
@Subcomponent(modules = {ProductDetailModule.class})
public interface ProductDetailComponent
{
    void inject(ProductDetailFragment productDetailFragment);
}