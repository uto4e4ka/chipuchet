package com.example.chipuchet.authorization;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.chipuchet.MainActivity;
import com.example.chipuchet.R;

import org.json.JSONException;
import org.json.JSONObject;


public class login extends Fragment {

MainActivity m2;
    public login(MainActivity m2) {
       this.m2 = m2;
    }


    void Login(String password,String login){
        RequestQueue volleyQueue = Volley.newRequestQueue(getContext());
        // String url1 = "https://clever-mix.ru/chipichapa/chipi_reg.php?userName="+userName+"&login="+login+"&password="+password+"&confirm_password="+password2 ;
        String url1 = "https://clever-mix.ru/chipichapa/chipi_login.php?user="+login+"&password="+password;
        JsonObjectRequest jsonRequest = new JsonObjectRequest(Request.Method.GET, url1, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {


                    if (response.getInt("success") == 1) {
                        m2.OpenMenu();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }
}