package com.friendstime.apps.calex.model;

import android.content.Context;

import com.codepath.oauth.OAuthBaseClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.scribe.builder.api.Api;
import org.scribe.model.Token;

/*
 *
 * This is the object responsible for communicating with a REST API.
 * Specify the constants below to change the API being communicated with.
 * See a full list of supported API classes:
 *   https://github.com/fernandezpablo85/scribe-java/tree/master/src/main/java/org/scribe/builder/api
 * Key and Secret are provided by the developer site for the given API i.e dev.twitter.com
 * Add methods for each relevant endpoint in the API.
 *
 * NOTE: You may want to rename this object based on the service i.e TwitterClient or FlickrClient
 *
 */
public class YelpClient extends OAuthBaseClient {
    public static final Class<? extends Api> REST_API_CLASS = YelpApi2.class; // Change this
    public static final String REST_URL = "http://api.yelp.com/v2"; // Change this, base API URL
    public static final String REST_CONSUMER_KEY = "MxNonLF2lD83jfXQMGLw8A";       // Change this
    public static final String TOKEN = "OT5v-diXkRRM3UOTJLwJmx2di2mBb5-b";
    public static final String TOKEN_SECRET = "vvXjz2JauAUufUBJMgAF6GFdlbs";
    public static final String REST_CONSUMER_SECRET = "yP4Rz7U5vdNRTtIM7H92blRb2gs"; // Change this
    public static final String REST_CALLBACK_URL = "oauth://ftyelp"; // Change this (here and in manifest)

    public YelpClient(Context context) {
        super(context, REST_API_CLASS, REST_URL, REST_CONSUMER_KEY, REST_CONSUMER_SECRET, REST_CALLBACK_URL);
        this.client.setAccessToken(new Token(TOKEN, TOKEN_SECRET));
    }

    public void search(String term, String location, AsyncHttpResponseHandler handler) {
        // http://api.yelp.com/v2/search?term=food&location=San+Francisco
        String apiUrl = getApiUrl("search");
        RequestParams params = new RequestParams();
        params.put("term", term);
        params.put("location", location);
        client.get(apiUrl, params, handler);
    }


    /* 1. Define the endpoint URL with getApiUrl and pass a relative path to the endpoint
     * 	  i.e getApiUrl("statuses/home_timeline.json");
     * 2. Define the parameters to pass to the request (query or body)
     *    i.e RequestParams params = new RequestParams("foo", "bar");
     * 3. Define the request method and make a call to the client
     *    i.e client.get(apiUrl, params, handler);
     *    i.e client.post(apiUrl, params, handler);
     */
}