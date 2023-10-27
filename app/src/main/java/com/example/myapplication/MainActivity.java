package com.example.myapplication;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import java.util.ArrayList;
import java.util.List;

import CryptoTrack.ApiClient;
import CryptoTrack.ApiService;
import CryptoTrack.BitcoinInfoResponse;
import CryptoTrack.CryptoCurrencyAdapter;
import CryptoTrack.CryptoCurrencyModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView currencyRV;
    private EditText searchEdt;
    private SwipeRefreshLayout swipeRefreshLayout;
    ApiService apiService;
    ApiClient apiClient;
    ArrayList<CryptoCurrencyModel> currencyModalArrayList;
    private CryptoCurrencyAdapter currencyRVAdapter;
    private String symbolTV, rateTV, nameTV;
    private ProgressBar loadingPB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchEdt = findViewById(R.id.idEdtCurrency);
        swipeRefreshLayout = findViewById(R.id.swipeRefreshLayout);
        //getData();
        loadingPB = findViewById(R.id.idPBLoading);
        currencyRV = findViewById(R.id.idRVcurrency);
        currencyModalArrayList = new ArrayList<>();
        currencyModalArrayList.add(new CryptoCurrencyModel("BNB","BNB",765.98));
        currencyModalArrayList.add(new CryptoCurrencyModel("Bitcoin","BTC",765.98));
        currencyModalArrayList.add(new CryptoCurrencyModel("Solana","SOL",765.98));
        currencyModalArrayList.add(new CryptoCurrencyModel("Ripple","$$$",765.98));
        currencyModalArrayList.add(new CryptoCurrencyModel("Pepe","$$$",765.98));
        currencyModalArrayList.add(new CryptoCurrencyModel("Etherum","$$$",765.98));
        currencyModalArrayList.add(new CryptoCurrencyModel("Gala","$$$",765.98));
        currencyModalArrayList.add(new CryptoCurrencyModel("Cardano","$$$",765.98));
        currencyModalArrayList.add(new CryptoCurrencyModel("Polygon","$$$",765.98));
        currencyModalArrayList.add(new CryptoCurrencyModel("Tron","$$$",765.98));
        currencyModalArrayList.add(new CryptoCurrencyModel("Golem","$$$",765.98));
        currencyModalArrayList.add(new CryptoCurrencyModel("Audius","$$$",765.98));
        currencyModalArrayList.add(new CryptoCurrencyModel("Nano","$$$",765.98));



        currencyRVAdapter = new CryptoCurrencyAdapter(currencyModalArrayList,this);
        currencyRV.setLayoutManager(new LinearLayoutManager(this));
        currencyRV.setAdapter(currencyRVAdapter);

                searchEdt.addTextChangedListener(new TextWatcher() {

                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                    }
                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                    }
                    @Override
                    public void afterTextChanged(Editable s) {
                        filter(s.toString());
                    }
                });
            }
            private void filter(String filter) {
                ArrayList<CryptoCurrencyModel> filteredlist = new ArrayList<>();
                for (CryptoCurrencyModel item : currencyModalArrayList) {
                    if (item.getName().toLowerCase().contains(filter.toLowerCase())) {
                        filteredlist.add(item);
                    }
                    swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
                        @Override
                        public void onRefresh() {
                            refreshContent();
                        }
                    });
                }
                if (filteredlist.isEmpty()) {
                    Toast.makeText(this, "No currency found..", Toast.LENGTH_SHORT).show();
                } else {
                    currencyRVAdapter.filterList(filteredlist);
                }
            }
    private void refreshContent() {
        swipeRefreshLayout.setRefreshing(false);
    }
    private void getData()
    {
        Log.e("String111","failed");
        Call<List<BitcoinInfoResponse>> call = apiService.getCoinById("btc-bitcoin");
        call.enqueue(new Callback<List<BitcoinInfoResponse>>() {
            @Override
            public void onResponse(Call<List<BitcoinInfoResponse>> call, Response<List<BitcoinInfoResponse>> response) {
                if (response.isSuccessful()) {
                     List<BitcoinInfoResponse> data = response.body();
                    Log.e("String ifffff","");
                    //currencyModalArrayList.add(new CryptoCurrencyModel(name, symbol, price));
                }
            }
            @Override
            public void onFailure(Call<List<BitcoinInfoResponse>> call, Throwable t) {

                System.out.println("String failure");
                Log.e("String","failed");
            }
        });
         }
}