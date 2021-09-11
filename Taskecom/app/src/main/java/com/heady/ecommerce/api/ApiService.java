package com.Abhishek.ecommerce.api;

import com.Abhishek.ecommerce.model.response.MasterdataDTO;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * API service for api call.
 *
 * @author SandeepD
 */
public interface ApiService
{
    @GET("/json")
	Observable<MasterdataDTO> getCategoryAndProductDetails();
}
