package com.Abhishek.ecommerce.domain.productdetails;

import com.Abhishek.ecommerce.model.response.VariantDTO;
import com.Abhishek.ecommerce.model.roomentities.Variant;
import com.Abhishek.ecommerce.model.roomentities.relation.ProductDetails;

import java.util.ArrayList;
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

        void onError(Throwable throwable);

        void showLoading();

        void hideLoading();

        void onSuccess();

        void onVariantSelected(VariantDTO variantDTO);

        void onVariantFetched(ArrayList<VariantDTO> variants);

        void onAddError(Throwable e);
    }

    interface Presenter
    {
        void init();

        void showLoading();

        void hideLoading();

        void addtoCart(ProductDetails productDetails);
        void onDetach();

    }
}
