package com.example.user.rssreader.Model;

import java.util.List;

/**
 * Created by User on 18.04.2018.
 */

public class RssObject
{
    public String status;
    public Feed feed;
    public List<Item> items;

    public RssObject(String status, Feed feed, List<Item> items) {
        this.status = status;
        this.feed = feed;
        this.items = items;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Feed getFeed() {
        return feed;
    }

    public void setFeed(Feed feed) {
        this.feed = feed;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
