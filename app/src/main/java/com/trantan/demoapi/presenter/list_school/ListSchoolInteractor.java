package com.trantan.demoapi.presenter.list_school;

import com.trantan.demoapi.api.IGetSchool;
import com.trantan.demoapi.api_client.APIClient;
import com.trantan.demoapi.model.request.SchoolFilterDto;
import com.trantan.demoapi.model.response.Page;
import com.trantan.demoapi.model.response.ResponseBody;
import com.trantan.demoapi.model.response.School;

import java.util.List;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class ListSchoolInteractor implements IListSchoolInteractor {
    @Override
    public void getSchool(List<String> sortBy, List<String> sortType,
                          int pageIndex, int pageSize,
                          SchoolFilterDto filter,
                          Consumer<ResponseBody<Page<School>>> onSuccess,
                          Consumer<Throwable> onError) {

       Disposable disposable = APIClient.getInstance()
                .create(IGetSchool.class)
                .getSchool(sortBy, sortType, pageIndex, pageSize, filter)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(onSuccess, onError);
    }
}
