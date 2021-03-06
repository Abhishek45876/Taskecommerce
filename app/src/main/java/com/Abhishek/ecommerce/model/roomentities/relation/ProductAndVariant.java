package com.Abhishek.ecommerce.model.roomentities.relation;

import android.arch.persistence.room.Embedded;
import android.arch.persistence.room.Relation;

import com.Abhishek.ecommerce.model.roomentities.Product;
import com.Abhishek.ecommerce.model.roomentities.Variant;

import java.util.List;


public class ProductAndVariant
{
    @Embedded
    public Product product;

    @Relation(parentColumn = "id", entityColumn = "product_id")
    public List<Variant> variants;
}
