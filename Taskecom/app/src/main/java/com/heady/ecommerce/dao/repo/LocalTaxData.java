package com.Abhishek.ecommerce.dao.repo;

import com.Abhishek.ecommerce.database.AppDatabase;
import com.Abhishek.ecommerce.model.roomentities.Tax;

import java.util.List;

import javax.inject.Inject;
/**
 * local data source.
 * @author SandeepD
 */
public class LocalTaxData implements DataSource<Tax>
{

    AppDatabase appDatabase;

    @Inject
    public LocalTaxData(AppDatabase appDatabase)
    {
        this.appDatabase = appDatabase;
    }

    @Override
    public void addItem(Tax tax)
    {
        appDatabase.taxDataDao().insert(tax);
    }

    @Override
    public void addItems(List<Tax> items)
    {

    }
}
