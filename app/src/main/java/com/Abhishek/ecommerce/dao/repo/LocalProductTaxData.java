package com.Abhishek.ecommerce.dao.repo;

import com.Abhishek.ecommerce.database.AppDatabase;
import com.Abhishek.ecommerce.model.roomentities.ProductTax;

import java.util.List;

import javax.inject.Inject;

public class LocalProductTaxData implements DataSource<ProductTax>
{

    AppDatabase appDatabase;

    @Inject
    public LocalProductTaxData(AppDatabase appDatabase)
    {
        this.appDatabase = appDatabase;
    }

    @Override
    public void addItem(ProductTax productTax)
    {
        appDatabase.productTaxDataDao().insert(productTax);
    }

    @Override
    public void addItems(List<ProductTax> items)
    {
    }
}
