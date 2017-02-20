package com.example.irwancannady.segalatester;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Models {

    @SerializedName("admin")
    @Expose
    private Model admin;

    /**
     *
     * @return
     * The admin
     */
    public Model getAdmin() {
        return admin;
    }

    /**
     *
     * @param admin
     * The admin
     */
    public void setAdmin(Model admin) {
        this.admin = admin;
    }

}
