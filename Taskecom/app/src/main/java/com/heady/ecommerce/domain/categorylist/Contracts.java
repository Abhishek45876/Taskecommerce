package com.Abhishek.ecommerce.domain.categorylist;

import com.Abhishek.ecommerce.domain.categorylist.adapter.CategoryGroup;
import com.Abhishek.ecommerce.model.response.CategoryDTO;

import java.util.List;

/**
 * Contract for view and presenter
 *
 * @author SandeepD
 */
public interface Contracts
{

    interface View
    {
        void initView();

        void populateData(List<CategoryDTO> categoryDTOList);

        void onCategoryItemSelected(CategoryDTO category);

        void onError(Throwable throwable);

        void showLoading();

        void hideLoading();

        void populateSubCategories(List<CategoryGroup> categoryGroups);
    }

    interface Presenter
    {
        void init();

        void fetchCategoryAndProductData();

        void showLoading();

        void hideLoading();
        void onDetach();

    }
}
