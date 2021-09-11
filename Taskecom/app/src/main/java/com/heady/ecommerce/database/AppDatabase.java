package com.Abhishek.ecommerce.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.Abhishek.ecommerce.dao.CartDao;
import com.Abhishek.ecommerce.dao.CategoryDao;
import com.Abhishek.ecommerce.dao.ParentChildCategoryMappingDao;
import com.Abhishek.ecommerce.dao.ProductDao;
import com.Abhishek.ecommerce.dao.ProductRankingDao;
import com.Abhishek.ecommerce.dao.ProductTaxDao;
import com.Abhishek.ecommerce.dao.TaxDao;
import com.Abhishek.ecommerce.dao.VariantDao;
import com.Abhishek.ecommerce.model.roomentities.Cart;
import com.Abhishek.ecommerce.model.roomentities.Category;
import com.Abhishek.ecommerce.model.roomentities.ParentChildCategoryMapping;
import com.Abhishek.ecommerce.model.roomentities.Product;
import com.Abhishek.ecommerce.model.roomentities.ProductRanking;
import com.Abhishek.ecommerce.model.roomentities.ProductTax;
import com.Abhishek.ecommerce.model.roomentities.Tax;
import com.Abhishek.ecommerce.model.roomentities.Variant;

/**
 * Room database for storing api response data.
 *
 * @author sandeepD
 */
@Database(entities = {Category.class, Product.class, Tax.class, Variant.class, ProductTax.class,
        ProductRanking.class, ParentChildCategoryMapping.class, Cart.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase
{
    public abstract CategoryDao categoryDataDao();

    public abstract ProductDao productDataDao();

    public abstract TaxDao taxDataDao();

    public abstract VariantDao variantDataDao();

    public abstract ProductTaxDao productTaxDataDao();

    public abstract ProductRankingDao productRankingDataDao();

    public abstract ParentChildCategoryMappingDao parentChildCategoryMappingDataDao();

    public abstract CartDao cartDao();
}
