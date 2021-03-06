package com.Abhishek.ecommerce.domain.categorylist;

import android.os.Bundle;
import android.view.Menu;

import com.Abhishek.ecommerce.BaseToolBarActivity;
import com.Abhishek.ecommerce.R;
import com.Abhishek.ecommerce.util.ActivityUtil;


public class CategoryListActivity extends BaseToolBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list);
        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        }
        ActivityUtil.replaceFragment(this, null, CategoryListFragment.newInstance(), false, R.id.content_frame);
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        if (getSupportActionBar() != null)
            getSupportActionBar().setTitle(R.string.app_name);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.app_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
