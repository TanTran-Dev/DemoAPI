package com.trantan.demoapi.api;

import com.trantan.demoapi.model.response.ResponseBody;
import com.trantan.demoapi.model.response.SchoolDetail;


import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IGetSchoolDetail {
    @GET("api/schools/{id}")

    Observable<ResponseBody<SchoolDetail>> getDetailSchool(
            @Path("id") String id
    );
}
