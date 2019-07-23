package com.pluralsight.factory.website;

import com.pluralsight.factory.page.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.create();
    }

    public List<Page> getPages() {
        return pages;
    }

    public abstract void create();

}
