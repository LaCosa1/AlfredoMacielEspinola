package alfredo.maciel.parcial.facitec.edu.py.op2alfredo;

import android.content.Context;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.oss.datahelper.DataBaseManager;

/**
 * Created by FSociety on 09/11/2016.
 */
public class DBA {

        private  static final  String DB_NAME= "Modelo";
        private  static final int  DB_VERSION= 1;

        public static void aVoid(Context context) {
            DataBaseManager.init(context,DB_NAME, DB_VERSION);
            ConnectionSource source= DataBaseManager.getInstance().getHelper().getConnectionSource();

            try {
                TableUtils.createTableIfNotExists(source,ClaseModelo.class);


            } catch (java.sql.SQLException e) {
                e.printStackTrace();
            }
        }

        public static Dao<ClaseModelo, Integer> claseModelos() {
            try {
                return DataBaseManager.getInstance().getHelper().getDao(ClaseModelo.class);
            } catch (java.sql.SQLException e) {
                e.printStackTrace();
                return null;

            }
        }

    }
