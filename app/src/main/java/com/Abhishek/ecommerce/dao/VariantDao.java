package com.Abhishek.ecommerce.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.Abhishek.ecommerce.model.roomentities.Variant;

import java.util.List;

import io.reactivex.Single;

@Dao
public interface VariantDao
{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Variant variant);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<Variant> variantList);

    @Query("SELECT * FROM Variant WHERE Variant.product_id=:productId")
    Single<List<Variant>> getProductVariant(int productId);
}
