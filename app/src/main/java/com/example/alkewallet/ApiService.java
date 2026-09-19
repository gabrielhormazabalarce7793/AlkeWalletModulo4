package com.example.alkewallet;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Body;

public interface ApiService {

    // Ruta de ejemplo para obtener las transacciones desde la API REST
    @GET("transactions") // (Reemplaza con la ruta real que te entregue la documentación de tu API)
    Call<List<TransactionResponse>> getTransactions();

    // Ruta de ejemplo para enviar una nueva transacción mediante POST
    @POST("transactions")
    Call<TransactionResponse> createTransaction(@Body TransactionResponse transaction);
}