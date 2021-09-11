package com.Abhishek.ecommerce.domain.productlist;

import com.Abhishek.ecommerce.dao.repo.Repository;

import dagger.Module;
import dagger.Provides;


@Module
public class ProductListModule
{

    private final Contracts.View productListView;

    public ProductListModule(Contracts.View productListView)
    {
        this.productListView = productListView;
    }

    @Provides
    @ProductListScope
    ProductListPresenter provideProductListPresenter( Repository repository)
    {
        return new ProductListPresenter(productListView, repository);
    }
}
