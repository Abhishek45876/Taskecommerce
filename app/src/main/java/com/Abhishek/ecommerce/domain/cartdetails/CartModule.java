package com.Abhishek.ecommerce.domain.cartdetails;

import com.Abhishek.ecommerce.dao.repo.Repository;

import dagger.Module;
import dagger.Provides;



@Module
public class CartModule
{

    private final Contracts.View cartView;

    public CartModule(Contracts.View cartView)
    {
        this.cartView = cartView;
    }

    @Provides
    @CartScope
    CartPresenter provideCartPresenter(Repository repository)
    {
        return new CartPresenter(cartView, repository);
    }
}
