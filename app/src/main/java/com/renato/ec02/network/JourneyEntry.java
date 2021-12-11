package com.renato.ec02.network;
import android.net.Uri;

public class JourneyEntry {
    private static final String TAG=JourneyEntry.class.getSimpleName();
    public final String title;
    public final Uri dynamicUrl;
    public final String url;
    public final String price;
    public final String description;

    public JourneyEntry(String title, Uri dynamicUrl, String url, String price, String description) {
        this.title = title;
        this.dynamicUrl = dynamicUrl;
        this.url = url;
        this.price = price;
        this.description = description;
    }
}
