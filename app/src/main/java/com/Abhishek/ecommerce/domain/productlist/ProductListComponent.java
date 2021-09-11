package com.Abhishek.ecommerce.domain.productlist;

import dagger.Subcomponent;



@ProductListScope
@Subcomponent(modules = {ProductListModule.class})
public interface ProductListComponent
{
    void inject(ProductListFragment productListFragment);
}