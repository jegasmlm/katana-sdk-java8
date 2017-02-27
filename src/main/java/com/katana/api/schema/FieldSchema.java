package com.katana.api.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by juan on 3/01/17.
 */
public class FieldSchema {

    @JsonProperty("n")
    private String name;

    @JsonProperty("t")
    private String type;

    @JsonProperty("o")
    private boolean optional;

    public FieldSchema() {
        this.optional = false;
    }

    public FieldSchema(FieldSchema other) {
        this.name = other.name;
        this.type = other.type;
        this.optional = other.optional;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isOptional() {
        return optional;
    }

    public void setOptional(boolean optional) {
        this.optional = optional;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FieldSchema)) {
            return false;
        }

        FieldSchema that = (FieldSchema) o;

        if (isOptional() != that.isOptional()) {
            return false;
        }
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) {
            return false;
        }
        return getType() != null ? getType().equals(that.getType()) : that.getType() == null;

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (isOptional() ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FieldSchema{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", optional='" + optional + '\'' +
                '}';
    }
}
