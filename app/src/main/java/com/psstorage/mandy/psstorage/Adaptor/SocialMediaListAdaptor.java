package com.psstorage.mandy.psstorage.Adaptor;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.psstorage.mandy.psstorage.Model.CustomCell;
import com.psstorage.mandy.psstorage.Model.SocialMediaCell;
import com.psstorage.mandy.psstorage.R;
import com.psstorage.mandy.psstorage.SocialMediaFragment;

/**
 * Created by maxch on 12/29/2017.
 */

public class SocialMediaListAdaptor extends ArrayAdapter<SocialMediaCell> {

    Context context;
    int layoutResourceId;
    SocialMediaCell data[] = null;

    public SocialMediaListAdaptor(Context context, int layoutResourceId, SocialMediaCell[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        WeatherHolder holder = null;

        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new WeatherHolder();
            holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
            holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);

            row.setTag(holder);
        }
        else
        {
            holder = (WeatherHolder)row.getTag();
        }

        SocialMediaCell item = data[position];
        holder.txtTitle.setText(item.name);
        int resId = context.getResources().getIdentifier(item.icon, "mipmap", context.getPackageName());
        holder.imgIcon.setImageResource(resId);

        return row;
    }

    static class WeatherHolder
    {
        ImageView imgIcon;
        TextView txtTitle;
    }
}
