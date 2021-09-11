package com.Abhishek.ecommerce.domain.productdetails;

import com.Abhishek.ecommerce.dao.repo.Repository;

import dagger.Module;
import dagger.Provides;


@Module
public class ProductDetailModule
{

    private final Contracts.View productListView;

    public ProductDetailModule(Contracts.View productListView)
    {
        this.productListView = productListView;
    }

    @Provides
    @ProductDetailScope
    ProductDetailPresenter provideProductDetailPresenter(Repository repository)
    {
        return new ProductDetailPresenter(productListView, repository);
    }
}
