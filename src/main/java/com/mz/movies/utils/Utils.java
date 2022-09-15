package com.mz.movies.utils;


import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class Utils {

    public static Pageable createPageableObject(Integer pageSize, Integer pageNumber) {
        Pageable pageable = PageRequest.of(0,4, Sort.by("title"));
//        if (pageSize != null && pageNumber != null) {
//            pageable = Pageable.ofSize(pageSize).withPage(pageNumber);
//        } else {
//            pageable = Pageable.unpaged();
//        }
        return pageable;
    }


}
