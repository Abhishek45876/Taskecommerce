package com.Abhishek.ecommerce.domain.cartdetails;

import dagger.Subcomponent;



@CartScope
@Subcomponent(modules = {CartModule.class})
public interface CartComponent
{
    void inject(CartFragment cartFragment);

}