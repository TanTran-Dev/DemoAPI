package com.trantan.demoapi.presenter.detail_school;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.trantan.demoapi.model.request.RegionDto;
import com.trantan.demoapi.model.request.SchoolTypeDto;
import com.trantan.demoapi.model.response.ResponseBody;
import com.trantan.demoapi.model.response.SchoolDetail;
import com.trantan.demoapi.view.detail_school.IDetailSchoolView;

import io.reactivex.functions.Consumer;

public class DetailSchoolPresenter implements IDetailSchoolPresenter {
    private Context context;
    private IDetailSchoolInteractor interactor;
    private IDetailSchoolView view;

    private SchoolDetail detail;

    public DetailSchoolPresenter(Context context, IDetailSchoolView view) {
        this.context = context;
        this.view = view;
        this.interactor = new DetailSchoolInteractor();
    }

    @Override
    public void refreshInfo(String id) {
        interactor.getDetailSchool(id,
                new Consumer<ResponseBody<SchoolDetail>>() {
                    @Override
                    public void accept(ResponseBody<SchoolDetail> schoolDetailResponseBody) throws Exception {

                        Log.i("BBB", "accept: " + schoolDetailResponseBody.getmData().toString());

                        //Add data for object
                        String id = schoolDetailResponseBody.getmData().getmId();
                        String name = schoolDetailResponseBody.getmData().getmName();
                        String shortName = schoolDetailResponseBody.getmData().getmShortName();
                        int educatedScale = schoolDetailResponseBody.getmData().getmEducatedScale();
                        String website = schoolDetailResponseBody.getmData().getmWebsite();
                        String email = schoolDetailResponseBody.getmData().getmEmail();
                        String phone = schoolDetailResponseBody.getmData().getmPhone();
                        String historyDesc = schoolDetailResponseBody.getmData().getmHistoryDesc();
                        String achievementDesc = schoolDetailResponseBody.getmData().getmAchievementDesc();
                        String studyEnvDesc = schoolDetailResponseBody.getmData().getmStudyEnvDesc();
                        String devStrategyDesc = schoolDetailResponseBody.getmData().getmDevStrategyDesc();
                        String lecturersDesc = schoolDetailResponseBody.getmData().getmLecturersDesc();
                        String logoUrl = schoolDetailResponseBody.getmData().getmLogoUrl();
                        String coverUrl = schoolDetailResponseBody.getmData().getmCoverUrl();
                        RegionDto regionDto = schoolDetailResponseBody.getmData().getmRegionDto();
                        String address = schoolDetailResponseBody.getmData().getmAddress();
                        double lat = schoolDetailResponseBody.getmData().getmLat();
                        double lon = schoolDetailResponseBody.getmData().getmLon();
                        SchoolTypeDto schoolTypeDto = schoolDetailResponseBody.getmData().getmSchoolTypeDto();
                        long createdDate = schoolDetailResponseBody.getmData().getmCreatedDate();
                        String connectState = schoolDetailResponseBody.getmData().getmConnectState();

                        detail = new SchoolDetail(id, name, shortName, educatedScale, website, email
                                , phone, historyDesc, achievementDesc, studyEnvDesc, devStrategyDesc,
                                lecturersDesc, logoUrl, coverUrl, regionDto, address,
                                lat, lon, schoolTypeDto, createdDate, connectState);

                        view.refreshSchool(schoolDetailResponseBody.getmData());
                    }
                },
                new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        Toast.makeText(context, "Error", Toast.LENGTH_LONG).show();
                        throwable.printStackTrace();
                    }
                });
    }
}
