package alfredo.maciel.parcial.facitec.edu.py.op2alfredo;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;

/**
 * Created by FSociety on 09/11/2016.
 */
public class ClaseModeloDao {


    public void Creacion(ClaseModelo c){
        try {
            DBA.claseModelos().create(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void Borrar(ClaseModelo c){
        try {
          DBA.claseModelos().delete(c);
        }catch (SQLException e){
            e.getStackTrace();
        }

    }




    }
