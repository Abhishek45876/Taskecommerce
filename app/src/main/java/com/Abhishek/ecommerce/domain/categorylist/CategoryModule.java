package com.Abhishek.ecommerce.domain.categorylist;

import com.Abhishek.ecommerce.api.ApiService;
import com.Abhishek.ecommerce.dao.repo.Repository;

import dagger.Module;
import dagger.Provides;


@Module
public class CategoryModule
{
    private final Contracts.View categoryView;

    public CategoryModule(Contracts.View categoryView)
    {
        this.categoryView = categoryView;
    }

    @Provides
    @CategoryScope
    CategoryListPresenter provideCategoryListPresenter(ApiService apiService, Repository repository)
    {
        return new CategoryListPresenter(categoryView, apiService,repository);
    }
}
