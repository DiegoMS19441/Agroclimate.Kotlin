import edu.curso.teste.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {

    // Endpoint para obter a previsão do tempo atual (current weather)
    @GET("weather")
    fun getCurrentWeather(
        @Query("São Paulo") cityName: String,       // Nome da cidade
        @Query("cbfca3cdf260d96d8b77e1e40a1c895f") apiKey: String,     // Chave da API
        @Query("°C") units: String = "metric" // Unidade de medida: Celsius por padrão
    ): Call<WeatherResponse>
}
