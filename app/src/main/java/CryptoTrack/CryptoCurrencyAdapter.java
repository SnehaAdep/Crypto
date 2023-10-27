package CryptoTrack;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.text.DecimalFormat;
import java.util.ArrayList;


public class CryptoCurrencyAdapter extends RecyclerView.Adapter<CryptoCurrencyAdapter.CurrencyViewholder> {
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    private ArrayList<CryptoCurrencyModel> currencyModals;
    private Context context;

    public CryptoCurrencyAdapter(ArrayList<CryptoCurrencyModel> currencyModals, Context context) {
        this.currencyModals = currencyModals;
        this.context = context;
    }

    // below is the method to filter our list.
    public void filterList(ArrayList<CryptoCurrencyModel> filterlist) {

        currencyModals = filterlist;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CryptoCurrencyAdapter.CurrencyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.currency_rv_item, parent, false);
        return new CryptoCurrencyAdapter.CurrencyViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CryptoCurrencyAdapter.CurrencyViewholder holder, int position) {

        CryptoCurrencyModel modal = currencyModals.get(position);
        holder.nameTV.setText(modal.getName());
        holder.rateTV.setText("$ " + df2.format(modal.getPrice()));
        holder.symbolTV.setText(modal.getSymbol());
    }

    @Override
    public int getItemCount() {
        return currencyModals.size();
    }


    public class CurrencyViewholder extends RecyclerView.ViewHolder {
        private TextView symbolTV, rateTV, nameTV;

        public CurrencyViewholder(@NonNull View itemView) {
            super(itemView);
            symbolTV = itemView.findViewById(R.id.idTVSymbol);
            rateTV = itemView.findViewById(R.id.idTVRate);
            nameTV = itemView.findViewById(R.id.idTVName);
        }
    }
}

