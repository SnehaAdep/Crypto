package CryptoTrack;


import java.util.List;

import retrofit2.Call;
        import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("coins")
    Call<List<BitcoinInfoResponse>> getCoinById(@Path("id") String coin_id);

}