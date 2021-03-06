package com.Abhishek.ecommerce.dao.repo;

import com.Abhishek.ecommerce.database.AppDatabase;
import com.Abhishek.ecommerce.model.roomentities.Variant;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

public class LocalVariantData implements DataSource<Variant>
{
    AppDatabase appDatabase;

    @Inject
    public LocalVariantData(AppDatabase appDatabase)
    {
        this.appDatabase = appDatabase;
    }

    @Override
    public void addItem(Variant variant)
    {
        appDatabase.variantDataDao().insert(variant);
    }

    @Override
    public void addItems(List<Variant> variantList)
    {
    }

    public Single<List<Variant>> getProductVariant(int productId)
    {
       return appDatabase.variantDataDao().getProductVariant(productId);
    }
}
