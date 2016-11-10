package alfredo.maciel.parcial.facitec.edu.py.op2alfredo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit.RestAdapter;

/**
 * Created by FSociety on 09/11/2016.
 */
public class Adaptador extends BaseAdapter{

    private List<ClaseModelo> claseModeloList;
    private Context context;


        public Adaptador( List<ClaseModelo> claseModelos,Context context) {
            this.claseModeloList= claseModelos;
            this.context = context;


        }
    @Override
    public int getCount() {
        return claseModeloList.size();
    }

    @Override
    public Object getItem(int position) {
        return claseModeloList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.item_layout, null);
        }


        ClaseModelo c = this.claseModeloList.get(position);
        TextView textViewNombre = (TextView) v.findViewById(R.id.textViewNombre);
        TextView textViewDescri = (TextView) v.findViewById(R.id.textViewDescripcion);
        ImageView imageViewImagen = (ImageView) v.findViewById(R.id.imageViewAvatar);


        textViewNombre.setText(c.getUsername());
        textViewDescri.setText(c.getText());
        Picasso.with(this.context).load(c.getAvatar()).into(imageViewImagen);

        return v;


    }
}