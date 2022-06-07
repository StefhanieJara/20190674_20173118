package com.example._20190674_20173118.Beans;

public class celebridadBean {
    private int actor_id;
    private String first_name;
    private String last_name;
    private int numero_pelis;
    private int numero_categoria;

    public int getNumero_pelis() {
        return numero_pelis;
    }

    public void setNumero_pelis(int numero_pelis) {
        this.numero_pelis = numero_pelis;
    }

    public int getNumero_categoria() {
        return numero_categoria;
    }

    public void setNumero_categoria(int numero_categoria) {
        this.numero_categoria = numero_categoria;
    }

    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
