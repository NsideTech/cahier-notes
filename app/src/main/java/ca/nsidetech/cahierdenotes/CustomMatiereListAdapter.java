package ca.nsidetech.cahierdenotes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;


class CustomMatiereListAdapter extends BaseAdapter {
    private List<Matiere> matieres;
    LayoutInflater mInflator;

    public CustomMatiereListAdapter(Context context, List<Matiere> matieres) {
        this.matieres = matieres;
        mInflator = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return matieres.size();
    }

    @Override
    public Object getItem(int index) {
        return matieres.get(index);
    }

    @Override
    public long getItemId(int index) {
        return index;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = mInflator.inflate(R.layout.activity_main, null);

        //Récupération des éléments de la vue du book list item


        Matiere selectedMatiere = matieres.get(position);

        //En fonction de la position qui est réçue en paramètre, nous allons chercher le nom et le prix a cette position


        return view;
    }
}
