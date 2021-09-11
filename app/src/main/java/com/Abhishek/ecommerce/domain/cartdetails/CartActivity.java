package com.Abhishek.ecommerce.domain.cartdetails;

import android.os.Bundle;

import com.Abhishek.ecommerce.BaseToolBarActivity;
import com.Abhishek.ecommerce.R;
import com.Abhishek.ecommerce.util.ActivityUtil;

public class CartActivity extends BaseToolBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        ActivityUtil.replaceFragment(this, null, CartFragment.newInstance(), false, R.id.content_frame);

    }

    @Override
    protected void onResume()
    {
        super.onResume();
        if (getSupportActionBar() != null)
            getSupportActionBar().setTitle(R.string.shopping_cart);
    }

}
