package com.example.chipuchet.authorization;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.chipuchet.R;
import com.google.android.material.chip.Chip;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class Registration extends Fragment {


    public Registration() {

    }


    void Register(String userName,String password,String password2,String login){
        RequestQueue volleyQueue = Volley.newRequestQueue(getContext());
       // String url1 = "https://clever-mix.ru/chipichapa/chipi_reg.php?userName="+userName+"&login="+login+"&password="+password+"&confirm_password="+password2 ;
        String url1 = "https://clever-mix.ru/chipichapa/chipi_reg.php?userName="+userName+"&login="+login+"&password="+password+"&confirm_password="+password2 ;
        JsonObjectRequest jsonRequest = new JsonObjectRequest(Request.Method.GET, url1, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {


                    if (response.getInt("success") == 1) {

                    }



                    // LoadHistory(currentDateandTime,currentDateandTime);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        volleyQueue.add(jsonRequest);


    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_registration, container, false);
    }

}