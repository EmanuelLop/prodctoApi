package com.example.producto2.entity;

public class Datos {
    private int offset;
    private int limit;
    private int total;
    private int count;
    private Results results;

    public int getOffset() {
        return offset;
    }

    public int getLimit() {
        return limit;
    }

    public int getTotal() {
        return total;
    }

    public int getCount() {
        return count;
    }

    public Results getResults() {
        return results;
    }

    @Override
    public String toString() {
        return "Datos{" +
                "offset=" + offset +
                ", limit=" + limit +
                ", total=" + total +
                ", count=" + count +
                ", results=" + results +
                '}';
    }
}
