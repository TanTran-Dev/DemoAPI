package com.trantan.demoapi.presenter.list_school;

import com.trantan.demoapi.model.request.SchoolFilterDto;
import com.trantan.demoapi.model.response.Page;
import com.trantan.demoapi.model.response.ResponseBody;
import com.trantan.demoapi.model.response.School;

import java.util.List;

import io.reactivex.functions.Consumer;

public interface IListSchoolInteractor {
    void getSchool(List<String> sortBy, List<String> sortType,
                   int pageIndex, int pageSize,
                   SchoolFilterDto schoolFilterDto, Consumer<ResponseBody<Page<School>>> onSuccess,
                   Consumer<Throwable> onError);
}
