package com.Abhishek.ecommerce.domain.categorylist;

import dagger.Subcomponent;



@CategoryScope
@Subcomponent(modules = {CategoryModule.class})
public interface CategoryComponent
{
    void inject(CategoryListFragment categoryListFragment);
    void inject(SubCategoryListFragment subCategoryListFragment);

}