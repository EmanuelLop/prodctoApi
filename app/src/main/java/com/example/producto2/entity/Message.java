package com.example.producto2.entity;

public class Message {
    private int code;
    private String status;
    private String copyright;
    private String attributionText;
    private String attributionHTML;
    private int etag;
    private Datos data;

    public int getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getAttributionText() {
        return attributionText;
    }

    public String getAttributionHTML() {
        return attributionHTML;
    }

    public int getEtag() {
        return etag;
    }

    public Datos getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Message{" +
                "code=" + code +
                ", status='" + status + '\'' +
                ", copyright='" + copyright + '\'' +
                ", attributionText='" + attributionText + '\'' +
                ", attributionHTML='" + attributionHTML + '\'' +
                ", etag=" + etag +
                ", data=" + data +
                '}';
    }
}
