package com.mz.movies.utils;


import org.springframework.data.domain.Pageable;

public class Utils {

    public static Pageable createPageableObject(Integer pageSize, Integer pageNumber) {
        Pageable pageable;
        if (pageSize != null && pageNumber != null) {
            pageable = Pageable.ofSize(pageSize).withPage(pageNumber);
        } else {
            pageable = Pageable.unpaged();
        }
        return pageable;
    }

}
