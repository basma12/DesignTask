package com.bmh.designtask.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.bmh.designtask.Adapter.WaitedAdapter;
import com.bmh.designtask.Model.Help;
import com.bmh.designtask.R;

import java.util.ArrayList;
import java.util.List;

public class WaitedFragment extends Fragment {
    List<Help> helpList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_waited, container, false);
        ListView listView = view.findViewById(R.id.lvWaited);
        listView.setAdapter(new WaitedAdapter(getActivity(), R.layout.adapter_item_waited, getHelpList()));

        return view;
    }

    private List<Help> getHelpList() {
        helpList = new ArrayList<>();
        helpList.add(new Help("اريد الذهاب الي المستشفي حالا وما عندي سيارة ممكن حد يوصلني", "فزعة سيارة", R.drawable.type_car, "رجال", 4, "منذ ساعتين"));

        helpList.add(new Help("بنات عندي عزومة وابي حد يساعدني", "فزعة أكل", R.drawable.type_food, "سيدات", 3, "منذ ساعة"));
        return helpList;
    }

}
