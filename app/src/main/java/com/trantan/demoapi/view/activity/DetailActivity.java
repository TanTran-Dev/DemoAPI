package com.trantan.demoapi.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.trantan.demoapi.R;
import com.trantan.demoapi.constant.StringConstant;
import com.trantan.demoapi.model.response.SchoolDetail;
import com.trantan.demoapi.presenter.detail_school.DetailSchoolPresenter;
import com.trantan.demoapi.view.detail_school.IDetailSchoolView;

public class DetailActivity extends AppCompatActivity implements IDetailSchoolView {
    private DetailSchoolPresenter presenter;
    private SchoolDetail detail;

    private ImageView imgLogo;
    private TextView txtId;
    private TextView txtName;
    private TextView txtShortName;
    private TextView txtEducatedScale;
    private TextView txtWebsite;
    private TextView txtEmail;
    private TextView txtPhone;
    private TextView txtHistoryDesc;
    private TextView txtAchievementDesc;
    private TextView txtStudyEnvDesc;
    private TextView txtDevStrategyDesc;
    private TextView txtLecturersDesc;
    private TextView txtLogoUrl;
    private TextView txtCoverUrl;
    private TextView txtRegion;
    private TextView txtAddress;
    private TextView txtLat;
    private TextView txtLon;
    private TextView txtSchoolType;
    private TextView txtCreatedDate;
    private TextView txtConnectState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent data = getIntent();
        presenter = new DetailSchoolPresenter(this, this);
        presenter.refreshInfo(data.getStringExtra(StringConstant.KEY_SCHOOL_ID));

        initView();

    }

    private void initView() {
        imgLogo = findViewById(R.id.imgLogoDetail);
        txtId = findViewById(R.id.txtId);
        txtName = findViewById(R.id.txtNameDetail);
        txtShortName = findViewById(R.id.txtShortNameDetail);
        txtEducatedScale = findViewById(R.id.txtEducatedScale);
        txtWebsite = findViewById(R.id.txtWebsite);
        txtEmail = findViewById(R.id.txtEmail);
        txtPhone = findViewById(R.id.txtPhone);
        txtHistoryDesc = findViewById(R.id.txtHistoryDesc);
        txtAchievementDesc = findViewById(R.id.txtAchievementDesc);
        txtStudyEnvDesc = findViewById(R.id.txtStudyEnvDesc);
        txtDevStrategyDesc = findViewById(R.id.txtDevStrateryDesc);
        txtLecturersDesc = findViewById(R.id.txtLecturersDesc);
        txtLogoUrl = findViewById(R.id.txtLogoUrl);
        txtCoverUrl = findViewById(R.id.txtCoverUrl);
        txtRegion = findViewById(R.id.txtRegion);
        txtAddress = findViewById(R.id.txtAddress);
        txtLat = findViewById(R.id.txtLat);
        txtLon = findViewById(R.id.txtLon);
        txtSchoolType = findViewById(R.id.txtSchooType);
        txtCreatedDate = findViewById(R.id.txtCreatedDate);
        txtConnectState = findViewById(R.id.txtConnectState);
    }


    @Override
    public void refreshSchool(SchoolDetail detail) {
        Glide.with(this).load(detail.getmLogoUrl()).into(imgLogo);

        txtId.setText(detail.getmId());
        txtName.setText(detail.getmName());
        txtShortName.setText(detail.getmShortName());
        txtEducatedScale.setText(String.valueOf(detail.getmEducatedScale()));
        txtWebsite.setText(detail.getmWebsite());
        txtEmail.setText(detail.getmEmail());
        txtPhone.setText(detail.getmPhone());
        txtHistoryDesc.setText(detail.getmHistoryDesc());
        txtAchievementDesc.setText(detail.getmAchievementDesc());
        txtStudyEnvDesc.setText(detail.getmStudyEnvDesc());
        txtDevStrategyDesc.setText(detail.getmDevStrategyDesc());
        txtLecturersDesc.setText(detail.getmLecturersDesc());
        txtLogoUrl.setText(detail.getmLogoUrl());
        txtCoverUrl.setText(detail.getmCoverUrl());
        txtRegion.setText(detail.getmRegionDto().getmName());
        txtAddress.setText(detail.getmAddress());
        txtLat.setText(String.valueOf(detail.getmLat()));
        txtLon.setText((String.valueOf(detail.getmLon())));
        txtSchoolType.setText(detail.getmSchoolTypeDto().getmName());
        txtCreatedDate.setText(String.valueOf(detail.getmCreatedDate()));
        txtConnectState.setText(detail.getmConnectState());
    }
}
