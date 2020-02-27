package com.trantan.demoapi.api;

import com.trantan.demoapi.model.response.Page;
import com.trantan.demoapi.model.response.ResponseBody;
import com.trantan.demoapi.model.response.School;
import com.trantan.demoapi.model.request.SchoolFilterDto;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface IGetSchool {
    @POST("api/schools/query")
    Observable<ResponseBody<Page<School>>> getSchool(
            @Query("sortBy") List<String> sortBy, @Query("sortType") List<String> sortType,
            @Query("pageIndex") int pageIndex, @Query("pageSize") int pageSize,
            @Body() SchoolFilterDto schoolFilterDto);


}
