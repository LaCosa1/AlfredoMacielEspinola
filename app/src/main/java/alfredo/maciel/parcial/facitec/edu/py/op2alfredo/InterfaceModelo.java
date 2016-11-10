package alfredo.maciel.parcial.facitec.edu.py.op2alfredo;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by FSociety on 09/11/2016.
 */
public interface InterfaceModelo {



    @GET("/servicio/posts.json")
    void ObtenerModelo(Callback<ClaseModelo> callback);




}

