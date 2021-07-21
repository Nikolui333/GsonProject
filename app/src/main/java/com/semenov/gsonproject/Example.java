
package com.semenov.gsonproject;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Example {

    @SerializedName("qotd_date")
    @Expose
    public String qotdDate;
    @SerializedName("quote")
    @Expose
    public Quote quote;

}
