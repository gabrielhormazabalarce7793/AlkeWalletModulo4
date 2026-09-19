package com.example.alkewallet;

import com.google.gson.annotations.SerializedName;

public class TransactionResponse {

    @SerializedName("id")
    private long id;

    @SerializedName("description")
    private String description;

    @SerializedName("amount")
    private double amount;

    @SerializedName("date")
    private String date;

    // Getters
    public long getId() { return id; }
    public String getDescription() { return description; }
    public double getAmount() { return amount; }
    public String getDate() { return date; }
}