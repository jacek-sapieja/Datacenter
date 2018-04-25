package com.pwc.datacenter.stores;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "datacenter")
public class PersonalInformation {

    @Id
    private String id;
    private String sfEntityId;
    private String sfEntityType;
    private String state;

    public PersonalInformation() {}

    public PersonalInformation(String id, String sfEntityId) {

        this.setId(id);
        this.setSfEntityId(sfEntityId);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSfEntityId() {
        return sfEntityId;
    }

    public void setSfEntityId(String sfEntityId) {
        this.sfEntityId = sfEntityId;
    }

    public String getSfEntityType() {
        return sfEntityType;
    }

    public void setSfEntityType(String sfEntityType) {
        this.sfEntityType = sfEntityType;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
