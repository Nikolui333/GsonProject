package com.semenov.gsonproject;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Quote {

    @SerializedName("id")
    @Expose
    public Integer id;
    @SerializedName("dialogue")
    @Expose
    public Boolean dialogue;
    @SerializedName("private")
    @Expose
    public Boolean _private;
    @SerializedName("tags")
    @Expose
    public List<Object> tags = null;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("favorites_count")
    @Expose
    public Integer favoritesCount;
    @SerializedName("upvotes_count")
    @Expose
    public Integer upvotesCount;
    @SerializedName("downvotes_count")
    @Expose
    public Integer downvotesCount;
    @SerializedName("author")
    @Expose
    public String author;
    @SerializedName("author_permalink")
    @Expose
    public String authorPermalink;
    @SerializedName("body")
    @Expose
    public String body;

}
