package com.Abhishek.ecommerce.domain.productlist;

import com.Abhishek.ecommerce.model.roomentities.relation.ProductDetails;

import java.util.List;


public interface Contracts
{

    interface View
    {
        void initView();

        void populateData(List<ProductDetails> productDetailsList);

        void onCategoryItemSelected(ProductDetails productDetails);

        void onError(Throwable throwable);

        void showLoading();

        void hideLoading();

        void sortProduct(int criteria);

        List<ProductDetails> getProductList();
    }

    interface Presenter
    {
        void init();

        void fetchProductByCategory(int categoryId);

        void sortByMostViewed();

        void sortByMostOrdered();

        void sortByMostShared();

        void showLoading();

        void hideLoading();

        void onDetach();

    }
}
