package com.example.solidsamples.model.java;

/**
 * Created by pieter.snyman on 10/22/17.
 */

public final class SomeDataEntity {
    private String name;
    private String surname;
    private String somethingElse;

    public SomeDataEntity(final String name, final String surname, final String somethingElse) {
        this.name = name;
        this.surname = surname;
        this.somethingElse = somethingElse;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSomethingElse() {
        return somethingElse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SomeDataEntity that = (SomeDataEntity) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        return somethingElse != null ? somethingElse.equals(that.somethingElse) : that.somethingElse == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (somethingElse != null ? somethingElse.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SomeDataEntity{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", somethingElse='" + somethingElse + '\'' +
                '}';
    }
}
