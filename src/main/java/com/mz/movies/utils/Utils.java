package com.mz.movies.utils;


import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class Utils {

    public static Pageable createPageableObject(Integer pageNumber, Integer pageSize, String sortBy) {

        Pageable pageable;

        if (pageNumber != null && pageSize != null && sortBy != null) {
            pageable = PageRequest.of(pageNumber, pageSize, Sort.by(sortBy));
        } else {
            pageable = Pageable.unpaged();
        }




        return pageable;
    }


}
