package com.bmh.designtask.Adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bmh.designtask.Model.Help;
import com.bmh.designtask.R;

import java.util.List;

public class WaitedAdapter extends ArrayAdapter<Help> {
    Activity context;
    List<Help> helpList;

    public WaitedAdapter(@NonNull Activity context, int resource, @NonNull List<Help> objects) {
        super(context, resource, objects);
        this.context = context;
        this.helpList = objects;
    }

    @Override
    public int getCount() {
        return helpList.size();
    }

    @Nullable
    @Override
    public Help getItem(int position) {
        return helpList.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View view = inflater.inflate(R.layout.adapter_item_waited, null, true);
        ((TextView) view.findViewById(R.id.tvTitle)).setText(helpList.get(position).getTitle());
        ((TextView) view.findViewById(R.id.tvHelpType)).setText(helpList.get(position).getType());
        ((TextView) view.findViewById(R.id.tvHelpTime)).setText(helpList.get(position).getTime());
        ((TextView) view.findViewById(R.id.tvHelperGender)).setText(helpList.get(position).getHelperGender());
        ((TextView) view.findViewById(R.id.tvHelpersNum)).setText(String.valueOf(helpList.get(position).getHelpersNum()));
        ((ImageView) view.findViewById(R.id.ivTypeIcon)).setImageResource(helpList.get(position).getIcon());
        return view;
    }
}
