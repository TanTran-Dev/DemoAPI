package com.trantan.demoapi.presenter.detail_school;

import com.trantan.demoapi.model.response.ResponseBody;
import com.trantan.demoapi.model.response.SchoolDetail;

import io.reactivex.functions.Consumer;

public interface IDetailSchoolInteractor {
    void getDetailSchool(String id, Consumer<ResponseBody<SchoolDetail>> onSuccess,
                         Consumer<Throwable> onError);
}
