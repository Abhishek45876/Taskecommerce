package com.Abhishek.ecommerce.domain.categorylist.adapter;

import com.Abhishek.ecommerce.model.response.CategoryDTO;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;


public class CategoryGroup extends ExpandableGroup<CategoryDTO>
{
    private CategoryDTO parentCategory;

    public CategoryGroup(CategoryDTO categoryDTO, List<CategoryDTO> items)
    {
        super(categoryDTO.getName(), items);
        parentCategory = categoryDTO;
    }

    public CategoryDTO getParentCategory()
    {
        return parentCategory;
    }
}