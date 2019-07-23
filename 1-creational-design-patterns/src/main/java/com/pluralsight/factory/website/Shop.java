package com.pluralsight.factory.website;

import com.pluralsight.factory.page.CartPage;
import com.pluralsight.factory.page.ItemPage;
import com.pluralsight.factory.page.SearchPage;

public class Shop extends Website {

    @Override
    public void create() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }

}
