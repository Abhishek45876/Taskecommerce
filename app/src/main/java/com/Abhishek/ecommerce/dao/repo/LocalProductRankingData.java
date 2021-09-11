package com.Abhishek.ecommerce.dao.repo;

import com.Abhishek.ecommerce.database.AppDatabase;
import com.Abhishek.ecommerce.model.roomentities.ProductRanking;

import java.util.List;

import javax.inject.Inject;

public class LocalProductRankingData implements DataSource<ProductRanking>
{

    AppDatabase appDatabase;

    @Inject
    public LocalProductRankingData(AppDatabase appDatabase)
    {
        this.appDatabase = appDatabase;
    }

    @Override
    public void addItem(ProductRanking productRanking)
    {
        appDatabase.productRankingDataDao().insert(productRanking);
    }

    @Override
    public void addItems(List<ProductRanking> items)
    {

    }
}
