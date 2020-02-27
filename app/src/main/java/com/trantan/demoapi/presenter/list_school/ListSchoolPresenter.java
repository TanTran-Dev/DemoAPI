package com.trantan.demoapi.presenter.list_school;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.trantan.demoapi.model.request.SchoolFilterDto;
import com.trantan.demoapi.model.response.Page;
import com.trantan.demoapi.model.response.ResponseBody;
import com.trantan.demoapi.model.response.School;
import com.trantan.demoapi.view.list_school.IListSchoolView;

import io.reactivex.functions.Consumer;

public class ListSchoolPresenter implements IListSchoolPresenter {
    private Context context;
    private IListSchoolInteractor interactor;
    private IListSchoolView view;

    public ListSchoolPresenter(Context context, IListSchoolView view) {
        this.context = context;
        this.view = view;
        this.interactor = new ListSchoolInteractor();
    }

    @Override
    public void refreshSchool() {
        interactor.getSchool(null, null,
                0, 10, new SchoolFilterDto(),
                new Consumer<ResponseBody<Page<School>>>() {
                    @Override
                    public void accept(ResponseBody<Page<School>> pageResponseBody) throws Exception {
                        view.refreshSchool(pageResponseBody.getmData().getmItems());
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        Toast.makeText(context, "Error", Toast.LENGTH_LONG).show();
                        throwable.printStackTrace();
                    }
                });
    }

    @Override
    public void loadMoreSchool() {

    }
}
