package com.trantan.demoapi.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.trantan.demoapi.R;
import com.trantan.demoapi.adapter.OnItemClickListener;
import com.trantan.demoapi.adapter.SchoolAdapter;
import com.trantan.demoapi.constant.StringConstant;
import com.trantan.demoapi.model.response.School;
import com.trantan.demoapi.presenter.list_school.IListSchoolPresenter;
import com.trantan.demoapi.presenter.list_school.ListSchoolPresenter;
import com.trantan.demoapi.view.activity.DetailActivity;
import com.trantan.demoapi.view.list_school.IListSchoolView;

import java.util.ArrayList;
import java.util.List;

public class FragmentContent extends Fragment implements IListSchoolView, OnItemClickListener {

    private IListSchoolPresenter presenter;

    private RecyclerView rclSchool;
    private SchoolAdapter adapter;
    private List<School> listSchool;

    private View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_content, container, false);
        presenter = new ListSchoolPresenter(getContext(), this);

        presenter.refreshSchool();

        init();
        initView();
        return view;
    }

    private void init() {
        listSchool = new ArrayList<>();
    }

    private void initView() {
        rclSchool = view.findViewById(R.id.rclSchool);
        adapter = new SchoolAdapter(listSchool, this);
        rclSchool.setLayoutManager(new LinearLayoutManager(getContext()));
        rclSchool.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Intent intent = new Intent(getContext(), DetailActivity.class);
        intent.putExtra(StringConstant.KEY_SCHOOL_ID, listSchool.get(position).getmId());
        startActivity(intent);
    }

    @Override
    public void refreshSchool(List<School> schools) {
        listSchool.clear();
        listSchool.addAll(schools);
        adapter.notifyDataSetChanged();
    }
}
