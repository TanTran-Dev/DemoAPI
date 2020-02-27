package com.trantan.demoapi.presenter.detail_school;

import com.trantan.demoapi.api.IGetSchoolDetail;
import com.trantan.demoapi.api_client.APIClient;
import com.trantan.demoapi.model.response.ResponseBody;
import com.trantan.demoapi.model.response.SchoolDetail;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class DetailSchoolInteractor implements IDetailSchoolInteractor {
    @Override
    public void getDetailSchool(String id, Consumer<ResponseBody<SchoolDetail>> onSuccess,
                                Consumer<Throwable> onError) {
        Disposable disposable = APIClient.getInstance()
                .create(IGetSchoolDetail.class)
                .getDetailSchool(id)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(onSuccess, onError);
    }
}
