package com.Abhishek.ecommerce.dao.repo;


public interface Repository
{
    LocalCategoryData categoryData();

    LocalParentChildCategoryMappingData parentChildCategoryMappingData();

    LocalProductData productData();

    LocalProductRankingData productRankingData();

    LocalProductTaxData productTaxData();

    LocalTaxData taxData();

    LocalVariantData variantData();

    LocalCartData cardData();
}
