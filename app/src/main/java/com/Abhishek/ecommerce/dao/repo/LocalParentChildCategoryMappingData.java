package com.Abhishek.ecommerce.dao.repo;

import com.Abhishek.ecommerce.database.AppDatabase;
import com.Abhishek.ecommerce.model.roomentities.ParentChildCategoryMapping;

import java.util.List;

import javax.inject.Inject;


public class LocalParentChildCategoryMappingData implements DataSource<ParentChildCategoryMapping>
{

    AppDatabase appDatabase;

    @Inject
    public LocalParentChildCategoryMappingData(AppDatabase appDatabase)
    {
        this.appDatabase = appDatabase;
    }

    @Override
    public void addItem(ParentChildCategoryMapping parentChildCategoryMapping)
    {
        appDatabase.parentChildCategoryMappingDataDao().insert(parentChildCategoryMapping);
    }

    @Override
    public void addItems(List<ParentChildCategoryMapping> items)
    {
    }
}
