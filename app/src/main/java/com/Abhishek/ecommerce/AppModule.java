package com.Abhishek.ecommerce;

import android.arch.persistence.room.Room;

import com.Abhishek.ecommerce.dao.CategoryDao;
import com.Abhishek.ecommerce.dao.repo.LocalCartData;
import com.Abhishek.ecommerce.dao.repo.LocalCategoryData;
import com.Abhishek.ecommerce.dao.repo.LocalParentChildCategoryMappingData;
import com.Abhishek.ecommerce.dao.repo.LocalProductData;
import com.Abhishek.ecommerce.dao.repo.LocalProductRankingData;
import com.Abhishek.ecommerce.dao.repo.LocalProductTaxData;
import com.Abhishek.ecommerce.dao.repo.LocalTaxData;
import com.Abhishek.ecommerce.dao.repo.LocalVariantData;
import com.Abhishek.ecommerce.dao.repo.Repository;
import com.Abhishek.ecommerce.dao.repo.RepositoryImpl;
import com.Abhishek.ecommerce.database.AppDatabase;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class AppModule
{
    private final BaseApplication application;

    public AppModule(BaseApplication application)
    {
        this.application = application;
    }

    @Singleton
    @Provides
    Repository provideDatabaseRepository(LocalCategoryData localCategoryData,
                                         LocalParentChildCategoryMappingData localParentChildCategoryMappingData,
                                         LocalProductData localProductData,
                                         LocalProductRankingData localProductRankingData,
                                         LocalProductTaxData localProductTaxData,
                                         LocalTaxData localTaxData,
                                         LocalVariantData localVariantData,
                                         LocalCartData localCartData)
    {
        return new RepositoryImpl(localCategoryData, localParentChildCategoryMappingData,
                localProductData, localProductRankingData, localProductTaxData, localTaxData, localVariantData, localCartData);
    }

    @Singleton
    @Provides
    LocalCategoryData providesLocalCategoryDao(AppDatabase appDatabase)
    {
        return new LocalCategoryData(appDatabase);
    }

    @Singleton
    @Provides
    LocalParentChildCategoryMappingData providesLocalParentChildCategoryMappingCategoryDao(AppDatabase appDatabase)
    {
        return new LocalParentChildCategoryMappingData(appDatabase);
    }

    @Singleton
    @Provides
    LocalProductData providesLocalProductDao(AppDatabase appDatabase)
    {
        return new LocalProductData(appDatabase);
    }

    @Singleton
    @Provides
    LocalProductRankingData providesLocalProductRankingDao(AppDatabase appDatabase)
    {
        return new LocalProductRankingData(appDatabase);
    }

    @Singleton
    @Provides
    LocalProductTaxData providesLocalProductTaxDao(AppDatabase appDatabase)
    {
        return new LocalProductTaxData(appDatabase);
    }

    @Singleton
    @Provides
    LocalTaxData providesLocalTaxDao(AppDatabase appDatabase)
    {
        return new LocalTaxData(appDatabase);
    }

    @Singleton
    @Provides
    LocalVariantData providesLocalVariantDao(AppDatabase appDatabase)
    {
        return new LocalVariantData(appDatabase);
    }

    @Singleton
    @Provides
    LocalCartData providesLocalCartDao(AppDatabase appDatabase)
    {
        return new LocalCartData(appDatabase);
    }

    @Singleton
    @Provides
    CategoryDao providesCategoryDao(AppDatabase appDatabase)
    {
        return appDatabase.categoryDataDao();
    }

    @Provides
    @Singleton
    BaseApplication providesApplication()
    {
        return application;
    }

    @Provides
    @Singleton
    AppDatabase providesAppDatabase()
    {
        return Room.databaseBuilder(application, AppDatabase.class, "eComData").build();
    }
}
